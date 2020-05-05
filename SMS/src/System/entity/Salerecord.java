package System.entity;

public class Salerecord {
  private String cname;
  private String sname;
  private int cinprice;
  private int coutprice;
  private int sale;
  private String cdate;
  public Salerecord() {
	  
  }
public Salerecord(String cname, String sname,int coutprice, int sale, String cdate) {
	
	this.cname = cname;
	this.sname=sname;
	this.coutprice = coutprice;
	this.sale = sale;
	this.cdate = cdate;
}
public int getCinprice() {
	return cinprice;
}
public Salerecord(String cname, String sname, int cinprice, int coutprice, int sale, String cdate) {
	super();
	this.cname = cname;
	this.sname = sname;
	this.cinprice = cinprice;
	this.coutprice = coutprice;
	this.sale = sale;
	this.cdate = cdate;
}
public void setCinprice(int cinprice) {
	this.cinprice = cinprice;
}

public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}

public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCoutprice() {
	return coutprice;
}
public void setCoutprice(int coutprice) {
	this.coutprice = coutprice;
}
public int getSale() {
	return sale;
}
public void setSale(int sale) {
	this.sale = sale;
}
public String getCdate() {
	return cdate;
}
public void setCdate(String cdate) {
	this.cdate = cdate;
}
}
