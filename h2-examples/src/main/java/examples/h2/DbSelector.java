package examples.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbSelector {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/sample")) {
            PreparedStatement statement = connection.prepareStatement("select * from sample");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.format("%s : %s%n", resultSet.getBigDecimal(1).toPlainString(), resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
