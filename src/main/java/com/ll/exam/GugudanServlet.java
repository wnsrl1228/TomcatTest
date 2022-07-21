package com.ll.exam;

import jakarta.servlet.RequestDispatcher;
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

        // jsp에 보낼 속성 저장
        req.setAttribute("dan", dan);
        req.setAttribute("limit", limit);

        // jsp에 일처리 넘김
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/gugudan2.jsp");
        requestDispatcher.forward(req,resp);

    }
}
