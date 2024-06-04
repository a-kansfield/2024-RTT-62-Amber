package demo.java;

import java.sql.Connection;
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://[ip]]/classic_models";
        String user = "dev";
        System.out.println("-------------- MySQL JDBC Connection Demo ---------------");

        String selectSQL = "SELECT * FROM employees";
        Statement stmt = connection.createStatement();
    }
}
