<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
   <script type="text/javascript">
   function check(){
	   var cname=document.getElementById("cname").value;
	   $sname=$("#sname").val();
	   $corig=$("#corig").val();
	   $cunit=$("#cunit").val();
	   $cinprice=$("#cinprice").val();
	   $coutprice=$("#coutprice").val();
	   $coutdate=$("#coutdate").val();
	   $cnu=$("#cnu").val(); 
	   $cremark=$("#cremark").val();
	   if(cname!=""&&$sname!=""&&$corig!=""&&$cunit!=""&&$cinprice!=""&&$coutprice!=""&&$coutdate!=""&&$cnu!=""){
		   
       $.ajax({
    	  
    	  url:"addAjaxServlet",
    	  type:"post",
    	  data:"cname="+cname+"&sname="+$sname,//传入ajaxservlet中的值
    	  success:function(result,testStatus){
    		  
    		  if(result=="true"){
    			  alert("添加成功！");
    			  document.location.href="CommaddServlet?cname="+cname+'&sname='+$sname+'&corig='+$corig+'&cunit='+$cunit+'&cinprice='+$cinprice+'&coutprice='+$coutprice+'&coutdate='+$coutdate+'&cnu='+$cnu+'&cremark='+$cremark;
    			  
    		  }else if(result=="false"){
    			  alert("该供货商的商品以存在，请更改！");
    			  
    		  }
    	  }
    	  
       });
		  
       } else
          alert("选项不能为空！");
  
  }
   
   </script> 
<style type="text/css">
h1{
font-family: STLiti;
}
    td:first-child{
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
    /* input{
       width:150px;
       height:25px;
       /* padding-top:2px; */
       
       
    } */
    .demo:focus{
    border-style:solid;
    border-color: #94defe;
	box-shadow: 0 0 15px #94defe;
}
    button{
     width:200px;
     margin-top:30px;
     margin-left:300px;
     background-color:white;
     box-shadow: 5px 5px white;
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
    <div class="container">
   <div class="head">
     <h1>新增产品<span>*为必填</span></h1>
   </div>
  
   <div class="context">
         <table>
         <tr><td>商品名：</td><td class="ac"><input class="demo" type="text" id="cname" /></td></tr>
         <tr><td>商品产地：</td><td class="ac"><input  class="demo" type="text" id="corig" /></td></tr>
         <tr><td>商品单位：</td><td class="ac"><input class="demo" type="text" id="cunit" /></td></tr>
         <tr><td>商品批发价：</td><td class="ac"><input class="demo" type="text" id="cinprice" /></td></tr>
         <tr><td>商品零售价：</td><td class="ac"><input class="demo" type="text" id="coutprice" /></td></tr>
         <tr><td>商品到期日期：</td><td class="ac"><input class="demo" type="date" id="coutdate" /></td></tr>
         <tr><td>供货商：</td><td class="ac"><input class="demo" type="text" id="sname"/></td></tr>
         <tr><td>购买数量：</td><td class="ac"><input class="demo" type="text" id="cnu" /></td></tr>
         <tr><td>备注：</td><td><input class="demo" type="text" id="cremark"/></td></tr>
       </table> 
       <button id="btn" onclick="check()">保存</button>
   </div>
   </div>
  
</body>
</html>