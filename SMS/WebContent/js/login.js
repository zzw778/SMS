 
        var a,b,c,d,e,f,g,h
       
        function changeone(a,b,c,e,f,g){
        		document.getElementById("1").style.background=a;
            	document.getElementById("2").style.background=b;
            	document.getElementById("3").style.background=c;
            	document.getElementById("4").style.background=e;
            	document.getElementById("5").style.background=f;
            	document.getElementById("6").style.background=g;
            	
        }   


        function change1(){
        	changeone('#b0c4f7','none','none','none','none','none');
        	document.getElementById("frame1").src="allitemServlet";
         }
       function change2(){
       	changeone("none","#b0c4f7","none","none","none","none");
       	document.getElementById("frame1").src="Mstorehome/Sindex.jsp";
       }
       function change3(){
       	changeone('none','none','#b0c4f7','none','none','none');
       	document.getElementById("frame1").src="vip/vipindex.jsp";
       }
      
       function change4(){
       	changeone('none','none','none','#b0c4f7','none','none');
       	document.getElementById("frame1").src="sale/outindex.jsp";
       }
       function change5(){
       	changeone('none','none','none','none','#b0c4f7','none');
       	document.getElementById("frame1").src="employee/emindex.jsp";
       } 
       function change6(){
          	changeone('none','none','none','none','none','#b0c4f7');
          	document.getElementById("frame1").src="marcket/marindex.jsp";
          } 
       