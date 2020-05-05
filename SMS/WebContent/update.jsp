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
     .cname,.sname{
       border:0px;
       width:auto;
     }
 </style> 
</head>
<body> 
  <div id="div1"><h2>修改信息</h2></div>
     <div class="context">
       <table class="table table-striped">
       <thead>
         <tr>
         <th>商品名</th>
         <th>供货商</th>
         <th>商品产地</th>
         <th>商品单位</th>
         <th>商品批发价</th>
         <th>商品零售价</th>
         <th>商品保质期</th>
         <th>商品剩余数量</th>
         <th>备注</th>
         <th></th>
         </tr>
         </thead>
         <tbody>
         <c:forEach var="pa" items="${requestScope.comm}">
           <tr>
             <td><input value="${pa.cname}" class="cname" readonly/></td>
             <td><input value="${pa.sname}"  class="sname" readonly/></td>
             <td><input type="text" value="${pa.corig}" class="corig"/></td>
             <td><input type="text" value="${pa.cunit}" class="cunit"/></td>
             <td><input type="text" value="${pa.cinprice}" class="cinprice"/></td>
             <td><input type="text" value="${pa.coutprice}" class="coutprice"/></td>
             <td><input type="text" value="${pa.coutdate}" class="coutdate"/></td>
             <td><input type="text" value="${pa.cnu}" class="cnu"/></td>
             <td><input type="text" value="${pa.cremark}" class="cremark"/></td>
             <td><input type="button" value="修改" class="btn"/></td>
           </tr>
         </c:forEach>
         </tbody>
       </table> 
       </div>
   </div>
   <script type="text/javascript">
      var arr=document.getElementsByClassName("btn");
	  var ar1=document.getElementsByClassName("cname");
	  var ar2=document.getElementsByClassName("sname");
	  var ar3=document.getElementsByClassName("corig");
	  var ar4=document.getElementsByClassName("cunit");
	  var ar5=document.getElementsByClassName("cinprice");
	  var ar6=document.getElementsByClassName("coutprice");
	  var ar7=document.getElementsByClassName("coutdate");
	  var ar8=document.getElementsByClassName("cnu");
	  var ar9=document.getElementsByClassName("cremark");
     for(let i in arr){
        arr[i].onclick=function(){ 
    	    if(ar3[i].value!=""&&ar4[i].value!=""&&ar5[i].value!=""&&ar6[i].value!=""&&ar7[i].value!=""&&ar8[i].value!=""){
    	      document.location.href="CommupdateServlet?cname="+ar1[i].value+'&sname='+ar2[i].value+'&corig='+ar3[i].value+'&cunit='+ar4[i].value+'&cinprice='+ar5[i].value+'&coutprice='+ar6[i].value+'&coutdate='+ar7[i].value+'&cnu='+ar8[i].value+'&cremark='+ar9[i].value;
    	    }else{
    		  alert("选项不能为空！");
    	     }
        }
      }
      </script>
</body>
</html>