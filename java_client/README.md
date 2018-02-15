# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");
        
        // Configure HTTP basic authorization: BearerAuth
        HttpBasicAuth BearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setUsername("YOUR USERNAME");
        BearerAuth.setPassword("YOUR PASSWORD");
        
        

        AuthApi apiInstance = new AuthApi();
        
        String X_REQUEST_ID = Arrays.asList("X_REQUEST_ID_example"); // String | A unique id for the request. A retransmitted request will have the same id 
        
        try {
            AuthToken result = apiInstance.activateAcount(X_REQUEST_ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#activateAcount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**activateAcount**](docs/AuthApi.md#activateAcount) | **POST** /users/me/activate | Activate account
*AuthApi* | [**signIn**](docs/AuthApi.md#signIn) | **POST** /users | Sign in/ Log in
*OffersApi* | [**getOffers**](docs/OffersApi.md#getOffers) | **GET** /offers | Return a list of offers
*OrdersApi* | [**cancelOrder**](docs/OrdersApi.md#cancelOrder) | **DELETE** /orders/{order_id} | cancel an order
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /offers/{offer_id}/orders | create an order for an offer
*OrdersApi* | [**getHistory**](docs/OrdersApi.md#getHistory) | **GET** /orders | get user order history
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getOrder) | **GET** /orders/{order_id} | get an order
*OrdersApi* | [**submitOrder**](docs/OrdersApi.md#submitOrder) | **POST** /orders/{order_id} | submit an order


## Documentation for Models

 - [AuthToken](docs/AuthToken.md)
 - [BlockchainData](docs/BlockchainData.md)
 - [EarnSubmission](docs/EarnSubmission.md)
 - [Error](docs/Error.md)
 - [Offer](docs/Offer.md)
 - [OfferList](docs/OfferList.md)
 - [OpenOrder](docs/OpenOrder.md)
 - [Order](docs/Order.md)
 - [OrderList](docs/OrderList.md)
 - [Paging](docs/Paging.md)
 - [PagingCursors](docs/PagingCursors.md)
 - [PollAnswer](docs/PollAnswer.md)
 - [SignInData](docs/SignInData.md)
 - [SpendSubmission](docs/SpendSubmission.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header




### BearerAuth


- **Type**: HTTP basic authentication





## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



