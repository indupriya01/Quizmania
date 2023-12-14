<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
input[type="submit"] {
       background-image: linear-gradient(to right, #fffbd5, #b20a2c);
        color: #000000;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        height:180px;
        width:250px;
        font-size: 40px;
      }
      .java-form {
  display: flex;
  justify-content: center;
  position: absolute;
  bottom: 20px;
  left: 58%;
  transform: translateX(-50%);
}
</style>
<body>
<body style="background-image: linear-gradient(120deg, #d4fc79 0%, #96e6a1 100%);">

<br>
<div >
 <img src="https://freepngimg.com/thumb/cartoon/36530-9-cartoon-hd-thumb.png" style="height:50% ; width:50% ;float: left;"  >
   <form action="maths.html" method="get",name="form">
   <input type="submit" value="maths">
   </form>
   <br>
   <br>
   <form action="logic.html" method="get",name="form">
   <input type="submit" value="logic" style="float:right;">
   </form>
   <form action="java.html" method="get",name="form">
   <input type="submit" value="java" class="java-form">
   </form>
 </div>
</body>
</body>
</html>