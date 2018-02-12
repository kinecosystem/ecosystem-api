# TransactionHistoryApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistory**](TransactionHistoryApi.md#getHistory) | **GET** /transactions | get user history




<a name="getHistory"></a>
# **getHistory**
> TransactionHistoryList getHistory(X_REQUEST_ID, limit, since, until)

get user history

get user history

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionHistoryApi;



TransactionHistoryApi apiInstance = new TransactionHistoryApi();

String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id

Integer limit = Arrays.asList(56); // Integer | maximum number of items in a list

String since = Arrays.asList("since_example"); // String | time based pagination

String until = Arrays.asList("until_example"); // String | time based pagination

try {
    TransactionHistoryList result = apiInstance.getHistory(X_REQUEST_ID, limit, since, until);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionHistoryApi#getHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_REQUEST_ID** | **String**| A unique id for the request. A retransmitted request will have the same id |
 **limit** | **Integer**| maximum number of items in a list | [optional] [enum: ]
 **since** | **String**| time based pagination | [optional]
 **until** | **String**| time based pagination | [optional]


### Return type

[**TransactionHistoryList**](TransactionHistoryList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json



