<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
被踢出 或则在另一地方登录，或已经达到此账号登录上限被挤掉。
<input type="button" id="login" value="重新登录"/>
<script src="/demo3/static/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    $("#login").click(function () {
        window.open("/auth/login");
    });
</script>
</body>
</html>