package servlet;




import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {

    private UserService userService  = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext()
                .getRequestDispatcher("/jsp/create.jsp")
                .forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // form data
        String nameUser = req.getParameter("name");
        String loginUser = req.getParameter("login");
        String passwordUser = req.getParameter("password");

        // new client
        User newUser = new User(nameUser, loginUser, passwordUser);

      //  if (
                userService.addUser(newUser);
    //    {
            resp.sendRedirect("read");;
     //   } else {
   //         resp.getWriter().println("Client not add");
   //     }

 //       resp.setStatus(HttpServletResponse.SC_OK);

    }


}
