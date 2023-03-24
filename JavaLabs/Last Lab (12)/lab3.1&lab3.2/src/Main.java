import java.sql.*;
import javax.sql.rowset.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        // Set up database connection properties
        String url = "jdbc:mysql://localhost:3306/javatoturial";
        String username = "root";
        String password = "";
        RowSetFactory factory = RowSetProvider.newFactory();
        JdbcRowSet rowSet = factory.createJdbcRowSet();

        rowSet.setUrl(url);
        rowSet.setUsername(username);
        rowSet.setPassword(password);

        String sql = "SELECT * FROM employees";
        rowSet.setCommand(sql);

        rowSet.execute();
        while (rowSet.next()) {
            int id = rowSet.getInt("id");
            String firstName = rowSet.getString("firstName");
            String lastName = rowSet.getString("lastName");
            System.out.println(id + "\t" + firstName + "\t" + lastName);
        }

//        cashed rowset
        CachedRowSet cachedRowSet = factory.createCachedRowSet();
        cachedRowSet.setUrl(url);
        cachedRowSet.setUsername(username);
        cachedRowSet.setPassword(password);
        String sql2 = "SELECT * FROM employees";
        cachedRowSet.setCommand(sql2);
        cachedRowSet.execute();
        while (cachedRowSet.next()) {
            int id = cachedRowSet.getInt("id");
            String firstName = cachedRowSet.getString("firstName");
            String lastName = cachedRowSet.getString("lastName");
            String email = cachedRowSet.getString("email");
            System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + email + "\t" );
        }
//        insert
        cachedRowSet.moveToInsertRow();
        cachedRowSet.updateInt("id", 9);
        cachedRowSet.updateString("firstName", "John");
        cachedRowSet.updateString("lastName", "Doe");
        cachedRowSet.updateString("email", "johndoe@gmail.com");
        cachedRowSet.updateInt("phone", 5551234);
        cachedRowSet.insertRow();
//        delete
        cachedRowSet.last();
        cachedRowSet.deleteRow();
//        accept changes
        cachedRowSet.acceptChanges();
        cachedRowSet.close();
    }
}