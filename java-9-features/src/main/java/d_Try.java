import util.MyAutoclasable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class d_Try {
    public static void main(String[] args) {

        try (MyAutoclasable mac = new MyAutoclasable()) {
            mac.doStuff();
        }
    }


    public void loadDataFromDBJ7() throws SQLException {
        Connection dbCon = DriverManager.getConnection("url", "user", "password");

        try (ResultSet rs = dbCon.createStatement().executeQuery("select * from emp")) {

            while (rs.next()) {
                System.out.println("In loadDataFromDB() =====>>>>>>>>>>>> " + rs.getString(1));
            }

        } catch (SQLException e) {
            System.out.println("Exception occurs while reading the data from DB ->" + e.getMessage());

        } finally {
            if (null != dbCon)
                dbCon.close();
        }
    }

    public void loadDataFromDB() throws SQLException {
        Connection dbCon = DriverManager.getConnection("url", "user", "password");

        try (dbCon; ResultSet rs = dbCon.createStatement().executeQuery("select * from emp")) {
            while (rs.next()) {
                System.out.println("In loadDataFromDB() =====>>>>>>>>>>>> " + rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Exception occurs while reading the data from DB ->" + e.getMessage());
        }
    }

}
