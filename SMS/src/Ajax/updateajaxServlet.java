package Ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import SystemService.Impl.CommodityServiceImpl;


public class updateajaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String cname=request.getParameter("cname");
	    if(cname==null)
	    	response.getWriter().write("null");
	    //System.out.println(cname);
	    ICommodityService commo=new CommodityServiceImpl();
	    
	    if(commo.isexit(cname))
			response.getWriter().write("true");
		else 
			response.getWriter().write("false");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
