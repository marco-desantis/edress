<!DOCTYPE html>
<html>
<head>
<title>EXCEPTION</title>
<link rel="stylesheet" href="css\style.css" type="text/css" />
</head>
<body>
	<h1>EXCEPTION</h1>

	OOPS!! Qualcosa è andato storto
	<br />
	<br /> 
	<% Exception e = (Exception) request.getAttribute("exception");%>
	<%= e.toString()%>

	<a href='index.jsp'>HOME</a>
</body>
</html>