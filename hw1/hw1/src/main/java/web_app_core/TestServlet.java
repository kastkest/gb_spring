package web_app_core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "/product")
public class TestServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(TestServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: Get Product");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");

        for (int i = 0; i < 10; i++) {
            resp.getWriter().printf("<h1>" + (new Product(i, "product" + i, (15 - i)/ 5)) + "</h1>");
        }

        resp.getWriter().printf("<html><body>");
        resp.getWriter().close();
    }
}
