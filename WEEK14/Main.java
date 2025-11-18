import java.sql.*;
public class Main {
    public static void main(String[] args) {
        // Connection details
        String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
        String user = "javauser";
        String password = "javapass";

        try {
            // 1️⃣ Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Connect to MySQL
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the database!");

            Statement stmt = conn.createStatement();

            // 3️⃣ Create table if not exists
            String createTable = """
                CREATE TABLE IF NOT EXISTS Employee (
                    emp_id INT PRIMARY KEY,
                    name VARCHAR(50),
                    age INT,
                    salary DOUBLE
                )
                """;
            stmt.executeUpdate(createTable);
            System.out.println("✅ Employee table ready.");

            // 4️⃣ Clear existing data (optional)
            stmt.executeUpdate("DELETE FROM Employee");

            // 5️⃣ Insert 5 employee records
            String insertSQL = """
                INSERT INTO Employee (emp_id, name, age, salary) VALUES
                (1, 'Alice', 25, 50000),
                (2, 'Bob', 30, 60000),
                (3, 'Charlie', 28, 55000),
                (4, 'David', 35, 70000),
                (5, 'Eve', 26, 52000)
                """;
            stmt.executeUpdate(insertSQL);
            System.out.println("✅ 5 employees inserted.");

            // 6️⃣ Delete two employees
            String deleteSQL = "DELETE FROM Employee WHERE emp_id IN (1, 3)";
            int rowsDeleted = stmt.executeUpdate(deleteSQL);
            System.out.println("✅ " + rowsDeleted + " employees deleted.");

            // 7️⃣ Show remaining employees
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
            System.out.println("\nRemaining Employees:");
            while (rs.next()) {
                System.out.printf("%d | %s | %d | %.2f%n",
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("salary"));
            }

            // 8️⃣ Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("\n✅ Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


