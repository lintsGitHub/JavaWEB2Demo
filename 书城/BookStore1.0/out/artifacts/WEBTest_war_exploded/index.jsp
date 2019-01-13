<%@ page import="java.util.List" %>
<%@ page import="Entity.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookSore</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        function x(id, name, price, author, press) {
            var div = document.querySelector('#divMsg');
            document.querySelector('#id').innerText = id;
            document.querySelector('#name').innerText = name;
            document.querySelector('#price').innerText = price;
            document.querySelector('#author').innerText = author;
            document.querySelector('#press').innerText = press;
            $(div).toggle();
        }
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Dropdown
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100" src="image/1.jpg" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="image/1.jpg" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="image/1.jpg" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<form action="DelServlet" method="post">

    <%
        List<Book> books = (List<Book>) request.getAttribute("bookList");
        for (Book book : books) {
    %>
    <tr>
        <td><input name="id" value="<%=book.getId()%>" type="checkbox"></td>
        <td><%=book.getId()%>
        </td>
        <td onclick="x('<%=book.getId()%>','<%=book.getName()%>','<%=book.getPrice()%>','<%=book.getAuthor()%>','<%=book.getPress()%>' )"><%=book.getName()%>
        </td>
        <td><%=book.getPrice()%>
        </td>
        <td><%=book.getAuthor()%>
        </td>
        <td><%=book.getPress()%>
        </td>
        <td><a href="DelServlet?id=<%=book.getId()%>">删除</a></td>
    </tr>
    <div class="card" style="width: 18rem; display: inline-block ; margin: 3px">
        <img class="card-img-top" src="image/1.jpg" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title"><%=book.getName()%>
            </h5>
            <p class="card-text">作者:<%=book.getAuthor()%>
            </p>
            <p class="card-text">出版社:<%=book.getPress()%>
            </p>
            <p class="card-text">价格:<%=book.getPrice()%>
            </p>
            <a href="DelServlet?id=<%=book.getId()%>" class="btn btn-primary">Delete</a>
        </div>
    </div>
    <%}%>

    <div id="divMsg" hidden>
        编号: <span id="id"></span>
        书名: <span id="name"></span>
        价格: <span id="price"></span>
        作者: <span id="author"></span>
        出版社: <span id="press"></span>
    </div>
    <button>删除</button>
</form>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>
</html>
