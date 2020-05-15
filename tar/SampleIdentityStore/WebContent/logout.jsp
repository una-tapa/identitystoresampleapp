<%@ page language="java" pageEncoding="ISO-8859-1"%>
<% 
request.logout();

response.setHeader( "Pragma", "no-cache" );
response.setHeader( "Cache-Control", "no-cache" );
response.setDateHeader( "Expires", 0 );

response.sendRedirect(request.getContextPath() + "/");
%>
