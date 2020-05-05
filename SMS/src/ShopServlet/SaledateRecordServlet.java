package ShopServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Salerecord;
import SystemService.Impl.CommodityServiceImpl;


public class SaledateRecordServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cdate=request.getParameter("cdate");
		ICommodityService comm=new CommodityServiceImpl();
		List<Salerecord> sas=comm.checkdaterecord(cdate);
		request.setAttribute("sa", sas);
		request.setAttribute("ca", cdate);
		request.getRequestDispatcher("salecheckrecord.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
