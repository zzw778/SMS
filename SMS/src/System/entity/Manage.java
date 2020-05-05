package System.entity;

public class Manage {
  private String name;
  private String pwd;
  private String mpo;
  private int msal;
  private int myear;
  private String msex;
  private String mnum;
  private String mid;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Manage(String name, String pwd) {
	super();
	this.name = name;
	this.pwd = pwd;
}

public Manage(String name, String pwd, String mpo, int msal, int myear, String msex, String mnum,
		String mid) {
	
	this.name = name;
	this.pwd = pwd;
	this.mpo = mpo;
	this.msal = msal;
	this.myear = myear;
	this.msex = msex;
	this.mnum = mnum;
	this.mid = mid;
}
public String getMpo() {
	return mpo;
}
public void setMpo(String mpo) {
	this.mpo = mpo;
}
public int getMsal() {
	return msal;
}
public void setMsal(int msal) {
	this.msal = msal;
}
public int getMyear() {
	return myear;
}
public void setMyear(int myeal) {
	this.myear = myeal;
}
public String getMsex() {
	return msex;
}
public void setMsex(String msex) {
	this.msex = msex;
}
public String getMnum() {
	return mnum;
}
public void setMnum(String mnum) {
	this.mnum = mnum;
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
public Manage() {
	
 }
}
