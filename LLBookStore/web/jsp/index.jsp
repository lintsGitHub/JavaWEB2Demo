<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="cs" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BookStore</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%--
<cs:forEach items="${requestScope.books}" var="book">
    <div class="card" style="width: 18rem; display: inline-block" id="<cs:out value='${book.getId()}'/>">
        <img class="card-img-top" src="../IMG/1.jpg" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title"<cs:out value='${book.getName()}'/>></h5>
            <p class="card-text">编号:<cs:out value='${book.getId()}'/></p>
            <p class="card-text">价格:<cs:out value='${book.getPrice()}'/></p>
            <p class="card-text">作者:<cs:out value='${book.getAuthor()}'/></p>
            <p class="card-text">出版社:<cs:out value='${book.getPress()}'/></p>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><a href="#" style="margin: auto" class="btn btn-primary">Go somewhere</a></li>
                <li class="list-group-item"><a href="#" style="margin: auto"  class="btn btn-primary">Go somewhere</a></li>
                <li class="list-group-item"><a href="#" style="margin: auto"  class="btn btn-primary">Go somewhere</a></li>
            </ul>
        </div>
    </div>
</cs:forEach>
--%>
<script>
    $(function () {
      $.ajax("")
    })
</script>

</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
