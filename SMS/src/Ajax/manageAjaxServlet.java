package Ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.Manage;
import SystemService.Impl.mloginserviceimpl;


public class manageAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("sname");
		
		String pwd=request.getParameter("pwd");
		
		IMloginservice im=new mloginserviceimpl();
		
		 if(im.isExit(name,pwd)) {
			   response.getWriter().write("true");
		   }else {
			   response.getWriter().write("false");
		   }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
