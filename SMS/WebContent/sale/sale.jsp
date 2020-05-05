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
    .head{
       width:100%;
       height:32px;
       background-color: snow;
       box-shadow:5px 5px 5px #ede7ec;
       
       
    }
    p{
      padding-top:5px;
      padding-left:20px;
      color:#9c9287;
      font-style:italic; 
      font-size: 14px;
    }
    
    thead{
      box-shadow:5px 5px 5px #ede7ec;
     
    }
    th{
      width:176px;
      height:40px;
     /*  border-right-style: groove; */
      
    }
    
    td{
       width:176px;
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
    
    .ac{
        width:150px;
      height:40px;
      margin-left:0px;
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
<div class="all">
<div class="head">
   <p>商品销售</p>
</div>
<div class="context">
  <table>
  <thead>
    <tr>
    <th>商品名称</th>
    <th>商品提供方</th>
    <th>商品剩余数量</th>
    <th>商品单价</th>
    <th>出售件数</th>
    <th class="ac">操作</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="pa" items="${requestScope.comms}">
       <tr>
         <td class="t">${pa.cname}</td>
         <td class="d">${pa.sname}</td>
         <td>${pa.cnu}</td>
         <td>${pa.coutprice}</td>
         <td><input type="text" class="demo" style="padding-left:5px;"/></td>
         <td class="ac"><button>出售</button></td>
       </tr>
     </c:forEach>
  </tbody> 
  </table>
  </div>
  </div>
  <script type="text/javascript">
     var arr=document.getElementsByTagName("button");
     var Arr=document.getElementsByTagName("input");
     var arr1=document.getElementsByClassName("t");
     var Arr1=document.getElementsByClassName("d");
     for(let i in arr){
    	 arr[i].onclick=function(){
    		 /* var myDate = new Date();
    		   var da=myDate.toLocaleDateString();     //获取当前日期 */
    		 document.location.href="SaleCommServlet?sale="+Arr[i].value+"&cname="+arr1[i].innerText+"&sname="+Arr1[i].innerText;
    	 }
     }
  </script>
</body>
</html>