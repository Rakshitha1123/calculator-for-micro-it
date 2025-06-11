package com.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        double num1 = 0, num2 = 0, result = 0;
        String message;

        try {
            num1 = Double.parseDouble(req.getParameter("num1"));
            num2 = Double.parseDouble(req.getParameter("num2"));
            String operation = req.getParameter("operation");

            switch (operation) {
                case "add": result = num1 + num2; break;
                case "sub": result = num1 - num2; break;
                case "mul": result = num1 * num2; break;
                case "div":
                    if (num2 == 0) {
                        message = "Cannot divide by zero!";
                        req.setAttribute("message", message);
                        req.getRequestDispatcher("result.jsp").forward(req, res);
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            message = "Result: " + result;
        } catch (Exception e) {
            message = "Invalid input!";
        }

        req.setAttribute("message", message);
        req.getRequestDispatcher("result.jsp").forward(req, res);
    }
}
