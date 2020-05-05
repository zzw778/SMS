<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>连锁超市管理</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css">
<script src="js/login.js"></script>
<script type="text/javascript">

            function change(){
            	document.getElementById("1").style.background="#b0c4f7";
            }
            
            function message(){
         	   var name="${requestScope.name}";
         	   window.open("manageupdateServlet?name="+name);
         	   //document.location.href="manageupdateServlet?name="+name;
            }
           
</script>
</head>
<body onLoad="change()">
 <div class="container">
      <div class="header">
           <div class="head">
             <div class="heading">
               <div class="title">xxx连锁店总店</div>
               <div class="headname" id="name">${requestScope.name}</div>
               <div class="headimage">
                    <img src="images/chaoshi.jpg">
                    <a href="javascript:void(0);" onclick="message()">个人信息</a>
               </div>
             </div>
            </div>  
            
           <div class="context">
             <div class="botton">
               <ul>
                 <li><a href="javascript:void(0);"  id="1" onclick="change1()" >商品管理</a></li>
                 <li><a href="javascript:void(0);"  id="2" onclick="change2()" >库存管理</a></li>
                 <li><a href="javascript:void(0);" id="3" onclick="change3()">会员信息管理</a></li>
                 <li><a href="javascript:void(0);" id="4" onclick="change4()">商品销售</a></li>
                 <li><a href="javascript:void(0);" id="5" onclick="change5()">员工管理</a></li>
                 <li><a href="javascript:void(0);" id="6"onclick="change6()">连锁店铺信息</a></li> 
               </ul>
             </div>  
              <iframe id="frame1" src="allitemServlet"></iframe><!--  scrolling="no" -->
              
              <div class="foot">
            <div class="foottext">
             @安徽工程大学
             </div> 
             </div>
          </div> 
          
      </div>
      
 </div>
 
</body>
</html>