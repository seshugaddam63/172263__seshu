<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>seshu</h1>
<%!
public int add(int a ,int b)
{
return a+b;  	
}
%>
<% 

int i=5,j=5,k;
k=i+j;
//out.println(+k);
%>
the value of k is :<%=5+5%>
<%k=add(10,20);
%>
<br>
the value of k is  :<%=k %>
<% 
for(i=0;i<5;i++)
{
	
	out.println(+k);
}

%>


</body>
</html>