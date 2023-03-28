<%-- 
    Document   : Mult100
    Created on : 27 de mar. de 2023, 21:43:09
    Author     : Natanael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora JSP</title>
</head>
<body>
    <h1>Calculadora JSP</h1>
    
    <form method="post" action="ServletMult100">
        Digite um valor: <input type="number" name="valor"><br><br>
        
        <select name="multiplicador">
            <option value="10">10</option>
            <option value="100">100</option>
            <option value="1000">1000</option>
        </select><br><br>
        
        <input type="submit" value="Calcular">
    </form>
</body>
</html>

