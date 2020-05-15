# IdentityStoreSample

This is an experimental project to play with JSR375 Identity Store. Big thanks to Martin Proulx for sharing the cod.  All of the code belong to him. 

## How to compile

To clean the directories
`./gradlew cleanDirs`

To recompile the application.
`./gradlew libertyPackage`

To start/stop liberty
`./gradlew libertyStart`
`./gradlew libertyStop`

Logs are found in 
`build/wlp/usr/servers/defaultServer/logs/messages.log`

---
## How to run

It may be better to use firefix as Chrome usually does not allow non-CA certs. 

Login Panel: https://hirokos-mbp:9443/SampleIdentityStore/login.jsp

Context root: https://hirokos-mbp:9443/SampleIdentityStore/
```
Error 404: SRVE0190E: File not found: /
```
Servlet page: https://hirokos-mbp:9443/SampleIdentityStore/servlet
This page is only shown after successful authentication/authorization. 

```
web username: someone
web user has role "somegroup": true
web user has role "someothegroup": false
```
---
## JSR375 spec

Chapter 2.4.4 LoginToContinue Annotation only talks about Flow/State that starts with protected page.  It does not seem to cover the case when the first panel is login page (unprotected)

https://javaee.github.io/security-spec/spec/jsr375-spec.html#_logintocontinue_annotation

---
## Note: Finding port conflict

This is just for me to remember... 
```
lsof -i tcp:9443
COMMAND   PID                USER   FD   TYPE             DEVICE SIZE/OFF NODE NAME
java    71569 htakamiy@us.ibm.com  140u  IPv6 0x686728a99ce8d815      0t0  TCP *:tungsten-https (LISTEN)

kill -9 71569
```
