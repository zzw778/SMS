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
   input{
      background-color: #80ffff;
   }
   .sal{
   display:none;
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
       <th>门店号码</th>
       <th>门店负责人</th>
       <th>门店负责人号码</th>
       <th>门店开业时间</th>
     </tr>
   </thead>
   <tbody>
    <c:forEach  var="pa" items="${requestScope.sh}">
            <tr>
                <td class="name">${pa.shopname}</td>
                <td>${pa.rel}</td>
                <td><input type="button" class="btn" value="${pa.state}"/></td>
                <td>${pa.lev}</td>
                <td>${pa.addr}</td>
                <td>${pa.num}</td>
                <td>${pa.per}</td>
                <td>${pa.pnum}</td>
                <td>${pa.stime}</td>
                <td class="sal">${pa.tur}</td>
              </tr>
        	</c:forEach>
   </tbody>
 </table>
 <script type="text/javascript">
    var arr=document.getElementsByClassName("btn");
    var Arr=document.getElementsByClassName("name");
    var arr1=document.getElementsByClassName("sal");
    function change(a){
    	if(a.value=="营业"){
    		a.value="停业";
    		a.style.background="#ffa4d1";
    		
    	}else{
    		a.value="营业";
    		a.style.background=" #80ffff";
    	}
    }
    window.onload=function(){
    for(let i in arr){
    	if(arr[i].value=="停业"){
    		arr[i].style.background="#ffa4d1";
    		
    	}
       arr[i].onclick=function(){
    	  change(arr[i]);
    	  if(arr[i].value=="停业"){
      		arr1[i].innerText="0";
      	   }
    	  document.location.href="updateShopServlet?state="+arr[i].value+"&shopname="+Arr[i].innerText;
       }
    }
    
    }
 </script>
</body>
</html>