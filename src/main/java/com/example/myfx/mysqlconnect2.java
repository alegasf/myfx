package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class mysqlconnect2 extends Configs3 {
    static Connection dbConnection3;

    public static Connection getDbConnection3() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost3 + ":"
                + dbPort3 + "/" + dbName3;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection3 = DriverManager.getConnection(connectionString, dbUser3, dbPass3);

        return dbConnection3;
    }

    public void addUser(Warehouse warehouse) {
        String insert = "INSERT INTO " + Const3.WAREHOUSE_TABLE + "("
                + Const3.WAREHOUSE_NAME + "," + Const3.WAREHOUSE_AMOUNT + "," + Const3.WAREHOUSE_TYPE + "," + Const3.WAREHOUSE_COST + ")" +
                "VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection3().prepareStatement(insert);
            preparedStatement.setString(1, warehouse.getName());
            preparedStatement.setString(2, warehouse.getAmount());
            preparedStatement.setString(3, warehouse.getType());
            preparedStatement.setString(4, warehouse.getCost());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Неверный ввод данных");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception");
        }
    }

    public static ObservableList<Warehouse> getDataWarehouse() throws SQLException, ClassNotFoundException {
        Connection connection = getDbConnection3();

        ObservableList<Warehouse> list = FXCollections.observableArrayList();

        PreparedStatement ps = connection.prepareStatement("select * from warehouse");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new Warehouse(rs.getString("name"), rs.getString("amount"),
                    rs.getString("type"), rs.getString("cost")));
        }
        return list;
    }
}
