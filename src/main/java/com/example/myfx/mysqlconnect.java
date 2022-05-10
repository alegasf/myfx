//package com.example.myfx;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
///**
// * @author Merkulov A
// */
//public class mysqlconnect {
//    Connection connection = null;
//
//    public static Connection ConnectDb() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = (Connection)
//            return connection;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//
//    }
//
//    public static ObservableList<Users> getDatausers(){
//        Connection conn = ConnectDb();
//        ObservableList<Users> list = FXCollections.observableArrayList();
//        try {
//            PreparedStatement ps = conn.prepareStatement("select * from users");
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()){
//                list.add(new Users(Integer.parseInt(rs.getString("id")), rs.getString("firstname"), rs.getString("lastname"), rs.getString("type")));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//
//}
