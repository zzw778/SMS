<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function changeone(a,b,c,d){
	document.getElementById("1").style.background=a;
	document.getElementById("2").style.background=b;
	document.getElementById("3").style.background=c;
	document.getElementById("4").style.background=d;
}
function change1(){
	changeone('#eae8ea','none','none','none');
	document.getElementById("frame").src="CommallServlet";
	
 }
     function addcommodity(){
    	 changeone('none','#eae8ea','none','none');
    		document.getElementById("frame").src="add.jsp";
    	 
     }
     
        function checkcommodity(){
        	
        	var cname=prompt("输入要查找的商品：");
        	
        	if(cname!=null){
        	if(cname==""){
        		alert("选项不能为空！");
        	 }else{
        		 changeone('none','none','none','#eae8ea');
        	     var frame=document.getElementById("frame");
        	         frame.src="CommcheckoneServlet?cname="+cname;
        	  }
        	}
        	/* window.location.href="CommcheckoneServlet?cname="+cname; */
        	
        	/* document.getElementsById("table").style.display="none";
        	document.getElementsById("table1").style.display="block"; */
        	  
        }
        
        function updatecommodity(){
        	
        	var cname=prompt("输入要修改的商品：");
        	
        	//window.location.href="updatecheckServlet?cname="+cname;
        	xmlHttpRequest=new XMLHttpRequest();//不加var是全局变量
        	//设置回调函数
        	//xmlHttpRequest.onreadystatechange=callBack;
        	
        	xmlHttpRequest.open("post","updateajaxServlet",true);
        	//设置post方式的头信息,说明一下提交的数据类型是一个经过url编码的form表单数据
        	xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
        	xmlHttpRequest.send("cname="+cname);//k=v	
        	xmlHttpRequest.onreadystatechange=function(){
        		if(xmlHttpRequest.readyState===4 && xmlHttpRequest.status===200){
            		//接受服务端返回的值（此处为responsetext型）
            		var data=xmlHttpRequest.responseText;
            		if(cname!=null){
            		if(cname!=""){
                	    if(data==="true"){
                	    	changeone('none','none','#eae8ea','none');
                	    	document.getElementById("frame").src="updateServlet?cname="+cname;
                	    	
                	    }else if(data==="false")
                	    	  alert("不存在此商品！");
                		 }else
                 	    	alert("选项不能为空！");
            		}
            	}
        	}
        	/* window.open("add.jsp");
        	window.close(); */

        }        
        function deletecommodity(){
        	var cname=prompt("输入商品名：");//点击取消按钮返回null
        	//通过ajax异步方式请求服务器
        	xmlHttpRequest=new XMLHttpRequest();//不加var是全局变量
        	//设置回调函数
        	//xmlHttpRequest.onreadystatechange=callBack;
        	
        	xmlHttpRequest.open("post","CommdeleteServlet",true);
        	//设置post方式的头信息,说明一下提交的数据类型是一个经过url编码的form表单数据
        	xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
        	xmlHttpRequest.send("cname="+cname);//k=v	
        	xmlHttpRequest.onreadystatechange=function(){
        		if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200){
            		//接受服务端返回的值（此处为responsetext型）
            		var data=xmlHttpRequest.responseText;
            		if(cname!=null){
            		 if(cname!=""){
            	    if(data==="true"){
            	    	document.location.href="index1.jsp";
            	    }else if(data==="false")
            	    	  alert("不存在此商品！");
            		 }else
             	    	alert("选项不能为空！");
            		}
            	}
        	}
        

        	/* for(var i=0;i<7;i++){
           	 document.getElementsByTagName("th")[i].setAttribute("style","width:100px");
           	}
        	 document.getElementById("hide").style.display="block"; */
        	
        }
        	
</script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<style type="text/css">
   body{
  overflow:hidden;
}
   .navbar{
   height:550px;
   width:15%;
   background:linear-gradient(#d1cbd1,snow); 
   /* background-color: #d1cbd1; */
   float:left;/* 很关键 */
   }
  
   .nav{
    text-align: center;
  } 
  
  .active{
 
   text-align: center;
   background-color: #eae8ea;
  }
  .context{
     float:left;
     width:85%;
     height:550px;
    background-color: #f8f8f8;
  }
  
  #frame{
	width:100%;
	height:100%;
      border:medium none;   
	 
}
</style>
</head>



<body>
<div class="head">
  <div class="navbar" role="navigation">
    <ul class="nav">
	   <li><a href="javascript:void(0);" class="active" id="1" onclick="change1()">商品列表</a></li>
       <li><a href="javascript:void(0);" id="2" onclick="addcommodity()">商品入库</a></li>
       <li><a href="javascript:void(0);" id="3" onclick="updatecommodity()">修改商品</a></li>
       <li><a href="javascript:void(0);" id="4" onclick="checkcommodity()">查找商品</a></li>
	 </ul>
  </div>
<div class="context">
   <iframe id="frame" src="CommallServlet" ></iframe> 
</div>
 <%-- <div class="page">
               <p>商品数：${requestScope.count}个</p>
  </div> --%>
</div>
<script src="https://www.imooc.com/static/lib/jquery/1.9.1/jquery.js"></script>
<script src="http://img.mukewang.com/down/53c6484f00013d9300000000.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>