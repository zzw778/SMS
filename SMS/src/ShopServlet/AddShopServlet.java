package ShopServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.shop;
import SystemService.Impl.CommodityServiceImpl;


public class AddShopServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String per=request.getParameter("per");//负责人
		String pnum=request.getParameter("pnum");//负责人号码
		String time=request.getParameter("time");//营业时间
		String shopname=request.getParameter("name");//店名
		String addr=request.getParameter("addr");//地址
		String num=request.getParameter("num");//店号码
		int lev=Integer.parseInt(request.getParameter("lev"));//级别
		String rel=request.getParameter("rel");//关系
		String state="停业";
		int tur=0;
		ICommodityService sh=new CommodityServiceImpl();
		shop s=new shop(shopname,rel,state,lev,addr,num,per,pnum,time,tur);
		 sh.addshop(s);
		 request.getRequestDispatcher("addshop.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
