package System.entity;

public class Store {
   private String cname;
   private String goods;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Store(String cname, String goods) {
	super();
	this.cname = cname;
	this.goods = goods;
}
public String getGoods() {
	return goods;
}
public void setGoods(String goods) {
	this.goods = goods;
}
   
}
