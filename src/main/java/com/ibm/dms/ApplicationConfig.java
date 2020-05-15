package com.ibm.dms.test;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;


@FormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
            loginPage="/login.jsp",
            errorPage="/loginfail.jsp",
            useForwardToLogin=false
        )
    )


@ApplicationScoped
@Named
public class ApplicationConfig {

}
