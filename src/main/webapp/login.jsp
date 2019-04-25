<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="auth/login" method="post">
    <span style="background: red" id="msg"></span>
    <input type="text" name="username" id="username"/>
    <input type="password" name="password" id="password"/>
    <button class="login" type="submit" value="submit">Submit</button>
</form>
<script src="/demo3/static/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    $(".login").click(function () {
        var userName = $("#username").val();
        if (userName == '' || userName == null) {
            alert("用户名输入不能为空");
            return;
        }
        var password = $("#password").val();
        if (password == '' || password == null) {
            alert("密码输入不能为空");
            return;
        }
    });
    <% String msg = (String)request.getAttribute("msg"); %>
    if ('<%=msg%>' != 'null') {
        $("#msg").html('<%=msg%>');
    }
</script>
</body>
</html>