package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import SystemService.Impl.mloginserviceimpl;


public class updatemoneyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String reason=null;
		int id=Integer.parseInt(request.getParameter("id"));
		int pun=Integer.parseInt(request.getParameter("pun"));
		int reward=Integer.parseInt(request.getParameter("reward"));
		String reason1=request.getParameter("reason1");
		String reason2=request.getParameter("reason2");
		int Pun=0,Reward=0,sal=0;
		
		IMloginservice man=new mloginserviceimpl();
		employee em=man.checkemp(name, id);
		
		Pun=pun+em.getPun();
		Reward=reward+em.getReward();
		reason=reason1+reason2+em.getReason();
		sal=em.getSal()+reward-pun;
		employee e=new employee(name,id,sal,Pun,Reward,reason);
		man.updatemon(name, id, e);
		request.getRequestDispatcher("salma.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
