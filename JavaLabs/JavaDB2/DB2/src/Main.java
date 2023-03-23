import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("db.properties");
            props.setProperty("MYSQL_DB_URL", "jdbc:mysql://localhost:3306/author");
            props.setProperty("MYSQL_DB_USERNAME", "omar");
            props.setProperty("MYSQL_DB_PASSWORD", "P@ssword123");
            props.store(output, null);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        try {
            java.sql.Connection con = getmyDataSource().getConnection();
            if (con != null) {
                testDataSource();
                System.out.println("coonn done");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DataSource getmyDataSource() {
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDS = null;
        try {
            fis = new FileInputStream("db.properties");
            props.load(fis);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
            mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
            mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mysqlDS;
    }

    private static void testDataSource() {
        DataSource ds = null;
        ds = Main.getmyDataSource();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from author");
            while (rs.next()) {
                System.out.println("author ID=" + rs.getInt("id") + ",author=" + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}