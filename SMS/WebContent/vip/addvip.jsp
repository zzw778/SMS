<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function check(){
    	var vnum=document.getElementById("vnum").value;
    	var name=document.getElementById("name").value;
    	var sex=document.getElementById("sex").value;
    	var vid=document.getElementById("vid").value;
    	var vphone=document.getElementById("vphone").value;
    	var vbir=document.getElementById("vbir").value;
    	var vlev=document.getElementById("vlev").value;
    	var vmon=document.getElementById("vmon").value;
    	var vdate=document.getElementById("vdate").value;
    	document.location.href="AddvipServlet?name="+name+"&vnum="+vnum+"&sex="+sex+"&vid="+vid+"&vphone="+vphone+"&vbir="+vbir+"&vlev="+vlev+"&vmon="+vmon+"&vdate="+vdate;
    }
</script>
<style type="text/css">

    td:first-child,td:nth-child(3){
      text-align: right;
      padding:20px 15px;
      
      font-size: 15px;
    }
    
    
    
    .demo{
       width:300px;
       height:25px;
       padding-left:5px;
       border-radius: 6px;
       border-style: solid;
    }
    
    .demo:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
    button{
     width:100px;
     height:40px;
     margin-top:30px;
     margin-left:800px;
     background-color:white;
     box-shadow: 5px 5px white;
     border-radius: 10px;
    }
    .container{
        margin-left:200px;
    }
    span{
    font-size:15px;
      margin-left:30px;
      font-family: serif;
    }
    .ac:before{
      content:"*";
    }
</style>
</head>
<body>
  <div class="context">
         <table>
         <tr><td>卡号：</td><td class="ac"><input class="demo" type="text" id="vnum" /></td>
         <td>姓名：</td><td class="ac"><input  class="demo" type="text" id="name" /></td></tr>
         <tr><td>性别：</td><td class="ac"><input class="demo" type="text" id="sex" /></td>
         <td>身份证号：</td><td class="ac"><input class="demo" type="text" id="vid" /></td></tr>
         <tr><td>电话号码：</td><td class="ac"><input class="demo" type="text" id="vphone" /></td>
         <td>生日：</td><td><input class="demo" type="text" id="vbir"/></td></tr>
         <tr><td>卡等级：</td><td class="ac"><input class="demo" type="text" id="vlev" /></td>
         <td>售卡金额：</td><td><input class="demo" type="text" id="vmon"/></td></tr>
         <tr><td>到期时间：</td><td class="ac"><input class="demo" type="date" id="vdate" /></td></tr>
       </table> 
       <button id="btn" onclick="check()">保存</button>
   </div>
</body>
</html>