package ShopServlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Salerecord;
import SystemService.Impl.CommodityServiceImpl;


public class SalaryServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date=new Date();
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //获取String类型的时间
        String cdate = sdf.format(date);
        String da=request.getParameter("cdate");
        //System.out.print(da);
        int price=0,profit=0,pro=-1,allpro=0;
		ICommodityService comm=new CommodityServiceImpl();
		List<Salerecord> allsa=comm.checkallrecord();
		for(int i=0;i<allsa.size();i++){
		    allpro=allpro+allsa.get(i).getCoutprice()-allsa.get(i).getCinprice();
		}
		List<Salerecord> sas=comm.checkdaterecord(cdate);
		if(da!=null) {
			pro=0;
			List<Salerecord> sa=comm.checkdaterecord(da);
			for(int i=0;i<sa.size();i++){
			    pro=pro+sa.get(i).getCoutprice()-sa.get(i).getCinprice();
			}
			
		}
		
		
		for(int i=0;i<sas.size();i++){
		    price=price+sas.get(i).getCoutprice();  
		    profit=profit+sas.get(i).getCoutprice()-sas.get(i).getCinprice();
		}
		request.setAttribute("sa", sas);
		request.setAttribute("price", price);
		request.setAttribute("profit", profit);
		request.setAttribute("pro", pro);
		request.setAttribute("da", da);
		request.setAttribute("allpro", allpro);
		request.getRequestDispatcher("salary.jsp").forward(request, response);
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
