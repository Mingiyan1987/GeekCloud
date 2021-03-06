package ru.basanov.GeekCloud.endpoint;

import ru.basanov.GeekCloud.api.endpoint.EndpointApplicationAPI;

import ru.basanov.GeekCloud.api.system.ApplicationService;
import ru.basanov.GeekCloud.api.system.SyncService;
import ru.basanov.GeekCloud.dto.ResultDTO;
import ru.basanov.GeekCloud.dto.SuccessDTO;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EndpointApplication implements EndpointApplicationAPI {

    @Inject
    private ApplicationService applicationService;

    @Inject
    private SyncService syncService;

    @Override
    @WebMethod
    public ResultDTO ping() {
        return new SuccessDTO();
    }

    @Override
    @WebMethod
    public ResultDTO shutdown() {
        applicationService.shutdown();
        return new SuccessDTO();
    }

    @Override
    @WebMethod
    public ResultDTO connected() {
        return new ResultDTO(applicationService.status());
    }

    @Override
    @WebMethod
    public ResultDTO login() {
        return new ResultDTO(applicationService.login());
    }

    @Override
    @WebMethod
    public ResultDTO logout() {
        return new ResultDTO(applicationService.logout());
    }

    @Override
    @WebMethod
    public ResultDTO status() {
        return new ResultDTO(syncService.status());
    }

    @Override
    @WebMethod
    public ResultDTO sync() {
        syncService.sync();
        return new SuccessDTO();
    }

    @Override
    @WebMethod
    public ResultDTO start() {
        return new ResultDTO(syncService.start());
    }

    @Override
    @WebMethod
    public ResultDTO stop() {
        return new ResultDTO(syncService.stop());
    }
}
