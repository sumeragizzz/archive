package examples.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbDefiner {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/sample")) {
            PreparedStatement statement = connection.prepareStatement("create table sample (id decimal, value varchar)");
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
