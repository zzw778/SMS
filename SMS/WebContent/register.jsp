<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/register.css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
         function register(){
        	   /* var result = localStorage.getItem("result");  在js中传值*/
        	   
        	   var name=$("#name").val();
        	   var pwd=$("#pwd").val();
        	   var npwd=$("#npwd").val();
        	   if(name==""||pwd==""){
        			  alert("选项不能为空!");
        		  } else{
        		        if(pwd==npwd){
        		          $.ajax({
        			        url:"manageregisterServlet",
        			        type:"post",
        			        data:"name="+name+"&pwd="+pwd,//传入ajaxservlet中的值
        			        success:function(result,testStatus){
        				    if(result=="true"){
        					  alert("注册成功！");
        					  document.location.href="login.jsp";
        				    }else 
        				    	alert("注册失败，用户名已存在！");
        				      }
        			        });
        		         }else
        			       alert("两次输入密码不相等!"); 
             }
         }
</script>

</head>
<body>
     <div class="header">
            <div class="head"> <h2>注册</h2></div>
            <div class="context">
               <div class="headtext">
                <table>
                   <tr><td>姓名</td><td><input type="text" id="name" /></td></tr>
                   <tr><td>密码</td><td><input type="password" id="pwd" /></td></tr>
                   <tr><td>确认密码</td><td><input type="password" id="npwd" /></td></tr>
                </table>
               </div>
            </div>
            <div class="foot">
                <div class="title">
                   <input type="submit" value="注册" onclick="register()"/>
                   <a href="login.jsp"><input type="submit" value="返回"/></a>
                </div>
            </div>
    </div>
</body>
</html>