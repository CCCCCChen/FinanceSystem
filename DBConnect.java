import java.sql.*;

public class DBConnect 
{
	static Connection conn;
	
	public DBConnect()
	{
		// TODO Auto-generated method stub   
		String driver = "com.mysql.jdbc.Driver";// ����������        
	    String url = "jdbc:mysql://127.0.0.1:3307/test";// URLָ��Ҫ���ʵ����ݿ���scutcs                 
		String user = "root";// MySQL����ʱ���û���     
		String password = "T28Z6b";// MySQL����ʱ������           
	    try 
	    {             // ������������            
	    	Class.forName(driver);
	    	Connection conn = DriverManager.getConnection(url, user, password); // �������ݿ�            
    		if(!conn.isClosed())  System.out.println("Succeeded connecting to the Database!");
	    	Statement statement = conn.createStatement();// statement����ִ��SQL���  
	    	/* String sql = "select * from student"; // Ҫִ�е�SQL���   
	    	ResultSet rs = statement.executeQuery(sql); // �����  
	    	while(rs.next())
	    	{                 
	    	}
	    	rs.close();            
	    	*/
	    	conn.close();
	    } 
	    catch(ClassNotFoundException e) 
	    {
	    	System.out.println("Sorry,can`t find the Driver!");             
	    	e.printStackTrace();
	    } 
	    catch(SQLException e) 
	    {
	    	e.printStackTrace();
	    }
	    catch(Exception e) 
	    {
	    	e.printStackTrace();
	    }
	}
	public static Connection GetConn()
	{
		return conn;
	}
	
	public static ResultSet Query(Connection conn, String query_sql)
	{
		try
		{
			String sql = "select * from " + query_sql; // Ҫִ�е�SQL���   
			String tableName = query_sql;// .substring(0, query_sql.indexOf('('));
	    	rs = statement.executeQuery(sql); // �����
	    	while(rs.next())
	    	{
	    		int userno = rs.getInt(1);
	    		String password = rs.getString(2);
	    		String username = rs.getString(3);
	    		// System.out.print(userno + " " + password + " " + username + "\n");
	    	}
	    	System.out.print(tableName + " Data query succeed!");
	    	
		}
	    catch (SQLException e) 
	    {
	    	e.printStackTrace();
	    }
	    catch (Exception e) 
	    {
	    	e.printStackTrace();
	    }
		return rs;
	}

}
