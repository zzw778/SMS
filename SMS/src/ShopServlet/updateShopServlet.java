package ShopServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.shop;
import SystemService.Impl.CommodityServiceImpl;


public class updateShopServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String shopname=request.getParameter("shopname");
		  String state=request.getParameter("state");
		  int tur=0;
		  ICommodityService sh=new CommodityServiceImpl();
		  shop s=new shop(shopname,state,tur);
		  sh.updateshop(s);
		  request.getRequestDispatcher("AllShopServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
