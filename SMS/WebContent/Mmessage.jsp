<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/updatemanage.css">
<script type="text/javascript">
   function jump(){
	   
	        var name="${requestScope.man.name}";
		    var mpo="${requestScope.man.mpo}";
		    var msal="${requestScope.man.msal}";
			var myear="${requestScope.man.myear}";
			var msex="${requestScope.man.msex}";
			var mnum="${requestScope.man.mnum}";
			var mid="${requestScope.man.mid}";
							   
        var arr=[name,mpo,msal,myear,msex,mnum,mid];
        localStorage.setItem("arr",JSON.stringify(arr));
        	/* localStorage.setItem("name",name);
        	localStorage.setItem("mpo",mpo);
        	localStorage.setItem("msal",msal);
        	localStorage.setItem("myear",myear);
        	localStorage.setItem("msex",msex);
        	localStorage.setItem("mnum",mnum);
        	localStorage.setItem("mid",mid); */
	   
	   document.location.href="updateMmessage.jsp";
   }
   
   function back(){
	   window.close();
   }

</script>
</head>
<body>
     <div id="div">
     <div id="div1"><h2>个人信息</h2></div>
     <div id="div2">
     <table>
         <tr><td>姓名：</td><td>${requestScope.man.name}</td></tr>
         <tr><td>职位：</td><td>${requestScope.man.mpo}</td></tr>
         <tr><td>工资：</td><td><c:choose>
                      <c:when test="${requestScope.man.msal==-1}">
                      </c:when>
                      <c:when test="${requestScope.man.msal!=-1}">
                           ${requestScope.man.msal}
                      </c:when>
                    </c:choose> </td></tr>
         <tr><td>年龄：</td><td><c:choose>
                      <c:when test="${requestScope.man.myear==-1}"><!-- 为空 -->
                      </c:when>
                      <c:when test="${requestScope.man.myear!=-1}">
                           ${requestScope.man.myear}
                      </c:when>
                    </c:choose></td></tr>
         <tr><td>性别：</td><td>${requestScope.man.msex}</td></tr>
         <tr><td>电话号码：</td><td>${requestScope.man.mnum}</td></tr>
         <tr><td>身份证号：</td><td>${requestScope.man.mid}</td></tr>
         
    </table>
    </div>
    <div id="div3">
    <button id="btn1" onclick="jump()">修改</button>
    <button id="btn2" onclick="back()">返回</button>
    </div>
    </div>
</body>
</html>