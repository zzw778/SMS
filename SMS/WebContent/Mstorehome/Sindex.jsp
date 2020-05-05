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
.aside{
      float:left;
      //position:absolute;
      width:15%;
      height:550px;
      background: linear-gradient(#d5e3b3,snow);
   }
   #frame{
   width:100%;
   height:100%;
    border-style: none;  
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
   </style>
</head>
<body>
<div class="all">
  <div class="aside">
      <ul>
         <li id="head">供货商列表</li>
         <li id="cen">库存报警</li>
      </ul>
  </div>
  <div class="context">
  <div class="in">
    <iframe id="frame" src="allStoreServlet" ></iframe> 
    </div>
  </div>
  </div>
  <script type="text/javascript">
  function changeone(a,b,c){
		document.getElementById("head").style.background=a;
		document.getElementById("cen").style.background=b;
	}
  document.getElementById("head").onclick=function(){
	  console.log(4);
		changeone('#eae8ea','none');
		document.getElementById("frame").src="allStoreServlet";
		
	 }
  document.getElementById("cen").onclick=function(){
		changeone('none','#eae8ea');
		document.getElementById("frame").src="StockwarnServlet";
  }
		</script>
</body>
</html>