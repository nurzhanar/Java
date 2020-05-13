package com.company;
import java.sql.*;
class Main {
    public static void main(String[] args) {
        read(1);
        insertuser();
        update(1);
        delete(2);

    }
    public static void read(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4oop", "root", "");
            //Connection con = DriverManager.getConnection("jdbc:mysql://host:port/database_name", "user", "password");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from userinformation where id =" + id);
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertuser(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4oop", "root", "");
            //Connection con = DriverManager.getConnection("jdbc:mysql://host:port/database_name", "user", "password");

            String query = ("INSERT INTO userinformation"+"(id,name,surname,grade) VALUES"+"(?,?,?,?);");

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt    (1, 2);
            preparedStmt.setString (2, "Barney");
            preparedStmt.setString (3, "Rubble");
            preparedStmt.setInt    (4, 5);
            preparedStmt.execute();
            System.out.println("Record inserted successfully");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }



    public static void update(int id) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4oop", "root", "");
            //Connection con = DriverManager.getConnection("jdbc:mysql://host:port/database_name", "user", "password");

            // create the java mysql update preparedstatement
            String query = "UPDATE userinformation set name=? "+"WHERE id = ?";


            PreparedStatement preparedStmt = conn.prepareStatement(query);

            preparedStmt.setString(1, "Nurzhan");
            preparedStmt.setInt    (2, 1);

            preparedStmt.executeUpdate();
            System.out.println("Record updated successfully");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }



    public static void delete(int id) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4oop", "root", "");
            //Connection con = DriverManager.getConnection("jdbc:mysql://host:port/database_name", "user", "password");


            String sql = "delete from userinformation where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 2);
            stmt.executeUpdate();
            conn.close();
            System.out.println("Record deleted successfully");
    }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
}
}