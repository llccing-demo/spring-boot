<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>List Todos</title>
</head>
<body>
<div class="container">
    <h1>Enter Todo Details</h1>
<%--    <form method="post">--%>
<%--       Description: <input type="text" name="description"/>--%>
<%--        <input type="submit" class="btn btn-success"/>--%>
<%--    </form>--%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <form:form method="post" modelAttribute="todo">
        Description: <form:input type="text" path="description" required="required"/>
        <form:errors path="description" cssClass="text-warning"></form:errors>
        <form:input path="id" type="hidden"/>
        <form:input path="done" type="hidden" />
    </form:form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>