/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package aula;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMult100 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora Servlet</h1>");

            out.println("<form method=\"post\">");
            out.println("Digite um valor: <input type=\"number\" name=\"valor\"><br><br>");

            out.println("<select name=\"multiplicador\">");
            out.println("<option value=\"10\">10</option>");
            out.println("<option value=\"100\">100</option>");
            out.println("<option value=\"1000\">1000</option>");
            out.println("</select><br><br>");

            out.println("<input type=\"submit\" value=\"Calcular\">");
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        double valor = Double.parseDouble(request.getParameter("valor"));
        double multiplicador = Double.parseDouble(request.getParameter("multiplicador"));
        double resultado = valor * multiplicador;

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado da Calculadora Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado da Calculadora Servlet</h1>");

            out.println("<p>Resultado: " + resultado + "</p>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
