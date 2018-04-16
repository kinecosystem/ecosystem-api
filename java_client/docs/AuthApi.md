# AuthApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAcount**](AuthApi.md#activateAcount) | **POST** /users/me/activate | Activate account
[**signIn**](AuthApi.md#signIn) | **POST** /users | Sign in/ Log in




<a name="activateAcount"></a>
# **activateAcount**
> AuthToken activateAcount(X_REQUEST_ID)

Activate account

Activate account by accepting TOS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

try {
    AuthToken result = apiInstance.activateAcount(X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#activateAcount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

[**AuthToken**](AuthToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="signIn"></a>
# **signIn**
> AuthToken signIn(signindata, X_REQUEST_ID)

Sign in/ Log in

Sign a user into kin marketplace

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

SignInData signindata = ; // SignInData | 

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

try {
    AuthToken result = apiInstance.signIn(signindata, X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#signIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signindata** | [**SignInData**](.md)|  |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

[**AuthToken**](AuthToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/json



