package ISystemDao;

import java.util.List;

import System.DBUtil.DBUtil;
import System.entity.Commodity;
import System.entity.Salerecord;
import System.entity.Store;
import System.entity.shop;

public interface ICommodityDao {
	
	 public boolean deletecommodity(String cname,String sname);
	 
	 public List<Commodity> checkallcommodity();
	
	 public boolean updatecommodity(String cname, String sname,Commodity comm);
	 
	 public boolean updatecommoditycnu(String cname, int cnu);
	 
	 public boolean addcommodity(Commodity comm);
	 
	 public boolean isExit(String cname,String sname);
	 
	 public boolean isexit(String cname) ;
	 
	 public List<Commodity> checkonecommodity(String cname);
	 
	 public List<Commodity> checknocommodity(int cnu);
	 
	 public Commodity checkstorecommodity(String cname,String sname);
	
	 public int getAllitem() ;
	 
	 public List<shop> checkallshop();
	 
	 public boolean addshop(shop s);
	 
	 public boolean updateshop(String shopname, shop sh);
	 
	 public boolean deleteshop(String shopname);
	 
	 public boolean updatesal(String shopname, int tur);
	 
	 public List<Store> checkallstore();
	 
	 public Store checkonestore(String cname);
	 
	 public boolean isExittore(String cname);
	 
	 public boolean isExitstore(String cname,String goods);
	 
	 public boolean addstore(Store s) ;
	 
		public boolean updatestore(String cname, String goods) ;
		
		public boolean deletestore(String cname,String goods) ;
		
		public boolean deletestoreall(String cname);
		
		public boolean deletecommstoreall(String sname);
		
		public List<Salerecord> checkallrecord();
		
		public List<Salerecord> checkdaterecord(String cdate); 
		
		public boolean addrecord(Salerecord s);
}
