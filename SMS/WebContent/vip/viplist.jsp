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
     tbody tr:nth-child(2n+1){
      background-color:  #e2e4e7;
    }
    button{
      background-color: #80ffff;
      width:50px;
      height:30px;
      border-radius: 7px;
   }
 </style>
</head>
<body>
   <table> 
       <thead>
                    <tr>
                      <th>卡号</th>
                      <th>会员姓名</th>
                      <th>性别</th>
                      <th>身份证号</th>
                      <th>电话号码</th>
                      <th>生日</th>
                      <th>卡等级</th>
                      <th>到期时间</th>
                    </tr> 
        </thead>
        <tbody>
        <c:forEach  var="pa" items="${requestScope.ems}">
            <tr>
                <td>${pa.vnum}</td>
                <td>${pa.name}</td>
                <td>${pa.sex}</td>
                <td>${pa.vid}</td>
                <td>${pa.vphone}</td>
                <td>${pa.vbir}</td>
                <td>${pa.vlev}</td>
                <td>${pa.vdate}</td>
              </tr>
        	</c:forEach>
     	</tbody>	  
           </table> 
    <script type="text/javascript">
       
    
    </script>
</body>
</html>