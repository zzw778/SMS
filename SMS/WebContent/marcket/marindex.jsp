<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
   background-color: aqua;
   text-align: left;
   font-weight: bold;
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
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
</head>
<body onload="change()">
<div class="head">
  <div class="navbar" role="navigation">
    <ul class="nav">
	   <li class="active"><a>门店管理</a></li>
       <li><a href="javascript:void(0);" id="1" onclick="change1()">门店列表</a></li>
       <li><a href="javascript:void(0);" id="2" onclick="change2()">新增门店</a></li>
       <li><a href="javascript:void(0);" id="3" onclick="change3()">门店销量排行</a></li>
	 </ul>
  </div>
<div class="context">
   <iframe id="frame" src="AllShopServlet" ></iframe> 
</div>
</div>
<script src="https://www.imooc.com/static/lib/jquery/1.9.1/jquery.js"></script>
<script src="http://img.mukewang.com/down/53c6484f00013d9300000000.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
function change(){
	document.getElementById("1").style.background="#eae8ea";
	if(document.getElementById("frame").src="AllShopServlet"){
		changeone('#eae8ea','none','none');
	}
}
function changeone(a,b,c){
	document.getElementById("1").style.background=a;
	document.getElementById("2").style.background=b;
	document.getElementById("3").style.background=c;
}
function change1(){
	changeone('#eae8ea','none','none');
	document.getElementById("frame").src="AllShopServlet";
	
 }
function change2(){
	changeone('none','#eae8ea','none');
	document.getElementById("frame").src="addshop.jsp";
	
	
	
 }
function change3(){
	changeone('none','none','#eae8ea');
	document.getElementById("frame").src="ShopSaleServlet";
	
 }
</script>
</body>
</html>