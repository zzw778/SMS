<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<style type="text/css">
h1{
font-family: STLiti;
}
    td:first-child{
      text-align: right;
      padding:20px 15px;
      font-family: FZShuTi;
      font-size: 20px;
    }
    
    input{
       width:300px;
       background-color: white;
    }
    button{
     width:200px;
     margin-top:30px;
     margin-left:300px;
     background-color:white;
     box-shadow: 5px 5px white;
    }
</style>
</head>
<body>
   <div class="container">
   <div class="head">
     <h1>基本资料</h1>
   </div>
  
   <div class="context">
         <table>
         <tr><td>门店名称</td><td><input type="text" id="name"/></td></tr>
         <tr><td>门店地址</td><td><input type="text" id="addr"/></td></tr>
         <tr><td>负责人</td><td><input type="text" id="per"/></td></tr>
         <tr><td>负责人手机号</td><td><input type="text" id="pnum"/></td></tr>
         <tr><td>门店号码</td><td><input type="text" id="num"/></td></tr>
         <tr><td>开业时间</td><td><input type="date" id="time"/></td></tr>
         <tr><td>关系</td><td><input type="text" id="rel"/></td></tr>
         <tr><td>级别</td><td><input type="text" id="lev"/></td></tr>
       </table> 
       <button id="btn" onclick="check()">保存</button>
   </div>
   </div>
   <script src="https://www.imooc.com/static/lib/jquery/1.9.1/jquery.js"></script>
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  function check(){
        var name=document.getElementById("name").value;
        var addr=document.getElementById("addr").value;
        var per=document.getElementById("per").value;
        var pnum=document.getElementById("pnum").value;
        var num=document.getElementById("num").value;
        var time=document.getElementById("time").value;
        var rel=document.getElementById("rel").value;
        var lev=document.getElementById("lev").value;
        document.location.href="AddShopServlet?name="+name+"&rel="+rel+"&lev="+lev+"&addr="+addr+"&per="+per+"&pnum="+pnum+"&num="+num+"&time="+time;
        
      }
  </script> 
</body>
</html>