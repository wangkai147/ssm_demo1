<%--
  Created by IntelliJ IDEA.
  User: wangkai
  Date: 2021/3/18
  Time: 22:21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询user</title>
</head>
<body>

<%--form表单的提交方式 1.submit按钮--%>
<form action="${pageContext.request.contextPath}/selectUser" method="get">
    <table>
        <tr>
            <td>id:</td>
            <td><label>
                <input name="id" type="number"/>
            </label></td>
        </tr>
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><input type="submit" value="查询"></td>
        </tr>
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>${msg}</td>
        </tr>
    </table>
</form>
<%--form表单的提交方式 1.2.ajax--%>

</body>
</html>
