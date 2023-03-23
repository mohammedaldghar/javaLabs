import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String userName="root";
            String pass="Dghar@123";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB?autoReconnect=true&useSSL=false",userName,pass);
            Statement st= con.createStatement();
            String query="select * from Student";
            ResultSet result = st.executeQuery(query);
            while (result.next()){
                System.out.println("ID: "+result.getString(1)+" Name: "+result.getString(2));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}