package com.ibm.dms.test;

import static java.util.Arrays.asList;
import static javax.security.enterprise.identitystore.CredentialValidationResult.INVALID_RESULT;

import java.util.HashSet;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.credential.BasicAuthenticationCredential;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStore;

@ApplicationScoped
public class SampleIdentityStore implements IdentityStore {

    public CredentialValidationResult validate(UsernamePasswordCredential usernamePasswordCredential) {

        if (usernamePasswordCredential.compareTo("someone", "password")) {
            return new CredentialValidationResult("someone", new HashSet<>(asList("somegroup")));
        }

        return INVALID_RESULT;
    }
    
    public CredentialValidationResult validate(BasicAuthenticationCredential usernamePasswordCredential) {
        return validate((UsernamePasswordCredential)usernamePasswordCredential);
    }

}

