//
// FakeClassnameTags123API.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire
import PromiseKit


open class FakeClassnameTags123API: APIBase {
    /**
     To test class name in snake case
     - parameter body: (body) client model 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func testClassname(body: Client, completion: @escaping ((_ data: Client?, _ error: ErrorResponse?) -> Void)) {
        testClassnameWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }
    /**
     To test class name in snake case
     - parameter body: (body) client model 
     - returns: Promise<Client>
     */
    open class func testClassname( body: Client) -> Promise<Client> {
        let deferred = Promise<Client>.pending()
        testClassname(body: body) { data, error in
            if let error = error {
                deferred.reject(error)
            } else {
                deferred.fulfill(data!)
            }
        }
        return deferred.promise
    }

    /**
     To test class name in snake case
     - PATCH /fake_classname_test
     - API Key:
     - type: apiKey api_key_query 
     - name: api_key_query
     - parameter body: (body) client model 
     - returns: RequestBuilder<Client> 
     */
    open class func testClassnameWithRequestBuilder(body: Client) -> RequestBuilder<Client> {
        let path = "/fake_classname_test"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = body.encodeToJSON()
        let url = URLComponents(string: URLString)
        let requestBuilder: RequestBuilder<Client>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: )
    }

}
