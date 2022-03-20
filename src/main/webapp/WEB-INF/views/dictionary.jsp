<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 20-Mar-22
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/dictionary" method="post">
    <label for="keyword">Keyword</label>
    <input type="text" id="keyword" name="keyword" placeholder="Enter a keyword">
    <button>Search</button>
    <p>${result}</p>
</form>
</body>
</html>
