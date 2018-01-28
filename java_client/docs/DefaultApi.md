# DefaultApi

All URIs are relative to *https://api.kinfoundation.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](DefaultApi.md#cancelOrder) | **DELETE** /orders/{order_id} | 
[**createOrder**](DefaultApi.md#createOrder) | **POST** /offers/{offer_id}/order | 
[**getHistory**](DefaultApi.md#getHistory) | **GET** /transactions | 
[**getOffers**](DefaultApi.md#getOffers) | **GET** /offers | 
[**submitOrder**](DefaultApi.md#submitOrder) | **POST** /orders/{order_id} | 




<a name="cancelOrder"></a>
# **cancelOrder**
> cancelOrder()



cancel an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

try {
    apiInstance.cancelOrder();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="createOrder"></a>
# **createOrder**
> Order createOrder()



create an order for an offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

try {
    Order result = apiInstance.createOrder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**Order**](Order.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/json


<a name="getHistory"></a>
# **getHistory**
> TransactionHistoryList getHistory()



get user history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

try {
    TransactionHistoryList result = apiInstance.getHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**TransactionHistoryList**](TransactionHistoryList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="getOffers"></a>
# **getOffers**
> OfferList getOffers()



Return a list of offers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

try {
    OfferList result = apiInstance.getOffers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOffers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**OfferList**](OfferList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="submitOrder"></a>
# **submitOrder**
> SubmissionResult submitOrder(body)



submit an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

Object body = ; // Object | 

try {
    SubmissionResult result = apiInstance.submitOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#submitOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |


### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/json



