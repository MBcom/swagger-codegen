package io.swagger.client.api;

import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;


import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;



public class PetApiImpl implements PetApi {

    private ApiClient apiClient;

    public PetApiImpl() {
        this(null);
    }

    public PetApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Add a new pet to the store
     * 
     
     * @param pet Pet object that needs to be added to the store (required)
     
     * @param resultHandler Asynchronous result handler
     */
    public void addPet(Pet pet, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = pet;
        
        // verify the required parameter 'pet' is set
        if (pet == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'pet' when calling addPet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/json", "application/xml" };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    
    /**
     * Deletes a pet
     * 
     
     * @param petId Pet id to delete (required)
     
     * @param apiKey  (optional)
     
     * @param resultHandler Asynchronous result handler
     */
    public void deletePet(Integer petId, String apiKey, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'petId' when calling deletePet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{" + "petId" + "\\}", petId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        if (apiKey != null)
        localVarHeaderParams.add("api_key", apiClient.parameterToString(apiKey));
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     
     * @param status Status values that need to be considered for filter (required)
     
     * @param resultHandler Asynchronous result handler
     */
    public void findPetsByStatus(List<String> status, Handler<AsyncResult<List<Pet>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'status' when calling findPetsByStatus"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/findByStatus";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = { "application/xml", "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        TypeReference<List<Pet>> localVarReturnType = new TypeReference<List<Pet>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     
     * @param tags Tags to filter by (required)
     
     * @param resultHandler Asynchronous result handler
     */
    public void findPetsByTags(List<String> tags, Handler<AsyncResult<List<Pet>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'tags' is set
        if (tags == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'tags' when calling findPetsByTags"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/findByTags";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = { "application/xml", "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        TypeReference<List<Pet>> localVarReturnType = new TypeReference<List<Pet>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    
    /**
     * Find pet by ID
     * Returns a single pet
     
     * @param petId ID of pet to return (required)
     
     * @param resultHandler Asynchronous result handler
     */
    public void getPetById(Integer petId, Handler<AsyncResult<Pet>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'petId' when calling getPetById"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{" + "petId" + "\\}", petId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = { "application/xml", "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        
        TypeReference<Pet> localVarReturnType = new TypeReference<Pet>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    
    /**
     * Update an existing pet
     * 
     
     * @param pet Pet object that needs to be added to the store (required)
     
     * @param resultHandler Asynchronous result handler
     */
    public void updatePet(Pet pet, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = pet;
        
        // verify the required parameter 'pet' is set
        if (pet == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'pet' when calling updatePet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/json", "application/xml" };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    
    /**
     * Updates a pet in the store with form data
     * 
     
     * @param petId ID of pet that needs to be updated (required)
     
     * @param body  (optional)
     
     * @param resultHandler Asynchronous result handler
     */
    public void updatePetWithForm(Integer petId, Object body, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = body;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'petId' when calling updatePetWithForm"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{" + "petId" + "\\}", petId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/x-www-form-urlencoded" };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    
    /**
     * uploads an image
     * 
     
     * @param petId ID of pet to update (required)
     
     * @param body  (optional)
     
     * @param resultHandler Asynchronous result handler
     */
    public void uploadFile(Integer petId, Object body, Handler<AsyncResult<ModelApiResponse>> resultHandler) {
        Object localVarBody = body;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'petId' when calling uploadFile"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pet/{petId}/uploadImage".replaceAll("\\{" + "petId" + "\\}", petId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        

        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "multipart/form-data" };
        String[] localVarAuthNames = new String[] { "petstore_auth" };
        
        TypeReference<ModelApiResponse> localVarReturnType = new TypeReference<ModelApiResponse>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    
}

