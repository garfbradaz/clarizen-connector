package com.clarizen.api;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Contains the operations exposed by the Clarizen web service
 *         
 *
 * This class was generated by Apache CXF 2.5.1
 * 2014-04-10T08:40:54.410-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://clarizen.com/api", name = "IClarizen")
@XmlSeeAlso({com.clarizen.api.metadata.ObjectFactory.class, com.clarizen.api.faults.ObjectFactory.class, com.clarizen.api.projectmanagement.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, com.clarizen.api.files.ObjectFactory.class, ObjectFactory.class, com.clarizen.api.queries.ObjectFactory.class})
public interface IClarizen {

    /**
     * Terminates an active web services session
     */
    @Oneway
    @Action(input = "http://clarizen.com/api/IClarizen/Logout")
    @RequestWrapper(localName = "Logout", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.Logout")
    @WebMethod(operationName = "Logout", action = "http://clarizen.com/api/IClarizen/Logout")
    public void logout();

    /**
     * Executes a Query request. This is the same as sending a Query message to the  method. @param queryExpression The query to execute @return A  instance.
     *             
     */
    @WebResult(name = "QueryResult", targetNamespace = "http://clarizen.com/api")
    @Action(input = "http://clarizen.com/api/IClarizen/Query", output = "http://clarizen.com/api/IClarizen/QueryResponse", fault = {@FaultAction(className = IClarizenQuerySessionTimeoutFailureFaultFaultMessage.class, value = "http://clarizen.com/api/IClarizen/QuerySessionTimeoutFailureFault")})
    @RequestWrapper(localName = "Query", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.Query")
    @WebMethod(operationName = "Query", action = "http://clarizen.com/api/IClarizen/Query")
    @ResponseWrapper(localName = "QueryResponse", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.QueryResponse")
    public com.clarizen.api.queries.QueryResult query(
        @WebParam(name = "queryExpression", targetNamespace = "http://clarizen.com/api")
        com.clarizen.api.queries.Query queryExpression
    ) throws IClarizenQuerySessionTimeoutFailureFaultFaultMessage;

    /**
     * Logs in to the Clarizen API server and starts a session @param userName Login user name @param password Login password @param options Additional options such as partnerId and applicationId @return a  with the new session Id
     *             
     */
    @WebResult(name = "LoginResult", targetNamespace = "http://clarizen.com/api")
    @Action(input = "http://clarizen.com/api/IClarizen/Login", output = "http://clarizen.com/api/IClarizen/LoginResponse", fault = {@FaultAction(className = IClarizenLoginLoginFailureFaultFaultMessage.class, value = "http://clarizen.com/api/IClarizen/LoginLoginFailureFault")})
    @RequestWrapper(localName = "Login", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.Login")
    @WebMethod(operationName = "Login", action = "http://clarizen.com/api/IClarizen/Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.LoginResponse")
    public com.clarizen.api.LoginResult login(
        @WebParam(name = "userName", targetNamespace = "http://clarizen.com/api")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://clarizen.com/api")
        java.lang.String password,
        @WebParam(name = "options", targetNamespace = "http://clarizen.com/api")
        com.clarizen.api.LoginOptions options
    ) throws IClarizenLoginLoginFailureFaultFaultMessage;

    @WebResult(name = "GetServerDefinitionResult", targetNamespace = "http://clarizen.com/api")
    @Action(input = "http://clarizen.com/api/IClarizen/GetServerDefinition", output = "http://clarizen.com/api/IClarizen/GetServerDefinitionResponse")
    @RequestWrapper(localName = "GetServerDefinition", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.GetServerDefinition")
    @WebMethod(operationName = "GetServerDefinition", action = "http://clarizen.com/api/IClarizen/GetServerDefinition")
    @ResponseWrapper(localName = "GetServerDefinitionResponse", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.GetServerDefinitionResponse")
    public com.clarizen.api.GetServerDefinitionResult getServerDefinition(
        @WebParam(name = "userName", targetNamespace = "http://clarizen.com/api")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://clarizen.com/api")
        java.lang.String password,
        @WebParam(name = "options", targetNamespace = "http://clarizen.com/api")
        com.clarizen.api.LoginOptions options
    );

    /**
     * Perform operations against the Clarizen web services @param request An array of requests derived from  @return An array of  corresponsding to each request. You must cast each result to the specific instance that corresponds to the request parameter. See the remarks section for more information
     *             
     */
    @WebResult(name = "ExecuteResult", targetNamespace = "http://clarizen.com/api")
    @Action(input = "http://clarizen.com/api/IClarizen/Execute", output = "http://clarizen.com/api/IClarizen/ExecuteResponse", fault = {@FaultAction(className = IClarizenExecuteSessionTimeoutFailureFaultFaultMessage.class, value = "http://clarizen.com/api/IClarizen/ExecuteSessionTimeoutFailureFault")})
    @RequestWrapper(localName = "Execute", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.Execute")
    @WebMethod(operationName = "Execute", action = "http://clarizen.com/api/IClarizen/Execute")
    @ResponseWrapper(localName = "ExecuteResponse", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.ExecuteResponse")
    public com.clarizen.api.ArrayOfResult execute(
        @WebParam(name = "request", targetNamespace = "http://clarizen.com/api")
        com.clarizen.api.ArrayOfBaseMessage request
    ) throws IClarizenExecuteSessionTimeoutFailureFaultFaultMessage;

    /**
     * Executes a Metadata request. This is the same as sending a  to the  method @param request a Metadata request @return Returns an instance of a . You must cast this to the specific instance corresponding to the  parameter.
     *             
     */
    @WebResult(name = "MetadataResult", targetNamespace = "http://clarizen.com/api")
    @Action(input = "http://clarizen.com/api/IClarizen/Metadata", output = "http://clarizen.com/api/IClarizen/MetadataResponse", fault = {@FaultAction(className = IClarizenMetadataSessionTimeoutFailureFaultFaultMessage.class, value = "http://clarizen.com/api/IClarizen/MetadataSessionTimeoutFailureFault")})
    @RequestWrapper(localName = "Metadata", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.Metadata")
    @WebMethod(operationName = "Metadata", action = "http://clarizen.com/api/IClarizen/Metadata")
    @ResponseWrapper(localName = "MetadataResponse", targetNamespace = "http://clarizen.com/api", className = "com.clarizen.api.MetadataResponse")
    public com.clarizen.api.Result metadata(
        @WebParam(name = "request", targetNamespace = "http://clarizen.com/api")
        com.clarizen.api.metadata.MetadataMessage request
    ) throws IClarizenMetadataSessionTimeoutFailureFaultFaultMessage;
}
