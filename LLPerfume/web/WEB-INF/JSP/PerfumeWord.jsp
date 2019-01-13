<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>PerfumeWord</title>
</head>
<body>
<c:forEach items="${requestScope.perfumes}" var="prefume">
    <div class="card" style="width: 18rem;margin:4px; display: inline-block ">
        <img class="card-img-top" src="https://pacifictailpets.com/wp-content/uploads/2017/09/maxresdefault-2.jpg   "
             alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title"><c:out value="${prefume.name}"/></h5>
            <p class="card-text">品牌: <c:out value="${prefume.brand}"/></p>
            <p class="card-text">香调:<c:out value="${prefume.fragrance}"/></p>
            <p class="card-text">香味: <c:out value="${prefume.odor}"/></p>
            <p class="card-text">调香师: <c:out value="${prefume.perfumer}"/></p>
            <p class="card-text">价格:<c:out value="${prefume.price}"/></p>
            <a href="${pageContext.request.contextPath}/del?id=<c:out value="${prefume.id}"/>" class="btn btn-primary"
               style="margin: auto">Delete</a>
            <button class="btn btn-primary" style="margin: auto" data-toggle="modal" data-target="#del"
                    onclick="updates('<c:out value="${prefume.id}"/>','<c:out value="${prefume.name}"/>','<c:out
                            value="${prefume.brand}"/>','<c:out value="${prefume.fragrance}"/>','<c:out
                            value="${prefume.odor}"/>','<c:out value="${prefume.perfumer}"/>','<c:out
                            value="${prefume.price}"/>')">Update
            </button>
        </div>
    </div>
</c:forEach>
<%@include file="Update.jsp" %>
<%@include file="add.jsp" %>
</body>
</html>
