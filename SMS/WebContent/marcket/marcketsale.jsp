<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<style type="text/css">
   .btn{
      background-color: #80ffff;
      display:none;
       height:30px;
      width:55px;
      font-size:15px;
      text-align: center;
      padding-top:3px;
      margin-top:0px;
      /* visibility:hidden; */
   }
   .td{
      width:80px;
   }
   input{
     border-style: none;
     height:30px;
     width:100px;
   }
   a:hover{
     color:blue;
   }
</style>
</head>
<body>
<table class="table table-striped">
   <thead>
     <tr>
       <th>店名</th>
       <th>关系</th>
       <th>营业状态</th>
       <th>门店级别</th>
       <th>门店地址</th>
       <th>门店负责人</th>
       <th>门店月营业额</th>
     </tr>
   </thead>
   <tbody>
    <c:forEach  var="pa" items="${requestScope.sh}">
            <tr class="tr">
                <td><a class="a">${pa.shopname}</a></td>
                <td>${pa.rel}</td>
                <td class="t">${pa.state}</td>
                <td>${pa.lev}</td>
                <td>${pa.addr}</td>
                <td>${pa.per}</td>
                <td class="d"><input type="text" value="${pa.tur}" /></td>
                <td class="td"><button class="btn">删除</button></td>
              </tr>
        	</c:forEach>
   </tbody>
 </table>
 <script type="text/javascript">
     var Arr=document.getElementsByClassName("btn");
     var arr=document.getElementsByClassName("a");
     var arr1=document.getElementsByTagName("input");
     var Arr1=document.getElementsByClassName("t");
    
     for(let i in arr){
    	 arr[i].onclick=function(){
    		  if(Arr[i].style.display="none"){ 
    		     Arr[i].style.display="inherit";
    		  }
    	 }
    	 Arr[i].onmouseout=function(){
    		 Arr[i].style.display="none";
    	   }
    	 Arr[i].onclick=function(){
    		 document.location.href="deleteShopServlet?shopname="+arr[i].innerText;
    		 console.log(arr[i].innerText);
    	 }
    	 if(Arr1[i].innerText!="停业"){
    	  arr1[i].onfocus=function(){
    		 arr1[i].style.borderStyle="inset";
    	  }  
    	  arr1[i].onblur=function(){
    		 
     		 arr1[i].style.borderStyle="none";
     		document.location.href="updateSalServlet?tur="+arr1[i].value+"&shopname="+arr[i].innerText;
    		  
    		} 
    	 }else{
    		arr1[i].readOnly=true;
    	 }
    	  
    	 
     }
 </script>
</body>
</html>