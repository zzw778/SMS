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
      width:207px;
      height:32px;
       border-style:none;
     /* box-shadow:0px 2px 2px black;  */
    }
    
    td{
      
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
                      <th>编号</th>
                      <th>员工姓名</th>
                      <th>当月扣除金额</th>
                      <th>当月奖励金额</th>
                      <th>原因</th>
                    </tr> 
        </thead>
        <tbody>
        <c:forEach  var="pa" items="${requestScope.ems}">
            <tr>
                <td class="nu"></td>
                <td>${pa.name}</td>
                <td>${pa.pun}</td>
                <td>${pa.reward}</td>
                <td>${pa.reason}</td>
              </tr>
        	</c:forEach>
     	</tbody>	  
           </table> 
           <script type="text/javascript">
        var arr=document.getElementsByClassName("nu");
          for(let i in arr){
    	     arr[i].innerText=parseInt(i)+parseInt(1);
          }   
       </script>
</body>
</html>