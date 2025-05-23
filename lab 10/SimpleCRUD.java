
import java.sql.*;

public class SimpleCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver (optional in newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
                System.out.println("Connected to MySQL.");

                // Insert two employees
                String insertSQL1 = "INSERT INTO employee (eid, name, address, department) VALUES (101, 'Ajita', 'Lalitpur', 'IT')";
                String insertSQL2 = "INSERT INTO employee (eid, name, address, department) VALUES (102, 'Ranjita', 'Butwal', 'HR')";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(insertSQL1);
                    System.out.println("✔ Inserted employee Ajita.");

                    stmt.executeUpdate(insertSQL2);
                    System.out.println("✔ Inserted employee Ranjita.");
                }

                // Display employee records
                System.out.println("\nEmployee Table:");
                String selectSQL = "SELECT * FROM employee";
                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {

                    while (rs.next()) {
                        System.out.printf("%d | %s | %s | %s%n",
                                rs.getInt("eid"),
                                rs.getString("name"),
                                rs.getString("address"),
                                rs.getString("department"));
                    }
                }

                // Update Ajita's address
                String updateSQL = "UPDATE employee SET address = 'Nepal' WHERE eid = 101";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(updateSQL);
                    System.out.println("\nUpdated Ajita's address.");
                }

                // Delete Ajita
                String deleteSQL = "DELETE FROM employee WHERE eid = 101";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(deleteSQL);
                    System.out.println("🗑 Deleted employee Ajita.");
                }

            } catch (SQLException e) {
                System.err.println("Database error:");
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found:");
            e.printStackTrace();
        }
    }
}
