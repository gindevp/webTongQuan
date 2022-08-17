package com.codegym.baitapwebtongquan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "simpleDictionary", value = "/simple")
public class SimpleDictionary extends HelloServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> dic= new HashMap<>();
        dic.put("hello","xin chao");
        dic.put("how","thế nào");
        dic.put("book","quyển vở");
        dic.put("computer","máy tính");

        String search= req.getParameter("txtSearch");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        String result= dic.get(search);
        if(result!=null){
            writer.println("Word:"+search);
            writer.println("Result:"+ result);
        }else{
            writer.println("not found");
        }
        writer.println("</html>");

    }
}
