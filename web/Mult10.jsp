<%-- 
    Document   : Mult10
    Created on : 27 de mar. de 2023, 21:41:01
    Author     : Natanael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <title>Calculadora de Multiplicação</title>
  </head>
  <body>
    <h1>Calculadora de Multiplicação</h1>
    <form action="ServletMult" method="get">
      <label for="value1">Valor 1:</label>
      <input type="text" id="value1" name="value1">
      <br>
      <label for="value2">Valor 2:</label>
      <input type="text" id="value2" name="value2">
      <br>
      <input type="submit" value="Calcular">
    </form>
  </body>
</html>

