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


.head,.center{
       width:100%;
       height:32px;
       background-color: snow;
       box-shadow:0px 5px 2px #e0d6de;
}
.center{
   margin-top:100px;
}

.foot{
       margin-top:20px;
       padding-top:0px;
       width:100%;
       height:40px;
       background-color: snow;
       box-shadow:0px 5px 2px #e0d6de;
}

.context{
   margin-top:25px;
   display:inline;
}
   thead{
      box-shadow:5px 5px 5px #ede7ec;
    }
    th{
      width:259px;
      height:40px;
     /*  border-right-style: groove; */
      
    }
   
    td{
      
      height:100px;
      text-align: center;
    }
    p{
      padding-top:5px;
      padding-left:20px;
      color:#9c9287;
      font-style:italic; 
      font-size: 14px;
    }
    .demo{
       width:250px;
       height:30px;
       padding-top:2px;
       margin-left:100px;
       border-radius: 6px;
       border-style: solid;
    }
    .dem,.all{
       width:250px;
       height:30px;
       padding-top:2px;
       margin-left:100px;
       border-radius: 6px;
       border-style: none;
    }
    
    
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
      width:60px;
      border-style: solid;
      cursor: pointer;
    } 
    </style>
</head>
<body>
<div class="head"><p>日销售额</p></div>
    <table>
    <thead>
      <tr>
         <th>日期</th>
         <th>卖出商品</th>
         <th>销售额</th>
         <th>净利润</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td id="date"></td>
        <td id="comm"></td>
        <td id="sal"></td>
        <td id="pro"></td>
      </tr>
      </tbody>
    </table>
<div class="center">
   <p>查询日销售额</p>
</div>
 <div class="context"> 
<p>请输入日期</p><input type="date" id="demo" class="demo" style="padding-left:5px;"><button id="btn">查询</button>
<p>当日利润</p>
<input type="text" id="p" class="dem" value="" style="padding-left:5px;" readonly/>
</div>
<div class="foot">
   <p>总销售利润<input type="text" id="all" class="all" value="${requestScope.allpro}" style="padding-left:5px;" readonly/></p>
</div>
<script type="text/javascript">
   var myDate = new Date();
   var da=myDate.toLocaleDateString();     //获取当前日期
   var date=document.getElementById("date");
   date.innerText=da;
   var comm=document.getElementById("comm");
   var sal=document.getElementById("sal");
   var pro=document.getElementById("pro");
   sal.innerText="${requestScope.price}";
   pro.innerText="${requestScope.profit}";
   <c:forEach var="sa" items="${requestScope.sa}">
      comm.innerText=comm.innerText+`  `+"${sa.cname}";
   </c:forEach>  
   var txt=document.getElementById("demo"); 
   document.getElementById("btn").onclick=function(){
	   document.location.href="SalaryServlet?cdate="+txt.value;
	   console.log(txt.value);
   } 
   var p=document.getElementById("p"); 
   if("${requestScope.pro}"==-1){
	   p.value="";
   }else{
	   p.value="${requestScope.pro}";
   }
   if("${requestScope.da}"==null){
	   txt.value="";
   }else{
	   txt.value="${requestScope.da}";
   }   
</script>
</body>
</html>