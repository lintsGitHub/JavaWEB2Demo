<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
<form action="/toadd" method="post">
    书籍名称: <input type="text" name="name"/> <br>
    书籍价格: <input type="number" name="price"/> <br>
    <button>提交</button>
</form>
</body>
</html>
