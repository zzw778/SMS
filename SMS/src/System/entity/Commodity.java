package System.entity;

public class Commodity {
    
     private String cname;//商品名
     private String corig;//商品产地
     private String cunit;//商品单位
     private int cinprice;//商品批发价
     private int coutprice;//商品零售价
     private String coutdate;//商品保质期
     private int cnu;//商品剩余数量
     private String cremark;//备注
     private String sname;//备注
     
     public String getCorig() {
		return corig;
	}
	public void setCorig(String corig) {
		this.corig = corig;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCremark() {
		return cremark;
	}
	public void setCremark(String cremark) {
		this.cremark = cremark;
	}
	public Commodity() {
    	 
     }
	public Commodity( String cname,String sname, String corig, String cunit, int cinprice, int coutprice, String coutdate, int cnu, String cremark) {
		
		
		this.cname = cname;
		this.sname = sname;
		this.corig =corig;
		this.cunit =cunit;
		this.cinprice = cinprice;
		this.coutprice = coutprice;
		this.coutdate = coutdate;
		this.cnu = cnu;
		this.cremark=cremark;
	}
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCunit() {
		return cunit;
	}
	public void setCunit(String cunit) {
		this.cunit = cunit;
	}
	public int getCinprice() {
		return cinprice;
	}
	public void setCinprice(int cinprice) {
		this.cinprice = cinprice;
	}
	public int getCoutprice() {
		return coutprice;
	}
	public void setCoutprice(int coutprice) {
		this.coutprice = coutprice;
	}
	public String getCoutdate() {
		return coutdate;
	}
	public void setCoutdate(String coutdate) {
		this.coutdate = coutdate;
	}
	public int getCnu() {
		return cnu;
	}
	public void setCnu(int cnu) {
		this.cnu = cnu;
	}
}
