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


public class StartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		//Commodity comm=new Commodity();
		/*
		 * ICommodityService commodityservice=new CommodityServiceImpl();
		 * List<Commodity> comms=commodityservice.checkallcommodity();
		 * request.setAttribute("comms", comms);
		 */
		
		 request.setAttribute("name",name);
		 
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
