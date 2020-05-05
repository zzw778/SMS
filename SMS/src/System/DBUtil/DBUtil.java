package System.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import System.entity.Commodity;

public class DBUtil {
	private static final String URL="jdbc:mysql://localhost:3306/SMS?useUnicode=true&characterEncoding=gbk";
    private static final String USERNAME="root";
    private static final String PWD="root";
    public static Connection connection=null;
 	public static PreparedStatement pstmt=null;
 	public static ResultSet rs=null;
      
 	//查询总条数
 	 public static int allitem(String sql) {
     	
     	int count=-1;
     	try {
     		
           		Class.forName("com.mysql.jdbc.Driver");
           		connection=DriverManager.getConnection(URL,USERNAME,PWD);
           		
           		pstmt=connection.prepareStatement(sql);
           		rs=pstmt.executeQuery();
     	
     	if(rs.next()) {
     		count=rs.getInt(1);
     	}
     	
     	
     	}catch (SQLException e) {
 			e.printStackTrace();
 			
 		}catch (Exception e) {
 			e.printStackTrace(); 
 			
     }
     	finally {
  		   try {
  			      if(rs!=null)  rs.close();//最开始打开最后关，最后打开最先关
  				  if(DBUtil.pstmt!=null) DBUtil.pstmt.close();
  				  if(DBUtil.connection!=null)  DBUtil.connection.close();
  			      
  			  }catch(SQLException e) {
  				  e.printStackTrace();
  			  }
  	        }
     	return count;
     }
 	
 	
 	
 	
    //增删改
	   public static boolean executeupdate(String sql,Object[] params) {
       	try {
       		Class.forName("com.mysql.jdbc.Driver");
       		connection=DriverManager.getConnection(URL,USERNAME,PWD);
       		
       		pstmt=connection.prepareStatement(sql);
       	    if(params!=null) {
       		for(int i=0;i<params.length;i++) {
       			pstmt.setObject(i+1,params[i]);
       		}
       	  }
       		int count=pstmt.executeUpdate();//执行
       		if(count>0) return true;
       		else return false;
       		
       		
       	}catch (ClassNotFoundException e) {
			   e.printStackTrace();
			  return false;
		   }catch (SQLException e) {
			   e.printStackTrace();
			  return false;
		   }catch (Exception e) {
			   e.printStackTrace();
			  return false;
		   }
		   
		   finally {
			   try {
				      //最开始打开最后关，最后打开最先关
					  if(pstmt!=null) pstmt.close();
					  if(connection!=null)  connection.close();
				      
				  }catch(SQLException e) {
					  e.printStackTrace();
				  }
		        }
			
	   }
	
	
	//查
	   public static ResultSet executeQuery(String sql,Object[] params) {
		 
    
       	try {
       		Class.forName("com.mysql.jdbc.Driver");
       		connection=DriverManager.getConnection(URL,USERNAME,PWD);
       		
       		pstmt=connection.prepareStatement(sql);
       	 if(params!=null) {
       		for(int i=0;i<params.length;i++) {
       			pstmt.setObject(i+1,params[i]);
       		}
       	 }
       		
       		rs=pstmt.executeQuery();//执行
       		
       		return rs;
       	}catch (ClassNotFoundException e) {
			   e.printStackTrace();
			   return null;
		   }catch (SQLException e) {
			   e.printStackTrace();
			   return null;
		   }catch (Exception e) {
			   e.printStackTrace();
			   return null;
		   }
		}


	
}
