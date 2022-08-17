package com.codegym.baitapwebtongquan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name =" Calculator", value = "/calculator")
public class Calculator extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String description = req.getParameter("description");
    double price= Double.parseDouble(req.getParameter("price"));
    double percent= Double.parseDouble(req.getParameter("percent"));
   double amount= price*percent*0.01;
   double amount2= amount+price;
        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>"+description+"</h1>");
        writer.println("discount aomunt:"+amount);
        writer.println("price:"+amount2);
        writer.println("</html>");
    }
}
