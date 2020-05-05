package System.entity;

public class employee {
    private String name;//姓名
    private int age;//年龄
	private String sex;//性别
	private int id;//身份证
	private String pos;//职位
	private String job;//今日是否出勤
	private int sal;//月工资
	private int pun;//扣除工资
	private int reward;//奖励工资
	private String re;//备注
	private String reason;//奖惩原因
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getPun() {
		return pun;
	}
	public void setPun(int pun) {
		this.pun = pun;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public employee() {
		
	}
	public employee(String name,int id, int age, String sex, String pos, String job, int sal, int pun,int reward,String re,String reason) {
		
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id=id;
		this.pos = pos;
		this.job = job;
		this.sal = sal;
		this.pun=pun;
		this.reward=reward;
		this.re = re;
		this.reason = reason;
	}
	public employee(String name,int id, int sal, int pun, int reward, String reason) {
		
		this.name = name;
		this.id=id;
		this.sal = sal;
		this.pun = pun;
		this.reward = reward;
		this.reason = reason;
	}
	public employee(String name, int id, String job) {
		super();
		this.name = name;
		this.id = id;
		this.job = job;
	}
	public employee(String name, int id, String pos, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.pos = pos;
		this.sal = sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getRe() {
		return re;
	}
	public void setRe(String re) {
		this.re = re;
	}
}
