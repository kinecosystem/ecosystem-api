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

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.TransactionHistoryList;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TransactionHistoryApi
 */
@Ignore
public class TransactionHistoryApiTest {

    private final TransactionHistoryApi api = new TransactionHistoryApi();

    
    /**
     * get user history
     *
     * get user history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoryTest() throws ApiException {
        
        String X_REQUEST_ID = null;
        
        Integer limit = null;
        
        String since = null;
        
        String until = null;
        
        TransactionHistoryList response = api.getHistory(X_REQUEST_ID, limit, since, until);

        // TODO: test validations
    }
    
}
