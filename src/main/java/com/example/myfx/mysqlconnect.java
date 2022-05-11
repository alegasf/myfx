package com.example.myfx;

/**
 * @author Merkulov A
 */

import java.sql.*;

public class mysqlconnect extends Configs2 {
    Connection dbConnection2;

    public Connection getDbConnection2() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost2 + ":"
                + dbPort2 + "/" + dbName2;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection2 = DriverManager.getConnection(connectionString, dbUser2, dbPass2);

        return dbConnection2;
    }

    public void addUser(Users users2) {
        String insert = "INSERT INTO " + Const2.USERS2_TABLE + "("
                + Const2.USERS2_FIRSTNAME + "," + Const2.USERS2_LASTNAME + "," + Const2.USERS2_TYPE + "," + Const2.USERS2_ID + ")" +
                "VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection2().prepareStatement(insert);
            preparedStatement.setString(1, users2.getFirstname());
            preparedStatement.setString(2, users2.getLastname());
            preparedStatement.setString(3, users2.getType());
            preparedStatement.setString(4, users2.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Prepared_Statement exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception");
        }
    }

    public ResultSet getUser(Users users2) {
        ResultSet resultSet = null;

        String select = "SELECT * FROM " + Const2.USERS2_TABLE + " WHERE " +
                Const2.USERS2_FIRSTNAME + "=? AND " + Const2.USERS2_LASTNAME + "=? AND " + Const2.USERS2_TYPE + "=? AND " + Const2.USERS2_ID + "=?";

        try {
            PreparedStatement preparedStatement = getDbConnection2().prepareStatement(select);
            preparedStatement.setString(1, users2.getFirstname());
            preparedStatement.setString(2, users2.getLastname());
            preparedStatement.setString(3, users2.getType());
            preparedStatement.setString(4, users2.getId());

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Prepared_Statement exception x000003");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception x000003");
        }

        return resultSet;
    }
}
