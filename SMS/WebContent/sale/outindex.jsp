<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
  margin:0px;
  padding:0px;
}
body{
   overflow: hidden; 
}
   .aside{
      float:left;
      //position:absolute;
      width:15%;
      height:550px;
      background: linear-gradient(#d5e3b3,snow);
   }
   li{
     text-align: center;
     width:100%;
     height:20px;
     color:purple;
     list-style: none;
     padding-top:10px;
     padding-bottom:10px;
   }
   
  
   li:hover{
    color:black;
    cursor:pointer;
   }
   ul{
   position:absolute;
   height:40%;
   width:15%;
   }
   .context{
    float:left;
      width:85%;
      height:550px;
   }
   .in{
  
     width:1200px;
     height:100%;
   }
   #frame{
   width:100%;
   height:100%;
   border-style: none;  
   }
   #head{
    background-color: #eae8ea;
   }
</style>
</head>
<body>
<div class="all">
  <div class="aside">
      <ul>
         <li id="head" onclick="change1()">商品卖出</li>
         <li id="cen" onclick="change2()">商品销售记录</li>
         <li id="foot" onclick="change3()">财务信息</li>
      </ul>
  </div>
  <div class="context">
  <div class="in">
    <iframe id="frame" src="allCommsaleServlet" ></iframe> 
    </div>
  </div>
  </div>
  <script type="text/javascript">
  function changeone(a,b,c){
		document.getElementById("head").style.background=a;
		document.getElementById("cen").style.background=b;
		document.getElementById("foot").style.background=c;
	}
	function change1(){
		changeone('#eae8ea','none','none');
		document.getElementById("frame").src="allCommsaleServlet";
		
	 }
	function change2(){
		changeone('none','#eae8ea','none');
		document.getElementById("frame").src="saleRecordServlet";
		
		
		
	 }
	function change3(){
		changeone('none','none','#eae8ea');
		document.getElementById("frame").src="SalaryServlet";
		
	 }
  </script>
</body>
</html>