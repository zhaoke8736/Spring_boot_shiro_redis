<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a{
		text-decoration: none;
		
	}
</style>
</head>
<body>
	<center>
	   <input type="text" id="stuname" value="" />&nbsp;
	   <select name="banji" id="banji">
	   	<option value="0">请选择</option>
	   </select>&nbsp;
	   <input type="button" id="cx" value="查询" />
	   <input type="button" value="添加学生" id="tj" />
       <table border="1px" cellspacing="" cellpadding="" width="650px" id="cxtable">
       	    <tr>
       	    	<td>学生编号</td>
       	    	<td>学生姓名</td> 
       	    	<td>学生性别</td> 
       	    	<td>学生生日</td>
       	    	<td>学生班级</td>
       	    	<td width="180px">操作</td>
       	    </tr>
       </table>
       </center>
</body> 
</html>
<script src="static/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>  
<script type="text/javascript">
	   $("#cx").on("click",function(){
	   	       $("#cxtable").find("tr:gt(0)").empty();
	   	$.ajax({
   type: "POST",
   url: "Test/queryAll",
   data: {"stuname":$("#stuname").val(),
          "classno":$("#banji").val()
   },
   dataType:"json",
   success: function(msg){
   //console.log(msg.cx+"赵柯");
      	$.each(msg, function(a,c) {
      		      	 $("#cxtable").append("<tr><td>"+c.stuno+"</td><td>"+c.stuname+"</td><td>"+c.sex+"</td><td>"+c.indate+"</td><td>"+c.classname+"</td><td><a href='/Spring_Mybatis/XueXiaoController/queryScoreByID/"+c.stuno+"' class='fs'>查询分数</a>&nbsp;<a href='#' class='xg'>修改</a>&nbsp;<a href='#' class='sc'>删除</a></td></tr>")
      	});
      	
   }
});
	   });
	   
	   $(document).on("click",".sc",function(){
		   if (confirm("你确定删除该学生？(删除后该学生的成绩也会一起删除)")) {
	   	$.ajax({
   type: "POST",
   url: "XueXiaoController/delete",
   data: "stuno="+$(this).closest("tr").find("td:eq(0)").html()
});
      $(this).closest("tr").remove();
		   }
	   });
    //填充班级	   
	   $.ajax({
   type: "POST",
   url: "XueXiaoController/tcbj",
   dataType: "json",
   success: function(msg){
   $.each(msg, function(a,b) {
      $.each(b, function(c,d) {
      	 $("#banji").append("<option value='"+d.classno+"'>"+d.classname+"</option>");
      });
    
   });
   } 
});
$("#tj").on("click",function(){
      location.href = "AddXueShen.jsp";
}) 
</script>