package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.Manage;
import SystemService.Impl.mloginserviceimpl;


public class manageregisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name"); 
		String pwd=request.getParameter("pwd");
		String mpo=null;
		int msal=-1;
		int myear=-1;
		String msex=null;
		String mnum=null;
		String mid=null;
		//System.out.println(msal);
		Manage man=new Manage(name,pwd,mpo,msal,myear,msex,mnum,mid);
		IMloginservice ulogin=new mloginserviceimpl();
		      boolean result=ulogin.addmanage(man);
		      if(result)
			        response.getWriter().write("true");
		      else
			        response.getWriter().write("false");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
