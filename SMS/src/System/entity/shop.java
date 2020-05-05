package System.entity;

public class shop {
   private String rel;//关系
   private String state;//状态
   private int lev;//级别
   private String shopname;//店名
   private String addr;//地址
   private String num;//电话号码
   private int tur;//营业额
   private String per;//负责人
   private String pnum;//负责人号码
   private String stime;//营业时间
   public shop(String shopname,String state,int tur) {
	   this.state = state;
	   this.shopname = shopname;
	   this.tur=tur;
   }
   
   public shop(String shopname,int tur) {
	   this.shopname = shopname;
	   this.tur=tur;
   }
public shop(String shopname,String rel, String state, int lev, String addr, String num, String per,String pnum,String stime,int tur
		) {
	this.shopname = shopname;
	this.rel = rel;
	this.state = state;
	this.lev = lev;
	this.addr = addr;
	this.num = num;
	this.per = per;
	this.stime = stime;
	this.pnum = pnum;
	this.tur = tur;
}

public String getPer() {
	return per;
}

public void setPer(String per) {
	this.per = per;
}

public String getPnum() {
	return pnum;
}

public void setPnum(String pnum) {
	this.pnum = pnum;
}

public shop() {
	   
}

public shop(String shopname,String rel, String state, int lev, String addr, String num, String stime,int tur) {
	this.shopname = shopname;
	this.rel = rel;
	this.state = state;
	this.lev = lev;
	this.addr = addr;
	this.num = num;
	this.stime = stime;
	this.tur = tur;
}
public String getStime() {
	return stime;
}

public void setStime(String stime) {
	this.stime = stime;
}

public String getRel() {
	return rel;
}
public void setRel(String rel) {
	this.rel = rel;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getLev() {
	return lev;
}
public void setLev(int lev) {
	this.lev = lev;
}
public String getShopname() {
	return shopname;
}
public void setShopname(String shopname) {
	this.shopname = shopname;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public int getTur() {
	return tur;
}
public void setTur(int tur) {
	this.tur = tur;
}
   
}
