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
  overflow:hidden;
}
   .navbar{
   height:550px;
   width:15%;
   background:linear-gradient(#d1cbd1,snow); 
   /* background-color: #d1cbd1; */
   float:left;/* 很关键 */
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
#head{
    background-color: #eae8ea;
   }
.nav{
      float:left;
      //position:absolute;
      width:15%;
      height:550px;
      background: linear-gradient(#d5e3b3,snow);
   }
</style>
</head>
<body>
<div class="head">
  <div class="navbar" role="navigation">
    <ul class="nav">
	   <li id="head"><a>员工列表</a></li>
	   <li id="cen"><a>奖惩列表</a></li>
       <li  id="foot"><a>操作设置</a></li>
	 </ul>
  </div>
<div class="context">
   <iframe id="frame" src="CheckallemServlet" ></iframe> 
</div>
</div>
<script type="text/javascript">
  function changeone(a,b,c){
		document.getElementById("head").style.background=a;
		document.getElementById("cen").style.background=b;
		document.getElementById("foot").style.background=c;
	}
  document.getElementById("head").onclick=function(){
	  console.log(4);
		changeone('#eae8ea','none','none');
		document.getElementById("frame").src="CheckallemServlet";
		
	 }
  document.getElementById("cen").onclick=function(){
		changeone('none','#eae8ea','none');
		document.getElementById("frame").src="CheckremarkServlet";
  }
  document.getElementById("foot").onclick=function(){
		changeone('none','none','#eae8ea');
		document.getElementById("frame").src="operation.jsp";
}
		</script>
</body>
</html>