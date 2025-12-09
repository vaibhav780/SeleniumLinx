import java.sql.*;

public class Dbconnect {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employees"; // Replace with your database name
            String user = "root"; // Replace with your MySQL username
            String password = "Mysql@1234"; // Replace with your MySQL password
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database!");

            // 3. Create a Statement
            statement = connection.createStatement();

            // 4. Execute a query
            resultSet = statement.executeQuery("SELECT emp_no, first_name FROM employees limit 10"); // Replace with your table and columns

            // 5. Process the ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("emp_no");
                String name = resultSet.getString("first_name");
                System.out.println("No: " + id + ", Name: " + name);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
