# OrdersApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrdersApi.md#cancelOrder) | **DELETE** /orders/{order_id} | cancel an order
[**createOrder**](OrdersApi.md#createOrder) | **POST** /offers/{offer_id}/order | create an order for an offer
[**submitOrder**](OrdersApi.md#submitOrder) | **POST** /orders/{order_id} | submit an order




<a name="cancelOrder"></a>
# **cancelOrder**
> cancelOrder(orderId, X_REQUEST_ID)

cancel an order

cancel an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String orderId = Arrays.asList("orderId_example"); // String | The order id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id

try {
    apiInstance.cancelOrder(orderId, X_REQUEST_ID);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id |


### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="createOrder"></a>
# **createOrder**
> Order createOrder(offerId, X_REQUEST_ID)

create an order for an offer

create an order for an offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String offerId = Arrays.asList("offerId_example"); // String | The offer id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id

try {
    Order result = apiInstance.createOrder(offerId, X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **String**| The offer id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id |


### Return type

[**Order**](Order.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/json


<a name="submitOrder"></a>
# **submitOrder**
> SubmissionResult submitOrder(submission, orderId, X_REQUEST_ID)

submit an order

submit an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

Submission submission = ; // Submission | 

String orderId = Arrays.asList("orderId_example"); // String | The order id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id

try {
    SubmissionResult result = apiInstance.submitOrder(submission, orderId, X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#submitOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submission** | [**Submission**](.md)|  |
 **orderId** | **String**| The order id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id |


### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/json



