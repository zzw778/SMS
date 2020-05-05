package CommodityServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import SystemService.Impl.CommodityServiceImpl;


public class updateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cname=request.getParameter("cname");
		//System.out.println(cname);
		ICommodityService commo=new CommodityServiceImpl();
		List<Commodity> comm=commo.checkonecommodity(cname);
		request.setAttribute("comm", comm);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
