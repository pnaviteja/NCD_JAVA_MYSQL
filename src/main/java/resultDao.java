import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class resultDao {

	
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
    		public  String insert1(Result result)
    		{
    			

    			loadDriver(dbDriver);
    			Connection con = getConnection();
    			String result = "Data entered successfully";
    			String sql = "insert into result values(?,?)";
    			
    			PreparedStatement ps;
    			try {
    			ps = con.prepareStatement(sql);
    			ps.setString(1, member.getScore());
    			
    			ps.setString(3, member.getScreening());
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    				result = "Data not entered";
    			}
    			return result;
    		}

    	}
    			

    		
