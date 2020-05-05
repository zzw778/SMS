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
       height:40px;
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
    table{
       margin-left:10px;
    }
    thead{
      box-shadow:5px 5px 5px #ede7ec;
     
    }
    th{
      width:205px;
      height:40px;
     
      
    }
    
    td{
       width:205px;
      height:40px;
      text-align: center;
      
    }
     
    .ac{
        width:150px;
      height:40px;
      margin-left:0px;
    }
    tbody tr:nth-child(2n+1){
      background-color: #e2e4e7;
    }
    span{
       margin-left:50px;
    }
    button{
      margin-left:10px;
      margin-top:2px;
      height:28px;
      border-radius: 3px;
      width:60px;
      border-style: solid;
     cursor: pointer;
    } 
    #check{
       width:200px;
       height:25px;
       padding-bottom:3px;
 
       margin-left:100px;
       border-radius: 6px;
       border-style: solid;
    }
    #check:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
</style>
</head>
<body>
<div class="all">
<div class="head">
   <p>${requestScope.ca}销售记录<span><input type="date" id="check" style="padding-left:5px;"/></span><button id="btn">查找</button><button id="bt">返回</button></p>
</div>
<div class="context">
  <table>
  <thead>
    <tr>
    <th>商品名称</th>
    <th>商品提供方</th>
    <th>商品单价</th>
    <th>出售件数</th>
    <th>出售时间</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="pa" items="${requestScope.sa}">
       <tr>
         <td class="t">${pa.cname}</td>
         <td>${pa.sname}</td>
         <td>${pa.coutprice}</td>
         <td>${pa.sale}</td>
         <td>${pa.cdate}</td>
       </tr>
     </c:forEach>
  </tbody> 
  </table>
  </div>
  </div>
    <script type="text/javascript">
       var ck=document.getElementById("check");
       var btn=document.getElementById("btn");
       var da=document.getElementById("da");
       var bt=document.getElementById("bt");
       btn.onclick=function(){
    	   document.location.href="SaledateRecordServlet?cdate="+ck.value;
       }
       bt.onclick=function(){
    	   document.location.href="saleRecordServlet";
       }
    </script>

</body>
</html>