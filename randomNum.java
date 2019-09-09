package com.demo;
package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class randomNum extends HttpServlet{
@SuppressWarnings("serial")
public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException{
    resp.setContentType("text/plain");
    resp.getWriter.println("World");
}

}
