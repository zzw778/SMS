<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"> 
<style type="text/css">
    /* .btn{
      background-color: #80ffff;
      display:none;
      height:30px;
      width:55px;
      font-size:15px;
      text-align: center;
      padding-top:3px;
      margin-top:0px;
      /* visibility:hidden; */
   } */
   
   .td{
      width:80px;
   }
   thead{
      box-shadow:5px 5px 5px #ede7ec;
     
    }
     
   .tr{
     font-weight: bold;
   }
   a{
     cursor: pointer;
   }
</style> 
</head>
<body>

<table class="table table-striped">
   <thead>
     <tr>
       <th>供货商</th>
       <th>提供的货物</th>
       <th></th>
     </tr>
   </thead>
   <tbody id="tbody">
   
     <c:forEach  var="pa" items="${requestScope.sh}">
         <tr class="tr">
                <td><a class="cname">${pa.cname}</a></td>
                <td class="goods">${pa.goods}</td>
                
         </tr>
     </c:forEach> 
   
   </tbody>
 </table>

 <script type="text/javascript">
	 var arr1=document.getElementsByClassName("goods");
	 var arr=document.getElementsByClassName("cname");
	 var td=document.getElementById("tbody");
	 var tr=document.getElementsByClassName("tr");
	 var ar1=[];
	 
	 let i,j;
			 for(i=0;i<arr.length;i++){
				 for(j=i+1;j<arr.length;j++){
	    	       if(arr[i].innerText==arr[j].innerText){
	    		    arr1[i].innerText=arr1[i].innerText+' , '+arr1[j].innerText;
	    		    td.removeChild(tr[j]);
	    		    j--;
	    	    	//arr.splice(j,1); 
	                 //delete arr1[j];
	    	       }
	    	       
	             } 
				 var xm=document.createElement("td");
				 var btn=document.createElement("button");
				 btn.innerText="X";
				 btn.style.borderStyle="null";
				 btn.style.background="white";
				 tr[i].appendChild(xm);
				 xm.appendChild(btn);
				 
				 
	         }
			
			var Arr=document.getElementsByTagName("button");
		     var ar2=document.getElementsByClassName("cname");
		     for(let i in Arr){
		    	 Arr[i].onclick=function(){
		    		 document.location.href="deleteStoreServlet?cname="+ar2[i].innerText; 
		    	 }
		     }
 </script> 
 
</body>
</html>