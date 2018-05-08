# OrdersApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrdersApi.md#cancelOrder) | **DELETE** /orders/{order_id} | cancel an order
[**changeOrder**](OrdersApi.md#changeOrder) | **PATCH** /orders/{order_id} | change an order
[**createExternalOrder**](OrdersApi.md#createExternalOrder) | **POST** /offers/external/orders | create an external order for a native offer
[**createOrder**](OrdersApi.md#createOrder) | **POST** /offers/{offer_id}/orders | create an order for an offer
[**getHistory**](OrdersApi.md#getHistory) | **GET** /orders | get user order history
[**getOrder**](OrdersApi.md#getOrder) | **GET** /orders/{order_id} | get an order
[**submitOrder**](OrdersApi.md#submitOrder) | **POST** /orders/{order_id} | submit an order




<a name="cancelOrder"></a>
# **cancelOrder**
> cancelOrder(orderId, X_REQUEST_ID)

cancel an order

cancel an order - this can be called only before an order is submitted

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
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="changeOrder"></a>
# **changeOrder**
> Order changeOrder(orderId, X_REQUEST_ID, body)

change an order

change an order, currently the error can be changed (set) this in turn will convert this submitted order to a failed order. this gives the client an endpoint to report an internal error. you can only change an order that is in pending state. a failed order can always turn completed in case the order_id successfully appears in the blockchain. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String orderId = Arrays.asList("orderId_example"); // String | The order id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

Body body = ; // Body | 

try {
    Order result = apiInstance.changeOrder(orderId, X_REQUEST_ID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#changeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |
 **body** | [**Body**](.md)|  | [optional]


### Return type

[**Order**](Order.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/jsonapplication/jsonapplication/json


<a name="createExternalOrder"></a>
# **createExternalOrder**
> OpenOrder createExternalOrder(externalorderrequest, X_REQUEST_ID)

create an external order for a native offer

create an external order for a native offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

ExternalOrderRequest externalorderrequest = ; // ExternalOrderRequest | 

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

try {
    OpenOrder result = apiInstance.createExternalOrder(externalorderrequest, X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createExternalOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalorderrequest** | [**ExternalOrderRequest**](.md)|  |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

[**OpenOrder**](OpenOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/json


<a name="createOrder"></a>
# **createOrder**
> OpenOrder createOrder(offerId, X_REQUEST_ID)

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
    OpenOrder result = apiInstance.createOrder(offerId, X_REQUEST_ID);
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
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

[**OpenOrder**](OpenOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/json


<a name="getHistory"></a>
# **getHistory**
> OrderList getHistory(X_REQUEST_ID, origin, offerId, limit, before, after)

get user order history

get user order history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

String origin = Arrays.asList("origin_example"); // String | filter by origin

String offerId = Arrays.asList("offerId_example"); // String | filter by offer_id

Integer limit = Arrays.asList(56); // Integer | maximum number of items in a list

String before = Arrays.asList("before_example"); // String | cursor that points to the start of the page of data that has been returned

String after = Arrays.asList("after_example"); // String | cursor that points to the end of the page of data that has been returned

try {
    OrderList result = apiInstance.getHistory(X_REQUEST_ID, origin, offerId, limit, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |
 **origin** | **String**| filter by origin | [optional] [enum: marketplace, external]
 **offerId** | **String**| filter by offer_id | [optional]
 **limit** | **Integer**| maximum number of items in a list | [optional] [enum: ]
 **before** | **String**| cursor that points to the start of the page of data that has been returned | [optional]
 **after** | **String**| cursor that points to the end of the page of data that has been returned | [optional]


### Return type

[**OrderList**](OrderList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId, X_REQUEST_ID)

get an order

get an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String orderId = Arrays.asList("orderId_example"); // String | The order id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

try {
    Order result = apiInstance.getOrder(orderId, X_REQUEST_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |


### Return type

[**Order**](Order.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="submitOrder"></a>
# **submitOrder**
> Order submitOrder(orderId, X_REQUEST_ID, earnsubmission)

submit an order

submit an order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;



OrdersApi apiInstance = new OrdersApi();

String orderId = Arrays.asList("orderId_example"); // String | The order id

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 

EarnSubmission earnsubmission = ; // EarnSubmission | 

try {
    Order result = apiInstance.submitOrder(orderId, X_REQUEST_ID, earnsubmission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#submitOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id |
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id  |
 **earnsubmission** | [**EarnSubmission**](.md)|  | [optional]


### Return type

[**Order**](Order.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/jsonapplication/json



