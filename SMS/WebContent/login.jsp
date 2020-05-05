<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function login(){
	var r1=document.getElementById("r1");
	var r2=document.getElementById("r2");
    var sname=$("#sname").val();
    var pwd=$("#pwd").val();
  if(sname==""||pwd==""){
	  alert("选项不能为空!");
  } else{
	  
 $.ajax({
	  url:"manageAjaxServlet",
	  type:"post",
	  data:"sname="+sname+"&pwd="+pwd,//传入ajaxservlet中的值
	  success:function(result,testStatus){
		  
		  if(result=="true"){
			  alert("登录成功！");
			  document.location.href="StartServlet?name="+sname;
		  }else{
			  alert("登录失败，用户名或密码错误！");
		    }
		  }
	     });
  }
}


   function register(){
	   document.location.href="register.jsp";
   }
   
   
</script>
</head>
<body>
<div class="div" >
   <div class="div2">
     <div class="context">
      <div class="title">连锁店商品管理系统</div>
     <!--  <div class="div3image">
           <img alt="logo" src="images/1.png">
      </div> -->
      
     </div>
      <div class="input">
         <form1>
            <p><span class="p1">姓名   <input type="text" id="sname" style="padding-left:10px;font-size:15px;" autofocus required/></span></p>
            <p><span class="p2">密码   <input type="password" id="pwd" maxlength="6" style="padding-left:10px;font-size:15px;" autofocus required/></span></p>
         </form1>
         <form2>
            <p><span class="p3"><input type="button" value="登录" onclick="login()"/>
            <input type="button" value="注册" onclick="register()"/></span></p>
            
         </form2>
    
     </div>
   </div>
</div>


</body>
</html>