<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function check(){
    	var name=document.getElementById("name").value;
    	var age=document.getElementById("age").value;
    	var sex=document.getElementById("sex").value;
    	var pos=document.getElementById("pos").value;
    	var sal=document.getElementById("sal").value;
    	var re=document.getElementById("re").value;
    	var id=document.getElementById("id").value;
    	document.location.href="AddempServlet?name="+name+"&id="+id+"&age="+age+"&sex="+sex+"&pos="+pos+"&sal="+sal+"&re="+re;
    }
</script>
<style type="text/css">

    td:first-child,td:nth-child(3){
      text-align: right;
      padding:20px 15px;
      
      font-size: 15px;
    }
    
    
    
    .demo{
       width:300px;
       height:25px;
       padding-left:5px;
       border-radius: 6px;
       border-style: solid;
    }
    
    .demo:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
    button{
     width:100px;
     height:40px;
     margin-top:30px;
     margin-left:800px;
     background-color:white;
     box-shadow: 5px 5px white;
     border-radius: 10px;
    }
    .container{
        margin-left:200px;
    }
    span{
    font-size:15px;
      margin-left:30px;
      font-family: serif;
    }
    .ac:before{
      content:"*";
    }
</style>
</head>
<body>
  <div class="context">
         <table>
         <tr><td>姓名：</td><td class="ac"><input class="demo" type="text" id="name" /></td>
         <td>年龄：</td><td class="ac"><input  class="demo" type="text" id="age" /></td></tr>
         <tr><td>性别：</td><td class="ac"><input class="demo" type="text" id="sex" /></td>
         <td>职位：</td><td class="ac"><input class="demo" type="text" id="pos" /></td></tr>
         <tr><td>月工资：</td><td class="ac"><input class="demo" type="text" id="sal" /></td>
         <td>身份证号：</td><td class="ac"><input class="demo" type="text" id="id" /></td></tr>
         <tr><td>备注：</td><td><input class="demo" type="text" id="re"/></td></tr>
       </table> 
       <button id="btn" onclick="check()">保存</button>
   </div>
</body>
</html>