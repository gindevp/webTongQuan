<%--
  Created by IntelliJ IDEA.
  User: Huu Quyet
  Date: 8/17/2022
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">

    <label>Product description</label>
    <input name="description" placeholder="description" type="text" >
    <label>List price</label>
    <input name="price" placeholder="price" type="text">
    <label>Discount percent (%) </label>
    <input name="percent" placeholder="percent" type="text">
    <input type="submit" id="submit" value="calculator discount">

</form>
</body>
</html>
