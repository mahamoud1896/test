package com.chiffrageTest;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class ChiffrageTestApplication extends SpringBootServletInitializer {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ChiffrageTestApplication.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(ChiffrageTestApplication.class);
	    
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ChiffrageTestApplication.class);
	}
	
	@SuppressWarnings("serial")
	@WebServlet(urlPatterns = "/upload", initParams = {
	        @WebInitParam(name = "maxFileSize", value = "82428800"),
	        @WebInitParam(name = "maxRequestSize", value = "82428800")
	})
	public class FileUploadServlet extends HttpServlet {
	  // Your code for handling file upload goes here
		
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    /* Receive file uploaded to the Servlet from the HTML5 form */
		    Part filePart = request.getPart("file");
		    String fileName = filePart.getSubmittedFileName();
		    for (Part part : request.getParts()) {
		      part.write("C:\\upload\\" + fileName);
		    }
		    response.getWriter().print("The file uploaded sucessfully.");
		  }

	}

	

}
