package servlets;


import soap.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        refreshPage(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserSoap userSoap = new UserSoap_Service().getUserSoapPort();

        if (req.getParameter("deleteButton") != null){
            doDelete(req, resp);
            return;
        }

        if (req.getParameter("updateButton") != null){
            doPut(req, resp);
            return;
        }
        try {
            userSoap.addUser(createUser(req));
        } catch (ObjectAlreadyExistsException_Exception e) {
            e.printStackTrace();
        }

        refreshPage(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserSoap userSoap = new UserSoap_Service().getUserSoapPort();

        try {
            userSoap.updateUser(createUser(req));
        } catch (UpdateObjectNotExistException_Exception e) {
            e.printStackTrace();
        }
        refreshPage(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserSoap userSoap = new UserSoap_Service().getUserSoapPort();

        String email = req.getParameter("email");
        userSoap.deleteUser(email);
        refreshPage(req, resp);
    }

    private void refreshPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserSoap userSoap = new UserSoap_Service().getUserSoapPort();

        List<UserDto> usersList = userSoap.getAllUsers();
        req.setAttribute("users", usersList);
        req.getRequestDispatcher("pages/Welcome.jsp").forward(req, resp);
    }

    private UserDto createUser(HttpServletRequest req){
        String email = req.getParameter("email");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        UserDto newUser = new UserDto();
        newUser.setEmail(email);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setPassword(password);
        //newUser.setSessiosList(new ArrayList<SessionDto>());

        return newUser;
    }

}
