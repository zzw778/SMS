package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.Manage;
import SystemService.Impl.mloginserviceimpl;


public class updateManageServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
	    String mpo=request.getParameter("mpo");
	   // System.out.println(mpo);
	    int msal=Integer.parseInt(request.getParameter("msal"));
	    //System.out.println(msal);
	    int myear=Integer.parseInt(request.getParameter("myear"));
	    String msex=request.getParameter("msex");
	    String mnum=request.getParameter("mnum");
	    String mid=request.getParameter("mid");
	    IMloginservice manservice=new mloginserviceimpl();
		Manage maner=manservice.checkmanage(name);
		String pwd=maner.getPwd();
	    Manage man=new Manage(name,pwd,mpo,msal,myear,msex,mnum,mid);
	    if(manservice.updatemanage(name, man)) {
	    	request.setAttribute("man",man);
	    	request.getRequestDispatcher("Mmessage.jsp").forward(request, response);
	    }
	    	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
