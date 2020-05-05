<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<style type="text/css">
  #head{
    background-color:  #b9c6bd;
   }
   .context{
      width:100%;
      height:480px;
      margin:0px;
   }
   #frame{
     width:100%;
     height:100%;
     border-style: none;
   }
   a{
    cursor: pointer;
   }
</style>
</head>
<body>
   <div class="all">
   <ol class="breadcrumb">
  <li class="active">操作</li>
  <li ><a id="head">新增会员</a></li>
  <li><a id="cen">会员查找</a></li>
</ol> 
  <div class="context">
      <iframe id="frame" src="addvip.jsp"></iframe>
  </div>
   </div>
   <script src="https://www.imooc.com/static/lib/jquery/1.9.1/jquery.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 
<script type="text/javascript">
  function changeone(a,b){
		document.getElementById("head").style.background=a;
		document.getElementById("cen").style.background=b;
		
	}
  document.getElementById("head").onclick=function(){
	  
		changeone('#b9c6bd','none');
		document.getElementById("frame").src="addvip.jsp";
		
	 }
  document.getElementById("cen").onclick=function(){
	    var name=prompt("输入会员名：");
		if(name!=null){
		var id=prompt("输入身份证号：");
		xmlHttpRequest=new XMLHttpRequest();//不加var是全局变量
    	//设置回调函数
    	//xmlHttpRequest.onreadystatechange=callBack;
    	
    	xmlHttpRequest.open("post","vipcheckajaxServlet",true);
    	//设置post方式的头信息,说明一下提交的数据类型是一个经过url编码的form表单数据
    	xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    	xmlHttpRequest.send("name="+name+"&id="+id);//k=v	
    	xmlHttpRequest.onreadystatechange=function(){
    		if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200){
        		//接受服务端返回的值（此处为responsetext型）
        		var data=xmlHttpRequest.responseText;
        		if(name!=null){
        		 if(name!=""){
        	    if(data==="true"){
        	    	changeone('none','#b9c6bd');
        	    	document.getElementById("frame").src="CheckvipServlet?name="+name+"&id="+id;
        	    }else if(data==="false")
        	    	  alert("该员工不存在！");
        		 }else
         	    	alert("选项不能为空！");
        		}
        	}
    	 }
		}
		
  }
		</script>
</body>
</html>