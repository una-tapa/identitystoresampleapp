package com.ibm.dms.test;

import java.io.IOException;

import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Just some hello world servlet that is needed to initialize the authentication
 */

@WebServlet("/servlet")
@ServletSecurity(@HttpConstraint(rolesAllowed = "somegroup"))
public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String webName = null;
        if (request.getUserPrincipal() != null) {
            webName = request.getUserPrincipal().getName();
        }

        response.getWriter().write("web username: " + webName + "\n");

        response.getWriter().write("web user has role \"somegroup\": " + request.isUserInRole("somegroup") + "\n");
        response.getWriter().write("web user has role \"someothegroup\": " + request.isUserInRole("someothergroup") + "\n");
    }

}
