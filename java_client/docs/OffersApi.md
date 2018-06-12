# OffersApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOffers**](OffersApi.md#getOffers) | **GET** /offers | Return a list of offers




<a name="getOffers"></a>
# **getOffers**
> OfferList getOffers(limit, after, before)

Return a list of offers

Return a **list** of offers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;



OffersApi apiInstance = new OffersApi();

Integer limit = Arrays.asList(56); // Integer | maximum number of items in a list

String after = Arrays.asList("after_example"); // String | cursor that points to the end of the page of data that has been returned

String before = Arrays.asList("before_example"); // String | cursor that points to the start of the page of data that has been returned

try {
    OfferList result = apiInstance.getOffers(limit, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#getOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| maximum number of items in a list | [optional] [enum: ]
 **after** | **String**| cursor that points to the end of the page of data that has been returned | [optional]
 **before** | **String**| cursor that points to the start of the page of data that has been returned | [optional]


### Return type

[**OfferList**](OfferList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json



