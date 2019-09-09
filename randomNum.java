package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class randomNum extends HttpServlet{
@Override
public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException{
    resp.setContentType("text/plain");
    resp.getWriter.println(" Devendra World");
}

}
