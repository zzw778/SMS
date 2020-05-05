<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="css/check.css"/> -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</head>
<body>
   <table id="table"class="table table-striped">
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
                      <td class="c">${pa.cname}</td>
                      <td class="s">${pa.sname}</td>
                      <td>${pa.corig}</td>
                      <td>${pa.cunit}</td>
                      <td>${pa.cinprice}</td>
                      <td>${pa.coutprice}</td>
                      <td>${pa.coutdate}</td>
                      <td>${pa.cnu}</td>
                      <td>${pa.cremark}</td>
                      <td><button>删除</button>
                    </tr>
                    </c:forEach>
                    </tbody>
           </table>

       
 <script type="text/javascript">
       var arr=document.getElementsByTagName("button");
       var Arr=document.getElementsByClassName("c");
       var Arr1=document.getElementsByClassName("s");
       for(let i in arr){
    	   arr[i].onclick=function(){  	
    		   document.location.href="CommdeleteServlet?cname="+Arr[i].innerText+"&sname="+Arr1[i].innerText;
    	   }
       }
       
 </script>
</body>
</html>