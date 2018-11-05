package ru.basanov.GeekCloud.api.endpoint;

import ru.basanov.GeekCloud.dto.ResultDTO;
import ru.basanov.GeekCloud.dto.ResultDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EndpointApplicationAPI extends EndpointAPI {

    @WebMethod
    ResultDTO ping();

    @WebMethod
    ResultDTO shutdown();

    @WebMethod
    ResultDTO connected();

    @WebMethod
    ResultDTO login();

    @WebMethod
    ResultDTO logout();

    @WebMethod
    ResultDTO status();

    @WebMethod
    ResultDTO sync();

    @WebMethod
    ResultDTO start();

    @WebMethod
    ResultDTO stop();
}
