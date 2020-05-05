package Ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import ISystemService.IMloginservice;
import SystemService.Impl.CommodityServiceImpl;
import SystemService.Impl.mloginserviceimpl;


public class EmpcheckajaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String name=request.getParameter("name");
	    int id=Integer.parseInt(request.getParameter("id"));
	    //System.out.print(name);
	    IMloginservice man=new mloginserviceimpl();
	    if(man.isExit(name,id))
			response.getWriter().write("true");
		else 
			response.getWriter().write("false");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
