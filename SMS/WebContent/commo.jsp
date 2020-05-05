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
 tbody tr:nth-child(2n+1){
      background-color:  #e2e4e7;
    }
</style>
</head>
<body>

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
                    </tr> 
        </thead>
        <tbody>
        <c:forEach  var="pa" items="${requestScope.comms}">
            <tr>
                <td>${pa.cname}</td>
                <td>${pa.sname}</td>
                <td>${pa.corig}</td>
                <td>${pa.cunit}</td>
                <td>${pa.cinprice}</td>
                <td>${pa.coutprice}</td>
                <td>${pa.coutdate}</td>
                <td>${pa.cnu}</td>
                <td>${pa.cremark}</td>
              </tr>
        	</c:forEach>
     	</tbody>	  
           </table> 
</body>
</html>