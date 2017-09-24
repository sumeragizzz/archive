package examples.h2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDataCreator {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/sample")) {
            PreparedStatement statement = connection.prepareStatement("insert into sample values (?, ?)");
            statement.setBigDecimal(1, BigDecimal.valueOf(1));
            statement.setString(2, "AAA");
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
