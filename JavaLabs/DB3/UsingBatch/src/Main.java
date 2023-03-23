import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Stack;

import com.mysql.jdbc.Driver;
public class Main {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String user = "root";
            String password = "";
//            create table
//            CREATE TABLE `emp` (
//  `id` int(11) NOT NULL,
//  `f_name` varchar(60) DEFAULT NULL,
//  `gender` varchar(60) DEFAULT NULL,
//  `vacation` int(11) DEFAULT 30,
//  `age` int(11) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatoturial",user,password);
//            String query= new String("INSERT INTO emp (id,f_name,gender,vacation,age) VALUES (?,?,?,?,?)");
//            PreparedStatement prstmt = con.prepareStatement(query);
//            for (int i=1;i<6;i++) {
//                prstmt.setInt(1, i);
//                prstmt.setString(2, "mohamed");
//                prstmt.setString(3, "male");
//                prstmt.setInt(4, 30);
//                prstmt.setInt(5, 50);
//                prstmt.execute();
//            }
//            prstmt.close();
//            update
            con.setAutoCommit(false);
            String query2= new String("UPDATE emp SET vacation = ? where age > 45");
            PreparedStatement updateVacation = con.prepareStatement(query2);
            updateVacation.setInt(1,45);
            updateVacation.addBatch();
            String query3 = new String("UPDATE emp SET f_name = ? where gender = 'male' ");
            PreparedStatement updateMale = con.prepareStatement(query3);
            updateMale.setString(1,"MR/mohammed");
            updateMale.addBatch();
            String query4 = new String("UPDATE emp SET f_name = ? where gender = 'female' ");
            PreparedStatement updateFemale = con.prepareStatement(query4);
            updateFemale.setString(1,"MRs/aaaaaa");
            updateFemale.addBatch();
            updateVacation.executeBatch();
            updateMale.executeBatch();
            updateFemale.executeBatch();
            con.commit();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}