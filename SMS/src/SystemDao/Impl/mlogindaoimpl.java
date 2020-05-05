package SystemDao.Impl;

import java.util.ArrayList;
import java.util.List;

import ISystemDao.IMloginDao;
import System.DBUtil.DBUtil;
import System.entity.Commodity;
import System.entity.Manage;
import System.entity.employee;
import System.entity.vip;

import java.sql.ResultSet;
import java.sql.SQLException;

public class mlogindaoimpl implements IMloginDao{
	//查找全部注册过的管理员，进行登录信息对比
			public boolean isExit(String name,String pwd) {
		        
		        ResultSet rs=null;
				try {
					
					String sql="select * from Manage where name=? and pwd=?";//查
					Object[] params= {name,pwd};
					rs=DBUtil.executeQuery(sql,params);
					if(rs.next()) {
						return true;
					}else
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
						      if(rs!=null)  rs.close();//最开始打开最后关，最后打开最先关
							  if(DBUtil.pstmt!=null) DBUtil.pstmt.close();
							  if(DBUtil.connection!=null)  DBUtil.connection.close();
						      
						  }catch(SQLException e) {
							  e.printStackTrace();
						  }
				        }
			      }
      //查找某个注册过的管理者
	public Manage checkmanage(String name) {
        Manage man=null;
        ResultSet rs=null;
		try {
			
			String sql="select * from Manage where name=?";//查
			Object[] params= {name};
			rs=DBUtil.executeQuery(sql,params);
			if(rs.next()) {
	            String mname=rs.getString("name");//商品名
	            String pwd=rs.getString("pwd");//商品产地
	            String mpo=rs.getString("mpo");//商品单位
	            int msal=rs.getInt("msal");//商品批发价
	            int myear=rs.getInt("myear");//商品零售价
	            String msex=rs.getString("msex");//商品保质期
	            String mnum=rs.getString("mnum");//商品剩余数量
	            String mid=rs.getString("mid"); 
	            man=new Manage(mname,pwd,mpo,msal,myear,msex,mnum,mid);
	    	}
	    	return man;
			
		   }catch (SQLException e) {
			   e.printStackTrace();
			  return null;
		   }catch (Exception e) {
			   e.printStackTrace();
			  return null;
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
	      }
	//查看管理员注册名是否存在
        public boolean Exit(String name) {
        
        ResultSet rs=null;
		try {
			
			String sql="select * from Manage where name=?";//查
			Object[] params= {name};
			rs=DBUtil.executeQuery(sql,params);
			if(rs.next()) {
				return true;
			}else
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
				      if(rs!=null)  rs.close();//最开始打开最后关，最后打开最先关
					  if(DBUtil.pstmt!=null) DBUtil.pstmt.close();
					  if(DBUtil.connection!=null)  DBUtil.connection.close();
				      
				  }catch(SQLException e) {
					  e.printStackTrace();
				  }
		        }
	      }
	//添加管理员
	   public boolean addmanage(Manage man) {
		  String sql="insert into Manage values(?,?,?,?,?,?,?,?)";
		  Object[] params= {man.getName(),man.getPwd(),man.getMpo(),man.getMsal(),man.getMyear(),man.getMsex(),man.getMnum(),man.getMid()};
		  return DBUtil.executeupdate(sql, params);
	  }
	   
	   //修改管理员信息
	   public boolean updatemanage(String name,Manage man) {
		   String sql="update Manage set mpo=?,msal=?,myear=?,msex=?,mnum=?,mid=? where name=?";
	    	Object[] params= {man.getMpo(),man.getMsal(),man.getMyear(),man.getMsex(),man.getMnum(),man.getMid(),name};
	    	return DBUtil.executeupdate(sql, params);
	   } 
	
	 
		
 //查询所有员工
public List<employee> checkallemployee() {
	        ResultSet rs=null;
	        List<employee> ems=new ArrayList<>();
	        employee em=null;
			try {
				
				String sql="select * from employee";//查
				rs=DBUtil.executeQuery(sql,null);
				while(rs.next()) {
		            String name=rs.getString("name");//商品名
		            int age=rs.getInt("age");//商品产地
		            int id=rs.getInt("id");//身份证号
		            String sex=rs.getString("sex");//商品单位
		            int sal=rs.getInt("sal");//商品零售价
		            String pos=rs.getString("pos");//商品保质期
		            String job=rs.getString("job");//商品剩余数量
		            int pun=rs.getInt("pun");//惩罚
		            int reward=rs.getInt("reward");//奖励
		            String re=rs.getString("re"); 
		            String reason=rs.getString("reason"); 
		            em=new employee(name,id,age,sex,pos,job,sal,pun,reward,re,reason);
		            ems.add(em);
		    	}
		    	return ems;
				
			   }catch (SQLException e) {
				   e.printStackTrace();
				  return null;
			   }catch (Exception e) {
				   e.printStackTrace();
				  return null;
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
		      }

       //添加员工
     public boolean addemp(employee man) {
	  String sql="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
	  Object[] params= {man.getName(),man.getAge(),man.getSex(),man.getId(),man.getPos(),man.getJob(),man.getSal(),man.getPun(),man.getReward(),man.getRe(),man.getReason()};
	  return DBUtil.executeupdate(sql, params);
}
     //删除员工信息
     public boolean deleteemp(String cname,int id) {
     	String sql="delete from employee where name=? and id=?";
     	Object[] params= {cname,id};
 		  return DBUtil.executeupdate(sql, params);
     }
     
     //更改员工信息
     public boolean updateemp(String cname, int id,employee man) {
     	
     	String sql="update employee set pos=?,sal=? where name=? and id=?";
     	Object[] params= {man.getPos(),man.getSal(),cname,id};
     	return DBUtil.executeupdate(sql, params);
     }
     //更改员工出勤信息
     public boolean updatejob(employee man) {
     	
     	String sql="update employee set job=? where name=? and id=?";
     	Object[] params= {man.getJob(),man.getName(),man.getId()};
     	return DBUtil.executeupdate(sql, params);
     }
     //更改奖惩情况
     public boolean updatemon(String cname,int id,employee man) {
      	
      	String sql="update employee set pun=?,reward=?,sal=?,reason=? where name=? and id=?";
      	Object[] params= {man.getPun(),man.getReward(),man.getSal(),man.getReason(),cname,id};
      	return DBUtil.executeupdate(sql, params);
      }
     
     //查询员工是否存在
     public boolean isExit(String name,int id) {
	        
	        ResultSet rs=null;
			try {
				
				String sql="select * from employee where name=? and id=?";//查
				Object[] params= {name,id};
				rs=DBUtil.executeQuery(sql,params);
				if(rs.next()) {
					return true;
				}else
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
					      if(rs!=null)  rs.close();//最开始打开最后关，最后打开最先关
						  if(DBUtil.pstmt!=null) DBUtil.pstmt.close();
						  if(DBUtil.connection!=null)  DBUtil.connection.close();
					      
					  }catch(SQLException e) {
						  e.printStackTrace();
					  }
			        }
		      }
       
       //查找员工
      public employee checkemp(String name,int id) {
    	  employee em=null;
	        ResultSet rs=null;
			try {
				String sql="select * from employee where name=? and id=?";//查
				Object[] params= {name,id};
				rs=DBUtil.executeQuery(sql,params);
				if(rs.next()) {
		            String ename=rs.getString("name");//商品名
		            int age=rs.getInt("age");//商品产地
		            int eid=rs.getInt("id");
		            String sex=rs.getString("sex");//商品单位
		            int sal=rs.getInt("sal");//商品零售价
		            String pos=rs.getString("pos");//商品保质期
		            String job=rs.getString("job");//商品剩余数量
		            int pun=rs.getInt("pun");//惩罚
		            int reward=rs.getInt("reward");//奖励
		            String re=rs.getString("re"); 
		            String reason=rs.getString("reason"); 
		            em=new employee(ename,eid,age,sex,pos,job,sal,pun,reward,re,reason);
		           
		    	}
		    	return em;
				
			   }catch (SQLException e) {
				   e.printStackTrace();
				  return null;
			   }catch (Exception e) {
				   e.printStackTrace();
				  return null;
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
		      }
     //查询所有会员
     public List<vip> checkallvip() {
     	        ResultSet rs=null;
     	        List<vip> vips=new ArrayList<>();
     	        vip em=null;
     			try {
     				
     				String sql="select * from vip";//查
     				rs=DBUtil.executeQuery(sql,null);
     				while(rs.next()) {
     		            String name=rs.getString("name");//商品名
     		            int vnum=rs.getInt("vnum");//商品产地
     		            String sex=rs.getString("sex");//商品单位
     		            int vid=rs.getInt("vid");//商品零售价
     		            String vbir=rs.getString("vbir");//商品保质期
     		            String vlev=rs.getString("vlev");//商品剩余数量
     		            int vphone=rs.getInt("vphone");//惩罚
     		            int vmon=rs.getInt("vmon");//奖励
     		            int vintegral=rs.getInt("vintegral"); 
     		           String vdate=rs.getString("vdate");
     		            em=new vip(vnum,name,sex,vid,vphone,vbir,vlev,vmon,vintegral,vdate);
     		            vips.add(em);
     		    	}
     		    	return vips;
     				
     			   }catch (SQLException e) {
     				   e.printStackTrace();
     				  return null;
     			   }catch (Exception e) {
     				   e.printStackTrace();
     				  return null;
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
     		      }
     //查询会员是否存在
     public boolean isvipExit(String name,int id) {
    	       
	        ResultSet rs=null;
			try {
				
				String sql="select * from vip where name=? and vid=?";//查
				Object[] params= {name,id};
				rs=DBUtil.executeQuery(sql,params);
				if(rs.next()) {
					return true;
				}else
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
					      if(rs!=null)  rs.close();//最开始打开最后关，最后打开最先关
						  if(DBUtil.pstmt!=null) DBUtil.pstmt.close();
						  if(DBUtil.connection!=null)  DBUtil.connection.close();
					      
					  }catch(SQLException e) {
						  e.printStackTrace();
					  }
			        }
		      }
    
    //查找会员
    public vip checkvip(String name,int id) {
 	 
	        vip em=null;
	        ResultSet rs=null;
			try {
				String sql="select * from vip where name=? and vid=?";//查
				Object[] params= {name,id};
				rs=DBUtil.executeQuery(sql,params);
				if(rs.next()) {
					String vname=rs.getString("name");//商品名
 		            int vnum=rs.getInt("vnum");//商品产地
 		            String sex=rs.getString("sex");//商品单位
 		            int vid=rs.getInt("vid");//商品零售价
 		            String vbir=rs.getString("vbir");//商品保质期
 		            String vlev=rs.getString("vlev");//商品剩余数量
 		            int vphone=rs.getInt("vphone");//惩罚
 		            int vmon=rs.getInt("vmon");//奖励
 		            int vintegral=rs.getInt("vintegral"); 
 		            String vdate=rs.getString("vdate");
 		            em=new vip(vnum,vname,sex,vid,vphone,vbir,vlev,vmon,vintegral,vdate);
		    	}
		    	return em;
				
			   }catch (SQLException e) {
				   e.printStackTrace();
				  return null;
			   }catch (Exception e) {
				   e.printStackTrace();
				  return null;
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
		      }
    
    //添加会员
    public boolean addvip(vip man) {
	  String sql="insert into vip values(?,?,?,?,?,?,?,?,?,?)";
	  Object[] params= {man.getVnum(),man.getName(),man.getSex(),man.getVid(),man.getVphone(),man.getVbir(),man.getVlev(),man.getVmon(),man.getVintegral(),man.getVdate()};
	  return DBUtil.executeupdate(sql, params);
}
    
  //删除会员
    public boolean deletevip(String cname,int id) {
    	String sql="delete from vip where name=? and vid=?";
    	Object[] params= {cname,id};
		  return DBUtil.executeupdate(sql, params);
    }
}
