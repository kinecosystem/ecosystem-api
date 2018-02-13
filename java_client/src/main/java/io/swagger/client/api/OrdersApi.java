/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;




import io.swagger.client.model.Error;
import io.swagger.client.model.OpenOrder;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderList;


import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class OrdersApi {
    private ApiClient apiClient;

    public OrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Build call for cancelOrder
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call cancelOrderCall(String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/orders/{order_id}"
            .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_REQUEST_ID != null)
        localVarHeaderParams.put("X-REQUEST-ID", apiClient.parameterToString(X_REQUEST_ID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelOrderValidateBeforeCall(String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling cancelOrder(Async)");
        }
        
        // verify the required parameter 'X_REQUEST_ID' is set
        if (X_REQUEST_ID == null) {
            throw new ApiException("Missing the required parameter 'X_REQUEST_ID' when calling cancelOrder(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelOrderCall(orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * cancel an order
     * cancel an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public void cancelOrder(String orderId, String X_REQUEST_ID) throws ApiException {
        cancelOrderWithHttpInfo(orderId, X_REQUEST_ID);
    }

    /**
     * cancel an order
     * cancel an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<Void> cancelOrderWithHttpInfo(String orderId, String X_REQUEST_ID) throws ApiException {
        com.squareup.okhttp.Call call = cancelOrderValidateBeforeCall(orderId, X_REQUEST_ID, null, null);
        return apiClient.execute(call);
    }

    /**
     * cancel an order (asynchronously)
     * cancel an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call cancelOrderAsync(String orderId, String X_REQUEST_ID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelOrderValidateBeforeCall(orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    
    /**
     * Build call for createOrder
     * @param offerId The offer id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call createOrderCall(String offerId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/offers/{offer_id}/orders"
            .replaceAll("\\{" + "offer_id" + "\\}", apiClient.escapeString(offerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_REQUEST_ID != null)
        localVarHeaderParams.put("X-REQUEST-ID", apiClient.parameterToString(X_REQUEST_ID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json""application/json""application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createOrderValidateBeforeCall(String offerId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new ApiException("Missing the required parameter 'offerId' when calling createOrder(Async)");
        }
        
        // verify the required parameter 'X_REQUEST_ID' is set
        if (X_REQUEST_ID == null) {
            throw new ApiException("Missing the required parameter 'X_REQUEST_ID' when calling createOrder(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createOrderCall(offerId, X_REQUEST_ID, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * create an order for an offer
     * create an order for an offer
     * @param offerId The offer id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return OpenOrder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public OpenOrder createOrder(String offerId, String X_REQUEST_ID) throws ApiException {
        ApiResponse<OpenOrder> resp = createOrderWithHttpInfo(offerId, X_REQUEST_ID);
        return resp.getData();
    }

    /**
     * create an order for an offer
     * create an order for an offer
     * @param offerId The offer id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return ApiResponse&lt;OpenOrder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<OpenOrder> createOrderWithHttpInfo(String offerId, String X_REQUEST_ID) throws ApiException {
        com.squareup.okhttp.Call call = createOrderValidateBeforeCall(offerId, X_REQUEST_ID, null, null);
        Type localVarReturnType = new TypeToken<OpenOrder>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create an order for an offer (asynchronously)
     * create an order for an offer
     * @param offerId The offer id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call createOrderAsync(String offerId, String X_REQUEST_ID, final ApiCallback<OpenOrder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createOrderValidateBeforeCall(offerId, X_REQUEST_ID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OpenOrder>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for getHistory
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param limit maximum number of items in a list (optional)
     * @param before cursor that points to the start of the page of data that has been returned (optional)
     * @param after cursor that points to the end of the page of data that has been returned (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call getHistoryCall(String X_REQUEST_ID, Integer limit, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("before", before));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_REQUEST_ID != null)
        localVarHeaderParams.put("X-REQUEST-ID", apiClient.parameterToString(X_REQUEST_ID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json""application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHistoryValidateBeforeCall(String X_REQUEST_ID, Integer limit, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'X_REQUEST_ID' is set
        if (X_REQUEST_ID == null) {
            throw new ApiException("Missing the required parameter 'X_REQUEST_ID' when calling getHistory(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getHistoryCall(X_REQUEST_ID, limit, before, after, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * get user order history
     * get user order history
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param limit maximum number of items in a list (optional)
     * @param before cursor that points to the start of the page of data that has been returned (optional)
     * @param after cursor that points to the end of the page of data that has been returned (optional)
     * @return OrderList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public OrderList getHistory(String X_REQUEST_ID, Integer limit, String before, String after) throws ApiException {
        ApiResponse<OrderList> resp = getHistoryWithHttpInfo(X_REQUEST_ID, limit, before, after);
        return resp.getData();
    }

    /**
     * get user order history
     * get user order history
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param limit maximum number of items in a list (optional)
     * @param before cursor that points to the start of the page of data that has been returned (optional)
     * @param after cursor that points to the end of the page of data that has been returned (optional)
     * @return ApiResponse&lt;OrderList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<OrderList> getHistoryWithHttpInfo(String X_REQUEST_ID, Integer limit, String before, String after) throws ApiException {
        com.squareup.okhttp.Call call = getHistoryValidateBeforeCall(X_REQUEST_ID, limit, before, after, null, null);
        Type localVarReturnType = new TypeToken<OrderList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get user order history (asynchronously)
     * get user order history
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param limit maximum number of items in a list (optional)
     * @param before cursor that points to the start of the page of data that has been returned (optional)
     * @param after cursor that points to the end of the page of data that has been returned (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call getHistoryAsync(String X_REQUEST_ID, Integer limit, String before, String after, final ApiCallback<OrderList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHistoryValidateBeforeCall(X_REQUEST_ID, limit, before, after, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for getOrder
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call getOrderCall(String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/orders/{order_id}"
            .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_REQUEST_ID != null)
        localVarHeaderParams.put("X-REQUEST-ID", apiClient.parameterToString(X_REQUEST_ID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json""application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOrderValidateBeforeCall(String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling getOrder(Async)");
        }
        
        // verify the required parameter 'X_REQUEST_ID' is set
        if (X_REQUEST_ID == null) {
            throw new ApiException("Missing the required parameter 'X_REQUEST_ID' when calling getOrder(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getOrderCall(orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * get an order
     * get an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public Order getOrder(String orderId, String X_REQUEST_ID) throws ApiException {
        ApiResponse<Order> resp = getOrderWithHttpInfo(orderId, X_REQUEST_ID);
        return resp.getData();
    }

    /**
     * get an order
     * get an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<Order> getOrderWithHttpInfo(String orderId, String X_REQUEST_ID) throws ApiException {
        com.squareup.okhttp.Call call = getOrderValidateBeforeCall(orderId, X_REQUEST_ID, null, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get an order (asynchronously)
     * get an order
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call getOrderAsync(String orderId, String X_REQUEST_ID, final ApiCallback<Order> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOrderValidateBeforeCall(orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for submitOrder
     * @param body  (required)
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call submitOrderCall(Object body, String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/orders/{order_id}"
            .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_REQUEST_ID != null)
        localVarHeaderParams.put("X-REQUEST-ID", apiClient.parameterToString(X_REQUEST_ID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json""application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitOrderValidateBeforeCall(Object body, String orderId, String X_REQUEST_ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitOrder(Async)");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling submitOrder(Async)");
        }
        
        // verify the required parameter 'X_REQUEST_ID' is set
        if (X_REQUEST_ID == null) {
            throw new ApiException("Missing the required parameter 'X_REQUEST_ID' when calling submitOrder(Async)");
        }
        
        
        com.squareup.okhttp.Call call = submitOrderCall(body, orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * submit an order
     * submit an order
     * @param body  (required)
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public void submitOrder(Object body, String orderId, String X_REQUEST_ID) throws ApiException {
        submitOrderWithHttpInfo(body, orderId, X_REQUEST_ID);
    }

    /**
     * submit an order
     * submit an order
     * @param body  (required)
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<Void> submitOrderWithHttpInfo(Object body, String orderId, String X_REQUEST_ID) throws ApiException {
        com.squareup.okhttp.Call call = submitOrderValidateBeforeCall(body, orderId, X_REQUEST_ID, null, null);
        return apiClient.execute(call);
    }

    /**
     * submit an order (asynchronously)
     * submit an order
     * @param body  (required)
     * @param orderId The order id (required)
     * @param X_REQUEST_ID A unique id for the request. A retransmitted request will have the same id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call submitOrderAsync(Object body, String orderId, String X_REQUEST_ID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitOrderValidateBeforeCall(body, orderId, X_REQUEST_ID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    
}
