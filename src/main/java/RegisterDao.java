import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    private String dbUrl="jdbc:mysql://localhost:3306/navi";
    private  String dbUname = "navi";
    private String dbPassword="12345";
    private String dbDriver="com.mysql.jdbc.Driver";
    		  
    		
    		public void loadDriver(String dbDriver)
    		{  
    			
    			try {
    				Class.forName(dbDriver);
    			} catch (ClassNotFoundException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		
    		public Connection getConnection()
    		{
    			Connection con = null;
    			try {
    				con = (Connection)DriverManager.getConnection(dbUrl, dbUname, dbPassword);
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			return con;
    		}
    		public  String insert1(Member member)
    		{
    			

    			loadDriver(dbDriver);
    			Connection con = getConnection();
    			String result = "Data entered successfully";
    			String sql = "insert into member values(?,?,?,?,?,?,?)";
    			
    			PreparedStatement ps;
    			try {
    			ps = con.prepareStatement(sql);
    			ps.setString(1, member.getFirstname());
    			
    			ps.setString(3, member.getLastname());
    			ps.setString(4, member.getGender());
    			ps.setString(5, member.getEmail());
    			ps.setString(6, member.getBirthday());
    			ps.setString(7, member.getPin());
    			ps.executeUpdate();
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    				result = "Data not entered";
    			}
    			return result;
    		}

    	}