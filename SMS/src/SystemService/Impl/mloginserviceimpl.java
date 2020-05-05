package SystemService.Impl;

import java.util.List;

import ISystemDao.IMloginDao;
import ISystemService.IMloginservice;
import System.entity.Manage;
import System.entity.employee;
import System.entity.vip;
import SystemDao.Impl.mlogindaoimpl;

public class mloginserviceimpl implements IMloginservice{
	IMloginDao im=new mlogindaoimpl();
	//管理员名称是否存在
	 public boolean isExit(String name,String pwd) {
  	   return im.isExit(name, pwd);
     } 
	//查看管理员信息
       public Manage checkmanage(String name) {
    	   return im.checkmanage(name);
       }
       
      
       //增加管理者
       public boolean addmanage(Manage man) {
    	   if(!im.Exit(man.getName())) {
    	   return im.addmanage(man);
    	   }else
    		   return false;
       } 
       //修改管理员
       public boolean updatemanage(String name,Manage man) {
    	   return im.updatemanage(name,man);  
       } 
       //查询所有员工
       public List<employee> checkallemployee(){
    	   return im.checkallemployee(); 
       }
       //增加员工
       public boolean addemp(employee man) {
    	   return im.addemp(man); 
       }
       
       public boolean deleteemp(String cname,int id) {
    	   return im.deleteemp(cname,id); 
       }
       public boolean updateemp(String cname, int id,employee man) {
      		 return im.updateemp(cname,id,man); 
      }
       public boolean updatemon(String cname,int id,employee man) {
      			 return im.updatemon(cname,id,man); 
      }
      		 
       public boolean updatejob(employee man) {
    	   return im.updatejob(man); 
       }
       
       public boolean isExit(String name,int id) {
    	   return im.isExit(name,id); 
       }
       
       public employee checkemp(String name,int id){
    	   return im.checkemp(name,id); 
       }
       
       public List<vip> checkallvip(){
    	   return im.checkallvip(); 
       }
       
       public boolean isvipExit(String name,int id) {
    	   return im.isvipExit(name,id); 
       }
  	 
  	 public vip checkvip(String name,int id) {
  		 return im.checkvip(name,id); 
  	 }
  	 
  	public boolean addvip(vip man) {
  		return im.addvip(man); 
  	}
  	
  	public boolean deletevip(String cname,int id) {
  		return im.deletevip(cname,id); 
  	}
}
