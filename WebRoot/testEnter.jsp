<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
<title>测试绑定enter</title>
<script type="text/javascript"> 
function b_onclick() {  
	alert("你好！");
}
function BindEnter(obj) {    
 //使用document.getElementById获取到按钮对象    
var button = document.getElementById('test');    
 if(obj.keyCode == 13){   
	 button.click();           
  	 obj.returnValue = false;        
 }
}
</script>
 </head>
<body onkeydown="BindEnter(event)">
 <input type="button" value="测试按钮" id="test" onclick="b_onclick()" /> </body> 
</html>