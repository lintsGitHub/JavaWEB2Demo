<%@page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>My Face</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
    String aName = request.getParameter("name");
    String aType = request.getParameter("type");
	%>
	<h1>Welcome to myface</h1>
	<img src="image/myface.jpg" alt="秀智" width="350" height="256">
	<p>Hello, my name is 秀智, what is yours?</p>
	<form action="/aa"  method="post">
		<input type="text" name="name" value="">
        <select name="type" id="type">
            <option value="大叔">大叔</option>
            <option value="大婶">大婶</option>
            <option value="男神">男神</option>
            <option value="女神">女神</option>
        </select>
		<input type="submit" value="提交">
	</form>
	<%
	    if (aName == null || "".equals(aName.trim()) ) {
	%>
	<p> <%=aName%></p>
	
	<%
	  }
	
	 else {  
	 %> 
	  <p>hi  <%=aName%> <%= aType%> </P>
	 <% 
	    }
	%>

</body>
</html>