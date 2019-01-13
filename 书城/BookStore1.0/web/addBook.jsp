<%--
  Created by IntelliJ IDEA.
  User: LLer
  Date: 2018/8/18
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>

<body>
<form id="addBook" action="AddBook" method="post">
    <div style="height: 50%;width: 50%; margin: auto">
        <div class="form-group row">
            <label for="id" class="col-sm-2 col-form-label">书籍编号:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="id" name="id" placeholder="书籍编号">
            </div>
        </div>
        <div class="form-group row">
            <label for="name" class="col-sm-2 col-form-label">书籍名:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name" placeholder="书籍名">
            </div>
        </div>
        <div class="form-group row">
            <label for="price" class="col-sm-2 col-form-label">书籍价格:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="price" name="price" placeholder="书籍价格">
            </div>
        </div>
        <div class="form-group row">
            <label for="author" class="col-sm-2 col-form-label">作者:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="author" name="author" placeholder="作者">
            </div>
        </div>
        <div class="form-group row">
            <label for="press" class="col-sm-2 col-form-label">出版社:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="press" name="press" placeholder="出版社">
            </div>
        </div>
</form>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
    添加书籍
</button>
</div>
<!-- Button trigger modal -->

<!-- Modal -->
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">Tips</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                是否进行该操作
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="addbook()">Yep</button>
            </div>
        </div>
    </div>
</div>
<script>
    function addbook() {
        document.querySelector("#addBook").submit();
    }
</script>
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
