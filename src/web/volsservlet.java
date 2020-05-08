package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import voyage.Operation;
import voyage.Vol;


public class volsservlet extends HttpServlet{
	private Operation op;
	@Override
	public void init() throws ServletException {
		op =new Operation();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("id")!=null)
		{
			op.remove(Long.parseLong(req.getParameter("id")));
		}
		else
		{
		String depart=req.getParameter("depart");
		String dest=req.getParameter("dest");
		String date=req.getParameter("date");
		String nbrperso=req.getParameter("nbrperso");
		op.add(new Vol(1L,depart,dest,date,Integer.parseInt(nbrperso)));		
		}
		VolsBeans p =new VolsBeans();
		p.setListe(op.getallvols());
		req.setAttribute("modele", p);
		req.getRequestDispatcher("HistoriqueVols.jsp").forward(req, resp);
		}
		
}
