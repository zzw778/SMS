package ISystemService;

import java.util.List;

import System.entity.Manage;
import System.entity.employee;
import System.entity.vip;

public interface IMloginservice {
	
	public boolean isExit(String name,String pwd);
	
	public Manage checkmanage(String name) ;
	
	public boolean addmanage(Manage man);
	
	public boolean updatemanage(String name,Manage man);
	
	
	
	
	
	public List<employee> checkallemployee();
	
	public boolean deleteemp(String cname,int id);
	
	public boolean updateemp(String cname, int id,employee man) ;
	 
	public boolean updatemon(String cname,int id,employee man) ;
	
	public boolean updatejob(employee man);
	
	public boolean addemp(employee man);
	
	public boolean isExit(String name,int id);
	
	public employee checkemp(String name,int id);
	
	public List<vip> checkallvip();
		
	 public boolean isvipExit(String name,int id);
	 
	 public vip checkvip(String name,int id);
	 
	 public boolean addvip(vip man) ;
	 
	 public boolean deletevip(String cname,int id);
}
