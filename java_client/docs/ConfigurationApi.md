# ConfigurationApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configGet**](ConfigurationApi.md#configGet) | **GET** /config | 




<a name="configGet"></a>
# **configGet**
> Config configGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;



ConfigurationApi apiInstance = new ConfigurationApi();

try {
    Config result = apiInstance.configGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#configGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



