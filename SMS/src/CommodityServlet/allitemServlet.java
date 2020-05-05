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

public class allitemServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * FenYe page=new FenYe();
		 *  ICommodityService commodityservice=new CommodityServiceImpl();
		 *   List<Commodity> comms=commodityservice.checkallcommodity();
		 *    request.setAttribute("comms",comms);
		 */
		ICommodityService commodityservice=new CommodityServiceImpl();
		 int count=commodityservice.getAllitem(); 
		 //page.setAllitem(count);//总数据个数
		 request.setAttribute("count",count);
		 
		request.getRequestDispatcher("index1.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
