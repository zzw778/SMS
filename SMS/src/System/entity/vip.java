package System.entity;

public class vip {
	private int vnum;//会员卡号
    private String name;//名字
    private String sex;//性别
    private int vid;//身份证号
    private int vphone;//手机号
    private String vbir;//生日
    private String vlev;//会员等级
    private int vmon ;//售卡金额
    private int vintegral ;//会员积分
    private String vdate;//到期日期
    
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	public int getVnum() {
		return vnum;
	}
	public void setVnum(int vnum) {
		this.vnum = vnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getVphone() {
		return vphone;
	}
	public void setVphone(int vphone) {
		this.vphone = vphone;
	}
	public String getVbir() {
		return vbir;
	}
	public void setVbir(String vbir) {
		this.vbir = vbir;
	}
	public String getVlev() {
		return vlev;
	}
	public void setVlev(String vlev) {
		this.vlev = vlev;
	}
	public int getVmon() {
		return vmon;
	}
	public void setVmon(int vmon) {
		this.vmon = vmon;
	}
	public int getVintegral() {
		return vintegral;
	}
	public void setVintegral(int vintegral) {
		this.vintegral = vintegral;
	}
	public vip(int vnum, String name, String sex, int vid, int vphone, String vbir, String vlev, int vmon,
			int vintegral,String vdate) {
		
		this.vnum = vnum;
		this.name = name;
		this.sex = sex;
		this.vid = vid;
		this.vphone = vphone;
		this.vbir = vbir;
		this.vlev = vlev;
		this.vmon = vmon;
		this.vintegral = vintegral;
		this.vdate=vdate;
	}
	public vip() {
		
	}
    
    
}
