package Ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import SystemService.Impl.mloginserviceimpl;


public class vipcheckajaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String name=request.getParameter("name");
	    int id=Integer.parseInt(request.getParameter("id"));
	    //System.out.print(name);
	    IMloginservice man=new mloginserviceimpl();
	    if(man.isvipExit(name,id))
			response.getWriter().write("true");
		else 
			response.getWriter().write("false");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
