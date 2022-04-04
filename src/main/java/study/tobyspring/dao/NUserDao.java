package study.tobyspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao{
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mariadb://localhost:3306/tobySpring", "tobySpring", "tobySpring");
    }
}
