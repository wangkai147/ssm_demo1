<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>
    </title>
</head>
<body>
<%--<jsp:forward page="admin/login.html"/>--%>
<%--<jsp:forward page="WEB-INF/view/jsp/selectUser.jsp"/>--%>
<%--重定向到登录页--%>
<%
    response.sendRedirect("admin/login.html");
%>
</body>
</html>