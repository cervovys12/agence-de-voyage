<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="java.util.Iterator"%>
<%@ page import="web.VolsBeans" %>
<%@ page import="voyage.Vol" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>historique vols</title>
</head>
<body>
<form action="volhisserv" method="post">
	<%
		VolsBeans vols;	
		if( request.getAttribute("modele")!= null)
		{
			vols=(VolsBeans) request.getAttribute("modele");
		}
		else{
			vols=new VolsBeans();
		}
	%>
	<table border="1" width="50%" >
		<tr>
			<th>id</th>
			<th>depart</th>
			<th>destination</th>
			<th>date</th>
			<th>nombre de personnes</th>
			<th>action</th>
		</tr>
		<%
		Iterator<Vol> list =vols.getListe().iterator();
		while(list.hasNext())
		{
			Vol p=list.next();
			%>
			<tr>
				<td><%=p.getId() %></td>
				<td><%=p.getDepart() %></td>
				<td><%=p.getDestination() %></td>
				<td><%=p.getDate() %></td>
				<td><%=p.getNbrperso() %></td>
				<td>
				<form action="volhisserv" method="post">
				<input type="hidden" name="id" value="<%=p.getId()%>"/>
				<input type="hidden" name="action" value="supprimer"/>
				<input type="submit" value="supprimer"/>
				</td>
				</form>
			</tr>
		<% 
		}
		%>
		
	</table>
	</form>
</body>
</html>