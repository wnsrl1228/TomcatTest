package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        int dan = rq.getIntParam("dan", 1);
        int limit = rq.getIntParam("limit", 1);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }





//        int dan = Integer.parseInt(req.getParameter("dan"));
//        int limit = Integer.parseInt(req.getParameter("limit"));
//
//        for (int i = 1; i <= limit; i++) {
//            resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan,i,dan*i));
//        }
    }
}
