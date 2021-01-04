package com.sys_Library.utilities.api;

import io.restassured.response.Response;

public class LibrarianAuthentication implements AuthenticationUtility{

private static Response response;
private String token;
private String redirectUrl;

public Response getLoginResponse(){


    return response;
}

public String getToken(){
return token;
}

public String getRedirectUrl(){
    return redirectUrl;
}

}
