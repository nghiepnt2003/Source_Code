package murach.email;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.business.User;
import murach.data.UserDB;
import murach.data.UserIO;

public class EmailListServlet extends HttpServlet
{    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        String url = "/index.jsp";  
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        request.setAttribute("currentYear", currentYear);
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            User user = new User(firstName, lastName, email);
            String message;
            if (firstName == null || lastName == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "Please fill out all three text boxes.";
                // !!!!!!!!!!!!!!!!!!
                System.out.println("Mess");
                url = "/index.jsp";
                request.setAttribute("message", message);
                
            }else {
                // store data in User object and save User object in database
                
                UserDB.insert(user);

                // set User object in request object and set URL
                session.setAttribute("user", user);      
                url = "/thanks.jsp";   // the "thanks" page
                    // create the Date object and store it in the request
                Date currentDatee = new Date();
                request.setAttribute("currentDate", currentDatee);

                // create users list and store it in the session
                String path = getServletContext().getRealPath("/WEB-INF/EmailList.txt");
                ArrayList<User> users = UserIO.getUsers(path);
                session.setAttribute("users", users);
            }
        }
        


        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}