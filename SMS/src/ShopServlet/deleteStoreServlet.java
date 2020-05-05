package ShopServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import SystemService.Impl.CommodityServiceImpl;


public class deleteStoreServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname=request.getParameter("cname");
		 ICommodityService st=new CommodityServiceImpl();
		 st.deletestoreall(cname);
		 st.deletecommstoreall(cname);
		 request.getRequestDispatcher("allStoreServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
