<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ll.exam.Rq" %>
<%
    Rq rq = new Rq(request, response);

//    int dan = Integer.parseInt(request.getParameter("dan"));
    int dan = rq.getIntParam("dan",1);
//    int limit = Integer.parseInt(request.getParameter("limit"));
    int limit = rq.getIntParam("limit",1);
%>

<h1><%=dan%>단</h1>

<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>