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
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");
        
        

        DefaultApi apiInstance = new DefaultApi();
        
        try {
            apiInstance.cancelOrder();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelOrder");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.kinfoundation.com/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**cancelOrder**](docs/DefaultApi.md#cancelOrder) | **DELETE** /orders/{order_id} | 
*DefaultApi* | [**createOrder**](docs/DefaultApi.md#createOrder) | **POST** /offers/{offer_id}/order | 
*DefaultApi* | [**getHistory**](docs/DefaultApi.md#getHistory) | **GET** /transactions | 
*DefaultApi* | [**getOffers**](docs/DefaultApi.md#getOffers) | **GET** /offers | 
*DefaultApi* | [**submitOrder**](docs/DefaultApi.md#submitOrder) | **POST** /orders/{order_id} | 


## Documentation for Models

 - [Coupon](docs/Coupon.md)
 - [EarnResult](docs/EarnResult.md)
 - [EarnSubmission](docs/EarnSubmission.md)
 - [Error](docs/Error.md)
 - [Limits](docs/Limits.md)
 - [MultiChoicePoll](docs/MultiChoicePoll.md)
 - [MultiChoicePollAnswer](docs/MultiChoicePollAnswer.md)
 - [Offer](docs/Offer.md)
 - [OfferList](docs/OfferList.md)
 - [Order](docs/Order.md)
 - [Question](docs/Question.md)
 - [SliderPoll](docs/SliderPoll.md)
 - [SliderPollAnswer](docs/SliderPollAnswer.md)
 - [SpendResult](docs/SpendResult.md)
 - [SpendSubmission](docs/SpendSubmission.md)
 - [SubmissionResult](docs/SubmissionResult.md)
 - [TransactionHistoryItem](docs/TransactionHistoryItem.md)
 - [TransactionHistoryList](docs/TransactionHistoryList.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header






## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



