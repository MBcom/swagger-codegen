# PetApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](PetApi.md#addPet) | **POST** /pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** /pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image




<a name="addPet"></a>
# **addPet**
> addPet(pet)

Add a new pet to the store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Pet pet = ; // Pet | Pet object that needs to be added to the store

try {
    apiInstance.addPet(pet);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#addPet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet** | [**Pet**](.md)| Pet object that needs to be added to the store |


### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined


<a name="deletePet"></a>
# **deletePet**
> deletePet(petId, apiKey)

Deletes a pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Integer petId = Arrays.asList(56); // Integer | Pet id to delete

String apiKey = Arrays.asList("apiKey_example"); // String | 

try {
    apiInstance.deletePet(petId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#deletePet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | [**Integer**](.md)| Pet id to delete |
 **apiKey** | [**String**](.md)|  | [optional]


### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="findPetsByStatus"></a>
# **findPetsByStatus**
> List&lt;Pet&gt; findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

List<String> status = Arrays.asList("status_example"); // List<String> | Status values that need to be considered for filter

try {
    List<Pet> result = apiInstance.findPetsByStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#findPetsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| Status values that need to be considered for filter | [enum: available, pending, sold]


### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


<a name="findPetsByTags"></a>
# **findPetsByTags**
> List&lt;Pet&gt; findPetsByTags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

List<String> tags = Arrays.asList("tags_example"); // List<String> | Tags to filter by

try {
    List<Pet> result = apiInstance.findPetsByTags(tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#findPetsByTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by |


### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


<a name="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)

Find pet by ID

Returns a single pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Integer petId = Arrays.asList(56); // Integer | ID of pet to return

try {
    Pet result = apiInstance.getPetById(petId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#getPetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | [**Integer**](.md)| ID of pet to return |


### Return type

[**Pet**](Pet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


<a name="updatePet"></a>
# **updatePet**
> updatePet(pet)

Update an existing pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Pet pet = ; // Pet | Pet object that needs to be added to the store

try {
    apiInstance.updatePet(pet);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#updatePet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet** | [**Pet**](.md)| Pet object that needs to be added to the store |


### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined


<a name="updatePetWithForm"></a>
# **updatePetWithForm**
> updatePetWithForm(petId, body)

Updates a pet in the store with form data

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Integer petId = Arrays.asList(56); // Integer | ID of pet that needs to be updated

Object body = ; // Object | 

try {
    apiInstance.updatePetWithForm(petId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#updatePetWithForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | [**Integer**](.md)| ID of pet that needs to be updated |
 **body** | [**Object**](Object.md)|  | [optional]


### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


<a name="uploadFile"></a>
# **uploadFile**
> ModelApiResponse uploadFile(petId, body)

uploads an image

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetApi;



PetApi apiInstance = new PetApi();

Integer petId = Arrays.asList(56); // Integer | ID of pet to update

Object body = ; // Object | 

try {
    ModelApiResponse result = apiInstance.uploadFile(petId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | [**Integer**](.md)| ID of pet to update |
 **body** | [**Object**](Object.md)|  | [optional]


### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



