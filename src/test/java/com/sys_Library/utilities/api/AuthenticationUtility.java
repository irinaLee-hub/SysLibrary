package com.sys_Library.utilities.api;

import io.restassured.response.Response;

public interface AuthenticationUtility {
 Response getLoginResponse();
 String getToken();
 String getRedirectUrl();

}
