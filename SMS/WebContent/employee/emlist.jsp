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
                      <th>编号</th>
                      <th>员工姓名</th>
                      <th>身份证号</th>
                      <th>年龄</th>
                      <th>性别</th>
                      <th>职位</th>
                      <th>当月工资</th>
                      <th>今日出勤状态</th>
                      <th>备注</th>
                    </tr> 
        </thead>
        <tbody>
        <c:forEach  var="pa" items="${requestScope.ems}">
            <tr>
                <td class="nu"></td>
                <td class="name">${pa.name}</td>
                <td class="id">${pa.id}</td>
                <td>${pa.age}</td>
                <td>${pa.sex}</td>
                <td>${pa.pos}</td>
                <td>${pa.sal}</td>
                <td><button class="btn">${pa.job}</button></td>
                <td>${pa.re}</td>
              </tr>
        	</c:forEach>
     	</tbody>	  
           </table> 
    <script type="text/javascript">
       var arr=document.getElementsByClassName("nu");
       for(let i in arr){
    	   arr[i].innerText=parseInt(i)+parseInt(1);
       }
       
       var arr=document.getElementsByClassName("btn");
       var Arr=document.getElementsByClassName("name");
       var arr1=document.getElementsByClassName("id");
       function change(a){
       	if(a.innerText=="出勤"){
       		a.innerText="请假";
       		a.style.background="#ffa4d1";
       		
       	}else{
       		a.innerText="出勤";
       		a.style.background=" #80ffff";
       	}
       }
       window.onload=function(){
       for(let i in arr){
          arr[i].onclick=function(){
       	  change(arr[i]);
       	  document.location.href="updatejobServlet?name="+Arr[i].innerText+"&id="+arr1[i].innerText+"&job="+arr[i].innerText;
          }
       }
       
       }
    
    </script>
</body>
</html>