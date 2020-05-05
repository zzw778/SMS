package ShopServlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import System.entity.Salerecord;
import SystemService.Impl.CommodityServiceImpl;


public class SaleCommServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sale=Integer.parseInt(request.getParameter("sale"));
		String cname=request.getParameter("cname");
		String sname=request.getParameter("sname");
		Date date=new Date();
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //获取String类型的时间
        String cdate = sdf.format(date);
        //System.out.print(cdate);
		//String cdate=request.getParameter("cdate");
		ICommodityService comm=new CommodityServiceImpl();
		Commodity commodity=comm.checkstorecommodity(cname,sname);
		int coutprice=commodity.getCoutprice();
		Salerecord s=new Salerecord(cname,sname,coutprice,sale,cdate);
		comm.addrecord(s);
		int cnu=commodity.getCnu()-sale;
		comm.updatecommoditycnu(cname, cnu);
		request.getRequestDispatcher("allCommsaleServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
