package study.tobyspring.dao;

import study.tobyspring.domain.User;

import java.sql.*;

public class UserDao {
    private SimpleConnectionMaker simpleConnectionMaker;

    public UserDao() {
         simpleConnectionMaker = new SimpleConnectionMaker();
    }

    public void addUser(User user) {
        try {
            Connection c = simpleConnectionMaker.makeNewConnection();
            PreparedStatement ps = c.prepareStatement(
                    "INSERT INTO USERS(ID,NAME,PASSWORD) VALUES(?,?,?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();

            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error : " + e.getMessage());
        }
    }

    public User getUser(String id) {
        try {
            Connection c = simpleConnectionMaker.makeNewConnection();
            PreparedStatement ps = c.prepareStatement(
                    "SELECT * FROM USERS WHERE ID =?");
            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();
            rs.next();
            User user = new User();
            user.setId(rs.getString("ID"));
            user.setName(rs.getString("NAME"));
            user.setPassword(rs.getString("PASSWORD"));

            rs.close();
            ps.close();
            c.close();

            return user;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error : " + e.getMessage());
            return null;
        }
    }

}
