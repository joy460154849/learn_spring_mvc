<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
span.error:{color:red;}
</style>
</head>

<body>

<sf:form  commandName="spittle" method="post">
First name:
	<sf:input  path="firstName" value="J"/><br/>
	<sf:errors  path="firstName" /><br/>
Last name:
	<sf:input path="lastName" id="lastName" name="lastName" type="text" value="B" /><br/>
Email:
	<sf:input path="email" id="email" name="email" type="text"/><br/>
username:
	<sf:input path="userName" id="userName" name="userName" type="text" value="jack" /><br/>
password:
	<sf:input path="passsword" id="password" name="password" type="text" value=" " /><br/>
	<input  type="submit" value="Register" />
</sf:form>
</body>
</html>