package ISystemService;

import java.util.List;

import System.entity.Commodity;
import System.entity.Salerecord;
import System.entity.Store;
import System.entity.shop;

public interface ICommodityService {
	 public boolean deletecommodity(String cname,String sname);
		
	 public boolean updatecommodity(Commodity comm);
	 
	 public boolean updatecommoditycnu(String cname, int cnu);
	 
	 public boolean addcommodity(Commodity comm);
	
	 public boolean isExit(String cname,String sname);
	 
	 public boolean isexit(String cname);
	 
	 public List<Commodity> checkonecommodity(String cname);
	 
	 public List<Commodity> checknocommodity(int cnu);
	 
	 public Commodity checkstorecommodity(String cname,String sname);
	 
	 public List<Commodity> checkallcommodity();
	 
	 public int getAllitem();
	 
	 public List<shop> checkallshop();
	 
	 public boolean addshop(shop s);
	 
	 public boolean updateshop(shop sh);
	 
	 public boolean deleteshop(String shopname);
	 
	 public boolean updatesal(String shopname,int tur);
	 
	 public List<Store> checkallstore(); 
	 
	 public Store checkonestore(String cname);
	 
	 public boolean isExittore(String cname);
	 
	 public boolean isExitstore(String cname,String goods);
	 
	 public boolean addstore(Store s) ;
	  	//增加供货商提供的商品
	  	public boolean updatestore(String cname, String goods) ;

	  	//删除供货商
	  	public boolean deletestore(String cname,String goods) ;
	  	
	  	public boolean deletestoreall(String cname);  	
	  	
	  	public boolean deletecommstoreall(String sname);
	  	
	  	public List<Salerecord> checkallrecord();
	  	
	  	public List<Salerecord> checkdaterecord(String cdate) ;
		
		public boolean addrecord(Salerecord s);
}
