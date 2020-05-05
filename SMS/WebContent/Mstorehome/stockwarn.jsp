<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    
    thead{
      box-shadow:0px 5px 3px #dccfda;
     background-color: white;
    }
    th{
      width:130px;
      height:32px;
       border-style:none;
     /* box-shadow:0px 2px 2px black;  */
    }
    
    td{
       width:130px;
      height:40px;
      text-align: center;
     /*  border-right-style: groove; */
    }
    button{
      margin-left:0px;
      height:30px;
      width:50px;
      background-color: aqua;
      border-radius: 5px;
    }
    
    tbody tr:nth-child(2n+1){
      background-color:  #e2e4e7;
    }
    .demo{
       width:150px;
       height:25px;
       /* padding-top:2px; */
       
       border-radius: 6px;
       border-style: solid;
    }
    .demo:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
</style>
</head>

<body>
<table> 
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
                    </tr> 
        </thead>
        <tbody>
        <c:forEach  var="pa" items="${requestScope.comm}">
            <tr>
                <td>${pa.cname}</td>
                <td>${pa.sname}</td>
                <td>${pa.corig}</td>
                <td>${pa.cunit}</td>
                <td>${pa.cinprice}</td>
                <td>${pa.coutprice}</td>
                <td>${pa.coutdate}</td>
                <td>${pa.cnu}</td>
              </tr>
        	</c:forEach>
     	</tbody>	  
           </table> 
</body>
</html>