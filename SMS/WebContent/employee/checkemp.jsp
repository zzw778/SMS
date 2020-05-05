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
      width:200px;
      height:32px;
       border-style:none;
     /* box-shadow:0px 2px 2px black;  */
    }
    
    td{
      
      height:40px;
      text-align: center;
     /*  border-right-style: groove; */
    }
     /* tbody tr:nth-child(2n+1){
      background-color:  #e2e4e7;
    } */
   .demo:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
     button{
      margin-left:10px;
      margin-top:2px;
      height:28px;
      border-radius: 3px;
      width:30px;
      border-style: solid;
      cursor: pointer;
    } 
   .demo{
       width:100px;
       height:30px;
       padding-top:2px;
       margin-left:100px;
       border-radius: 6px;
       border-style: solid;
    }
 </style>
</head>
<body>
   <table> 
       <thead>
                    <tr>
                      
                      <th>员工姓名</th>
                      <th>身份证号</th>
                      <th>年龄</th>
                      <th>性别</th>
                      <th>职位</th>
                      <th>当月工资</th>
                      <th>今日出勤状态</th>
                      <th>操作</th>
                    </tr> 
        </thead>
        <tbody>
            <tr>
                <td id="name">${requestScope.em.name}</td>
                <td id="id">${requestScope.em.id}</td>
                <td>${requestScope.em.age}</td>
                <td>${requestScope.em.sex}</td>
                <td><input type="text" class="demo" id="pos" style="padding-left:5px;" value="${requestScope.em.pos}"/></td>
                <td><input type="text" class="demo" id="sal" style="padding-left:5px;" value="${requestScope.em.sal}"/></td>
                <td>${requestScope.em.job}</td>
                <td><button id="update">修改</button><button id="delete">删除</button></td>
              </tr>
     	</tbody>	  
           </table> 
<script type="text/javascript">
        var name=document.getElementById("name").innerText;
        var id=document.getElementById("id").innerText;
       var pos=document.getElementById("pos");
       var sal=document.getElementById("sal");
       document.getElementById("update").onclick=function(){
    	   document.location.href="updateemServlet?name="+name+"&id="+id+"&pos="+pos.value+"&sal="+sal.value;
       }
       document.getElementById("delete").onclick=function(){
    	   document.location.href="deleteemServlet?name="+name+"&id="+id;
       }
    
</script>
</body>
</html>