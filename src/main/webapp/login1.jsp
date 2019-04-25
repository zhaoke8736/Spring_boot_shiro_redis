<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <center>
    <form id="dlform" method="post" action="/demo3/auth/login">
    	<input type="text" id="username" name="username" value="" />
    	<input type="password" name="password"  id="password"/>
    	<input type="submit" id="dl" value="登录" />
    </form>
    </center>

</body>
</html>
<!--<script src="static/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	
//	 $("#dl").on("click",function(){
//	 	$.ajax({
// type: "POST",
// url: "auth/login",
// data: $("#dlform").serialize()
//});
//	 });
	 
</script>-->