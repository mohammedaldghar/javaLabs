import java.io.FileOutputStream;
import java.sql.*;
import javax.sql.rowset.WebRowSet;

public class Main {
            public static void main(String[] args) {
                String url = "jdbc:mysql://localhost:3306/javatoturial";
                String username = "root";
                String password = "";
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                try {
                    // Open a connection to the database
                    conn = DriverManager.getConnection(url, username, password);
                    stmt = conn.createStatement();
                    // Execute the SQL query
                    String sql = "SELECT * FROM employees";
                    rs = stmt.executeQuery(sql);
                    // Create a WebRowSet object
                    WebRowSet rowSet = javax.sql.rowset.RowSetProvider.newFactory().createWebRowSet();
                    // Set the data source and populate the rowset
                    rowSet.setDataSourceName("rs");
                    rowSet.populate(rs);
                    // Output the contents of the rowset to the console
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnCount = rsmd.getColumnCount();
                    rowSet.beforeFirst();
                    while (rowSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.print(rowSet.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                    // Save the rowset to an XML file
                    String filename = "output.xml";
                    FileOutputStream fos = new FileOutputStream(filename);
                    rowSet.writeXml(fos);
                    System.out.println("Data saved to " + filename);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try { rs.close(); } catch (Exception e) { }
                    try { stmt.close(); } catch (Exception e) { }
                    try { conn.close(); } catch (Exception e) { }
                }
            }
        }


