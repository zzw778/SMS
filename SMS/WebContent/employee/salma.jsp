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
    .dem{
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
    .pun{
    
    margin-top:10px;
    height:180px;
    padding-top:20px;
     
    }
    .reward{
      padding-top:20px;
      height:150px;
     
    }
    span{
       margin-left:340px;
    }
</style>
</head>
<body>
<div class="context"> 
<p>员工姓名<span>身份证号</span></p><input type="text" id="demo" class="demo" style="padding-left:5px;">
<input type="text" id="deid" class="demo" style="padding-left:5px;">
  <div style="width:1000px;height:2px;margin:8px 0px;padding:0px;background-color: #b4c0b6;"></div>
<div class="pun">
<p>输入扣除金额数</p><input type="number" id="demo1" class="demo" value="0" style="padding-left:5px;">
<p>扣除原因</p><textarea id="demo2" class="demo" style="padding-left:5px;height:60px;resize:none;"></textarea><button id="btn" onclick="check()">保存</button>
</div>
 <div style="width:1000px;height:2px;margin:5px 0px;padding:0px;background-color: #b4c0b6;"></div>
<div class="reward">
<p>输入奖励金额数</p><input type="number" id="demo3" value="0" class="demo" style="padding-left:5px;">
<p>奖励原因</p><textarea class="demo" id="demo4" style="padding-left:5px;height:60px;resize:none;"></textarea><button id="btn1"  onclick="check()">保存</button>
</div>
</div>
<script type="text/javascript">
   function check(){
     var name=document.getElementById("demo").value;
     var id=document.getElementById("deid").value;
     var pun=document.getElementById("demo1").value;
     var reason1=document.getElementById("demo2").value;
     var reward=document.getElementById("demo3").value;
     var reason2=document.getElementById("demo4").value;
     var btn=document.getElementById("btn");
     var btn1=document.getElementById("btn1");

		xmlHttpRequest=new XMLHttpRequest();//不加var是全局变量
 	//设置回调函数
 	//xmlHttpRequest.onreadystatechange=callBack;
 	
 	xmlHttpRequest.open("post","EmpcheckajaxServlet",true);
 	//设置post方式的头信息,说明一下提交的数据类型是一个经过url编码的form表单数据
 	xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
 	if(id!=""){
 	 xmlHttpRequest.send("name="+name+"&id="+id);//k=v	
 	}else{
 		alert("选项不能为空！");
 	}
 	xmlHttpRequest.onreadystatechange=function(){
 		if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200){
     		//接受服务端返回的值（此处为responsetext型）
     		var data=xmlHttpRequest.responseText;
     		if(name!=null){
     		 if(name!=""||id!=""){
     	    if(data==="true"){
     	     document.location.href="updatemoneyServlet?name="+name+"&id="+id+"&pun="+pun+"&reason1="+reason1+"&reward="+reward+"&reason2="+reason2;
     	    }else if(data==="false")
     	    	  alert("该员工不存在！");
     		 }else
      	    	alert("选项不能为空！");
     		}
     	}
 	}
   }
</script>
</body>
</html>