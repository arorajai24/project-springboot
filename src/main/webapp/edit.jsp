<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/update">
Item<input type="text" name="item" value="${product.item}"><br/>
Quantity<input type="number" name="quantity" value="${product.quantity}"><br/>
Amount<input type="number" name="amount" value="${product.amount}"><br/>
<input type="submit" value="SUBMIT"><br/>
</form>

</body>
</html>