package SystemService.Impl;

import java.util.List;

import ISystemDao.ICommodityDao;
import ISystemService.ICommodityService;
import System.DBUtil.DBUtil;
import System.entity.Commodity;
import System.entity.Salerecord;
import System.entity.Store;
import System.entity.shop;
import SystemDao.Impl.CommodityDaoImpl;

public class CommodityServiceImpl implements ICommodityService{
	ICommodityDao comm=new CommodityDaoImpl();
	
       //增
	public  boolean addcommodity(Commodity commo) {
		if(!comm.isExit(commo.getCname(),commo.getSname())) {
			return comm.addcommodity(commo);
		}else
			return false;
	}
	
	public boolean isExit(String cname,String sname) {
		return comm.isExit(cname,sname);
	}
	
	public boolean isexit(String cname) {
		return comm.isexit(cname);
	}
	//删
	public boolean deletecommodity(String cname,String sname) {
		return comm.deletecommodity(cname,sname);
	}
	
	//改
	public boolean updatecommodity(Commodity commo) {
		return comm.updatecommodity(commo.getCname(),commo.getSname(), commo);
	}
	
	public boolean updatecommoditycnu(String cname, int cnu) {
		return comm.updatecommoditycnu(cname, cnu);
	}
	
	//查询一个商品
	public List<Commodity> checkonecommodity(String cname) {
		return comm.checkonecommodity(cname);
	}
	
	public List<Commodity> checknocommodity(int cnu){
		return comm.checknocommodity(cnu);
	}
	
	public Commodity checkstorecommodity(String cname,String sname) {
		return comm.checkstorecommodity(cname,sname);
	}
	
	//查询所有商品
	public List<Commodity> checkallcommodity() {
		return comm.checkallcommodity();
	}
	
	//查询数据总条数
    public int getAllitem() {
		return comm.getAllitem();
	}
	
  //查询所有门店
  	public List<shop> checkallshop() {
  		return comm.checkallshop();
  	}
  	
  	public boolean addshop(shop s) {
  		return comm.addshop(s);
  	}
  	
  	public boolean updateshop(shop sh) {
  		return comm.updateshop(sh.getShopname(),sh);
  	}
  	
  	public boolean deleteshop(String shopname) {
  		return comm.deleteshop(shopname);
  	}
  	
  	public boolean updatesal(String shopname,int tur) {
  		return comm.updatesal(shopname,tur);
  	}
  	
  	public List<Store> checkallstore(){
  		return comm.checkallstore();
  	}
  	
  	public Store checkonestore(String cname) {
  		return comm.checkonestore(cname);
  	}
  	
  	public boolean isExittore(String cname) {
  		return comm.isExittore(cname);
  	}
  	
  	public boolean isExitstore(String cname,String goods) {
  		return comm.isExitstore(cname,goods);
  	}
  	
  	public boolean addstore(Store s) {
  		return comm.addstore(s);
  		
  	  }
  	//增加供货商提供的商品
  	public boolean updatestore(String cname, String goods) {
  		return comm.updatestore(cname, goods);
  	}

  	//删除供货商
  	public boolean deletestore(String cname,String goods) {
  		return comm.deletestore(cname,goods);
  	 }
  	
  	public boolean deletestoreall(String cname) {
  		return comm.deletestoreall(cname);
  	}
  	
  	
  	public boolean deletecommstoreall(String sname) {
  		return comm.deletecommstoreall(sname);
  	}
  	
  	public List<Salerecord> checkallrecord(){
  		return comm.checkallrecord();
  	}
  	
  	public List<Salerecord> checkdaterecord(String cdate) {
  		return comm.checkdaterecord(cdate);
  	}
	
	public boolean addrecord(Salerecord s) {
		return comm.addrecord(s);
	}
}
