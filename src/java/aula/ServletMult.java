/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package aula;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletMult extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Obtém os valores do parâmetro 'value1' e 'value2' do objeto de solicitação HTTP
        int value1 = Integer.parseInt(request.getParameter("value1"));
        int value2 = Integer.parseInt(request.getParameter("value2"));
        
        // Calcula o resultado da multiplicação
        int result = value1 * value2;
        
        // Define o tipo de conteúdo da resposta para HTML
        response.setContentType("text/html");
        
        // Cria um PrintWriter para escrever a resposta HTML
        PrintWriter out = response.getWriter();
        
        // Escreve o HTML de resposta com o resultado da multiplicação
        out.println("<html>");
        out.println("<head><title>Resultado da Multiplicação</title></head>");
        out.println("<body>");
        out.println("<h1>Resultado da Multiplicação</h1>");
        out.println("<p>" + value1 + " x " + value2 + " = " + result + "</p>");
        out.println("</body></html>");
    }
}

