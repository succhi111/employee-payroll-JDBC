import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayrollDB {
    public static void main(String[] args) {

        /**
         * jdbc connection with sql
         */
        String jdbcURL = "jdbc:mysql://localhost:3306/employeepayrolljdbc";
        /**
         * sql username
         */
        String userName = "root";
        /**
         * sql password
         */
        String password = "badshah";
        listDrivers();
        try {
            System.out.println("Connecting to Database: " + jdbcURL);
            Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection is successful !!1: " + connection);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * create a method name as listDrivers
     */
    private static void listDrivers() {
        /**
         * Enumeration :-
         *
         *  An object that implements the Enumeration interface generates a series of elements, one at a time.
         *  Successive calls to the nextElement method return successive elements of the series.
         */
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println("  " + driverClass.getClass().getName());
        }
    }
}
