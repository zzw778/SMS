package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import SystemService.Impl.mloginserviceimpl;


public class AddempServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		int id=Integer.parseInt(request.getParameter("id"));
		String sex=request.getParameter("sex");
		String pos=request.getParameter("pos");
		int sal=Integer.parseInt(request.getParameter("sal"));
		String re=request.getParameter("re");
		String job="休息",reason = "";
		int pun=0,remark=0;
		employee em=new employee(name,id,age,sex,pos,job,sal,pun,remark,re,reason);
		IMloginservice man=new mloginserviceimpl();
		man.addemp(em);
		request.getRequestDispatcher("addemp.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
