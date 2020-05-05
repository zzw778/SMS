<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/updatemanage.css">
   <script type="text/javascript">
           
          function jump(){
        	 /*  var arr=[name,mpo,msal,myear,msex,mnum,mid];
        	    for(var i=0;i<arr.length;i++){
        	    	i=document.getElementById("arr[i]").value;
        	    } */
        	  var name=document.getElementById("name").value;
        	  var mpo=document.getElementById("mpo").value;
        	  var msal=document.getElementById("msal").value;
        	  var myear=document.getElementById("myear").value;
        	  var msex=document.getElementById("msex").value;
        	  var mnum=document.getElementById("mnum").value;
        	  var mid=document.getElementById("mid").value; 
      	    
        	  if(name!=""&&mpo!=""&&msal!=""&&myear!=""&&msex!=""&&mnum!=""&&mid!=""){
        	    document.location.href="updateManageServlet?name="+name+'&mpo='+mpo+'&msal='+msal+'&myear='+myear+'&msex='+msex+'&mnum='+mnum+'&mid='+mid;
        	    
        	  }else
        		  alert("选项不能为空！");
        	  
        		  
          }
   
   </script>
</head>
<body>
   <div id="dv">
   <div id="div1"><h2>个人信息</h2></div>
     <div id="div2">
    <table>
         <tr><td>姓名：<input type="text" id="name" readonly/></td></tr>
         <tr><td>职位：<input type="text" id="mpo"/></td></tr>
         <tr><td>工资：<input type="text" id="msal" /></td></tr>
         <tr><td>年龄：<input type="text" id="myear"/></td></tr>
         <tr><td>性别：<input type="text" id="msex"/></td></tr>
         <tr><td>电话号码：<input type="text" id="mnum"/></td></tr>
         <tr><td>身份证号：<input type="text" id="mid"/></td></tr>
    </table>
    <script type="text/javascript">
         arr=JSON.parse(localStorage.getItem('arr'));
    	document.getElementById("name").value=arr[0];
    	document.getElementById("mpo").value=arr[1];
    	document.getElementById("msal").value=arr[2];
    	document.getElementById("myear").value=arr[3];
    	if(document.getElementById("msal").value=='-1')
    	    document.getElementById("msal").value=null;
    	else
    		document.getElementById("msal").value=arr[2];
    	if(document.getElementById("myear").value=='-1')
    	    document.getElementById("myear").value=null;
    	else
    	document.getElementById("myear").value=arr[3];
    	document.getElementById("msex").value=arr[4];
    	document.getElementById("mnum").value=arr[5];
    	document.getElementById("mid").value=arr[6];
    </script>
    </div>
    <div id="div3">
    <button id="btn" onclick="jump()">修改</button>
    </div>
    </div>
</body>
</html>