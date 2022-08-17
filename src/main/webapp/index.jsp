<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>currency converter</title>
</head>
<body>
<h1>currency converter
</h1>
<br/>
<form action="/convert" method="post">
    <label>Rate:    </label><br/>
    <input type="text" name="rate" placeholder="rate" value="22000"/><br>
    <label>USD:   </label><br/>
    <input type="text " name="usd" placeholder="USD" value="0"  /><br/>
    <input type="submit" id="submit" value="Converter"/>

</form>
</body>
</html>