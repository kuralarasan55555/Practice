package Database;
import java.sql.*;
public class JDBC{

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?characterEncoding=latin1","root","Kuralarasan12345..");
			Statement s=co.createStatement();
			s.executeUpdate("update car set name='Hyndai' where year=2002");
			ResultSet r=s.executeQuery("select * from car");
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
			}
			co.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}