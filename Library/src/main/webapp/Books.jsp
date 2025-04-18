<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Registration</title>
</head>
<body>
<h2>Welcome to MMUST Archives</h2>

<form action="bookservlet" method="post">

<table>

<tr>
<td> Book Name</td>
<td> <input type="text" name="Book Name"> </td>
</tr>

<tr>
<td> Student's Name</td>
<td> <input type="text" name="Student"> </td>
</tr>

<tr>
<td> ISBN Number</td>
<td> <input type="text" name="ISBN"> </td>
</tr>

<tr>
<td> Registration Number </td>
<td> <input type="text" name="Reg"> </td>
</tr>


</table>

<input type="submit" value= "Acquire" >  

<input type="reset" value="Go Back">
</form>

</body>
</html>