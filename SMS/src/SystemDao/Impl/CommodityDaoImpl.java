package SystemDao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ISystemDao.ICommodityDao;

import System.DBUtil.DBUtil;
import System.entity.Commodity;
import System.entity.Salerecord;
import System.entity.Store;
import System.entity.shop;




public class CommodityDaoImpl implements ICommodityDao{
          //商品管理：增删查改
	private static ResultSet rs=null;
	 //删除商品信息
    public boolean deletecommodity(String cname,String sname) {
    	String sql="delete from Commodity where cname=? and sname=?";
    	Object[] params= {cname,sname};
		  return DBUtil.executeupdate(sql, params);
    }
    
    //更改商品信息
    public boolean updatecommodity(String cname, String sname,Commodity comm) {
    	
    	String sql="update Commodity set corig=?,cunit=?,cinprice=?,coutprice=?,coutdate=?,cnu=?,cremark=? where cname=? and sname=?";
    	Object[] params= {comm.getCorig(),comm.getCunit(),comm.getCinprice(),comm.getCoutprice(),comm.getCoutdate(),comm.getCnu(),comm.getCremark(),cname,sname};
    	return DBUtil.executeupdate(sql, params);
    }
    
    //更改商品库存
      public boolean updatecommoditycnu(String cname, int cnu) {
    	
    	String sql="update Commodity set cnu=? where cname=?";
    	Object[] params= {cnu,cname};
    	return DBUtil.executeupdate(sql, params);
    }
    
    //增加商品信息
    public boolean addcommodity(Commodity comm) {
    	
    	String sql="insert into Commodity values(?,?,?,?,?,?,?,?,?)";
    	Object[] params= {comm.getCname(),comm.getSname(),comm.getCorig(),comm.getCunit(),comm.getCinprice(),comm.getCoutprice(),comm.getCoutdate(),comm.getCnu(),comm.getCremark()};
    	return DBUtil.executeupdate(sql, params);
    }
    
    
    //判断商品及供货商是否存在
    public boolean isExit(String cname,String sname) {
        
        
	try {
		
		String sql="select * from Commodity where cname=? and sname=?";//查
		Object[] params= {cname,sname};
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
    ////判断商品是否存在
    public boolean isexit(String cname) {
        
        
    	try {
    		
    		String sql="select * from Commodity where cname=?";//查
    		Object[] params= {cname};
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
    //查询所有商品
      public List<Commodity> checkallcommodity() {
    	List<Commodity> commoditys=new ArrayList<>();  
    	Commodity comm=null;
    	try {
    	String sql="select * from Commodity order by cnu desc";
    	
    	rs=DBUtil.executeQuery(sql, null);
    	while(rs.next()) {
    		
            String cname=rs.getString("cname");//商品名
            String sname=rs.getString("sname");//商品供货商
            String corig=rs.getString("corig");//商品产地
            String cunit=rs.getString("cunit");//商品单位
            int cinprice=rs.getInt("cinprice");//商品批发价
            int coutprice=rs.getInt("coutprice");//商品零售价
            String coutdate=rs.getString("coutdate");//商品保质期
            int cnu=rs.getInt("cnu");//商品剩余数量
            String cremark=rs.getString("cremark"); 
            comm=new Commodity(cname,sname,corig,cunit,cinprice,coutprice,coutdate,cnu,cremark);
            commoditys.add(comm);
    	}
    	return commoditys;
    	
    	
    	
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
      //查询某个商品和供销商
      public Commodity checkstorecommodity(String cname,String sname) {    	
      	Commodity comm=null;
      	try {
      		
      	String sql="select * from Commodity where cname=? and sname=?";
      	Object[] params= {cname,sname};
      	rs=DBUtil.executeQuery(sql, params);
      	while(rs.next()) {
              String name=rs.getString("cname");//商品名
              String na=rs.getString("sname");//商品供货商
              String corig=rs.getString("corig");//商品产地
              String cunit=rs.getString("cunit");//商品单位
              int cinprice=rs.getInt("cinprice");//商品批发价
              int coutprice=rs.getInt("coutprice");//商品零售价
              String coutdate=rs.getString("coutdate");//商品保质期
              int cnu=rs.getInt("cnu");//商品剩余数量
              String cremark=rs.getString("cremark"); 
              comm=new Commodity(name,na,corig,cunit,cinprice,coutprice,coutdate,cnu,cremark);
              
      	}
      	return comm;
      	
      	
      	
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
    //查询某个商品
    public List<Commodity> checkonecommodity(String cname) {
    	List<Commodity> comms=new ArrayList<>();
    	Commodity comm=null;
    	try {
    	String sql="select * from Commodity where cname=?";
    	Object[] params= {cname};
    	rs=DBUtil.executeQuery(sql, params);
    	while(rs.next()) {
    		
            String name=rs.getString("cname");//商品名
            String sname=rs.getString("sname");//商品供货商
            String corig=rs.getString("corig");//商品产地
            String cunit=rs.getString("cunit");//商品单位
            int cinprice=rs.getInt("cinprice");//商品批发价
            int coutprice=rs.getInt("coutprice");//商品零售价
            String coutdate=rs.getString("coutdate");//商品保质期
            int cnu=rs.getInt("cnu");//商品剩余数量
            String cremark=rs.getString("cremark"); 
            comm=new Commodity(name,sname,corig,cunit,cinprice,coutprice,coutdate,cnu,cremark);
            comms.add(comm);
    	}
    	return comms;
    	
    	
    	
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
  //查询剩余为0的商品
    public List<Commodity> checknocommodity(int cnu) {
    	List<Commodity> comms=new ArrayList<>();
    	Commodity comm=null;
    	try {
    	String sql="select * from Commodity where cnu=?";
    	Object[] params= {cnu};
    	rs=DBUtil.executeQuery(sql, params);
    	while(rs.next()) {
            String name=rs.getString("cname");//商品名
            String sname=rs.getString("sname");//商品供货商
            String corig=rs.getString("corig");//商品产地
            String cunit=rs.getString("cunit");//商品单位
            int cinprice=rs.getInt("cinprice");//商品批发价
            int coutprice=rs.getInt("coutprice");//商品零售价
            String coutdate=rs.getString("coutdate");//商品保质期
            int cn=rs.getInt("cnu");//商品剩余数量
            String cremark=rs.getString("cremark"); 
            comm=new Commodity(name,sname,corig,cunit,cinprice,coutprice,coutdate,cn,cremark);
            comms.add(comm);
    	}
    	return comms;
    	
    	
    	
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
    
    //查询数据总数
    public int getAllitem() {
    	String sql="select count(1) from Commodity";
    	return DBUtil.allitem(sql);
    }


//查询所有连锁店
public List<shop> checkallshop() {
	List<shop> sh=new ArrayList<>();  
	shop s=null;
	try {
	String sql="select * from shop order by tur desc";
	rs=DBUtil.executeQuery(sql, null);
	while(rs.next()) {
        String rel=rs.getString("rel");
        String state=rs.getString("state");
        int lev=rs.getInt("lev");
        String shopname=rs.getString("shopname");
        String addr=rs.getString("addr");
        String num=rs.getString("num");
        String per=rs.getString("per");
        String pnum=rs.getString("pnum");
        int tur=rs.getInt("tur"); 
        String stime=rs.getString("stime");
        s=new shop(shopname,rel,state,lev,addr,num,per,pnum,stime,tur);
        sh.add(s);
	}
	return sh;
	
	
	
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


//添加连锁店
public boolean addshop(shop s) {
	
	String sql="insert into shop values(?,?,?,?,?,?,?,?,?,?)";
	Object[] params= {s.getRel(),s.getState(),s.getLev(),s.getShopname(),s.getAddr(),s.getNum(),s.getPer(),s.getPnum(),s.getStime(),s.getTur()};
	return DBUtil.executeupdate(sql, params);
  }


//修改连锁店
public boolean updateshop(String shopname, shop sh) {
	String sql="update shop set state=?,tur=? where shopname=?";
	Object[] params= {sh.getState(),sh.getTur(),shopname};
	return DBUtil.executeupdate(sql, params);
 }

//修改营业额
   public boolean updatesal(String shopname, int tur) {
	String sql="update shop set tur=? where shopname=?";
	
	Object[] params= {tur,shopname};
	return DBUtil.executeupdate(sql, params);
 }
//删除门店信息
public boolean deleteshop(String shopname) {
	String sql="delete from shop where shopname=?";
	Object[] params= {shopname};
	  return DBUtil.executeupdate(sql, params);
   }
//查询所有供货商
public List<Store> checkallstore() {
	List<Store> sh=new ArrayList<>();  
	Store s=null;
	try {
	String sql="select * from store";
	rs=DBUtil.executeQuery(sql, null);
	while(rs.next()) {
      String cname=rs.getString("cname");
      String goods=rs.getString("goods");
      s=new Store(cname,goods);
      sh.add(s);
	}
	return sh;
	
	
	
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
//查询某个供货商
public Store checkonestore(String cname) {
	Store s=null;
	try {
	String sql="select * from store where cname=?";
	Object[] params= {cname};
	rs=DBUtil.executeQuery(sql, params);
    if(rs.next()) {
        String name=rs.getString("cname");//商品供货商
        String goods=rs.getString("cname");//商品名
        s=new Store(name,goods);
	}
	return s;
	
	
	
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

//查询该供货商是否存在
public boolean isExittore(String cname) {
	try {
	String sql="select * from store where cname=?";
	Object[] params= {cname};
	rs=DBUtil.executeQuery(sql, params);
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
//查询供货商和商品是否都有
 public boolean isExitstore(String cname,String goods) {
	try {
	String sql="select * from store where cname=? and goods=?";
	Object[] params= {cname,goods};
	rs=DBUtil.executeQuery(sql, params);
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
//增加供货商
public boolean addstore(Store s) {
	
	String sql="insert into store values(?,?)";
	Object[] params= {s.getCname(),s.getGoods()};
	return DBUtil.executeupdate(sql, params);
  }
//增加供货商提供的商品
public boolean updatestore(String cname, String goods) {
	String sql="update store set goods=? where cname=?";
	
	Object[] params= {goods,cname};
	return DBUtil.executeupdate(sql, params);
}

//删除供货商
public boolean deletestore(String cname,String goods) {
	String sql="delete from store where cname=? and goods=?";
	Object[] params= {cname,goods};
	  return DBUtil.executeupdate(sql, params);
 }
//删除供货商和所有货物
public boolean deletestoreall(String cname) {
	String sql="delete from store where cname=?";
	Object[] params= {cname};
	  return DBUtil.executeupdate(sql, params);
 }
//删除商品列表中供货商和所有货物
public boolean deletecommstoreall(String sname) {
	String sql="delete from Commodity where sname=?";
	Object[] params= {sname};
	  return DBUtil.executeupdate(sql, params);
 }
//查询所有销售记录
public List<Salerecord> checkallrecord() {
	List<Salerecord> sas=new ArrayList<>();  
	Salerecord sa=null;
	try {
	String sql="select * from salerecord order by sale asc";
	
	rs=DBUtil.executeQuery(sql, null);
	while(rs.next()) {
		
      String cname=rs.getString("cname");//商品名
      String sname=rs.getString("sname");//商品提供方
      int cinprice=rs.getInt("cinprice");//商品零售价
      int coutprice=rs.getInt("coutprice");//商品零售价
      int sale=rs.getInt("sale");//商品剩余数量
      String cdate=rs.getString("cdate"); 
      sa=new Salerecord(cname,sname,cinprice,coutprice,sale,cdate);
      sas.add(sa);
	}
	return sas;
	
	
	
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

//查询某日销售记录
public List<Salerecord> checkdaterecord(String cdate) {
	List<Salerecord> sas=new ArrayList<>();  
	Salerecord sa=null;
	try {
	String sql="select * from salerecord where cdate=?";
	Object[] params= {cdate};
	rs=DBUtil.executeQuery(sql, params);
	while(rs.next()) {
      String cname=rs.getString("cname");//商品名
      String sname=rs.getString("sname");//商品提供方
      int coutprice=rs.getInt("coutprice");
      int cinprice=rs.getInt("cinprice");//商品零售价
      int sale=rs.getInt("sale");//商品剩余数量
      String date=rs.getString("cdate"); 
      sa=new Salerecord(cname,sname,cinprice,coutprice,sale,date);
      sas.add(sa);
	}
	return sas;
	
	
	
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


//添加销售记录
public boolean addrecord(Salerecord s) {
	
	String sql="insert into salerecord values(?,?,?,?,?,?)";
	Object[] params= {s.getCname(),s.getSname(),s.getCinprice(),s.getCoutprice(),s.getSale(),s.getCdate()};
	return DBUtil.executeupdate(sql, params);
  }
}