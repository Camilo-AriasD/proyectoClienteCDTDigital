package com.mibanco.clientecdtdigital.es.controller;

import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.gen.contract.V1ClienteCDTDigitalApi;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeInput;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.ClienteCDTDigitalMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ClienteCDTDigitalController implements V1ClienteCDTDigitalApi {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalController.class);

    @Inject
    ClienteCDTDigitalServiceImpl clienteCDTDigitalServiceImpl;

    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;

    @Override
    public Response crearClienteCDTDigital(ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput){

        LOG.info("Inicia crearClienteCDTDigital controller");
        ClienteCDTDigitalTypeResponse clienteCDTDigitalType = null;

        try{
            clienteCDTDigitalType = clienteCDTDigitalServiceImpl.crearClienteCDTDigital(clienteCDTDigitalTypeInput);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " crearCLienteVCDTDigitalController");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        LOG.info("Finaliza crearClienteCDTDigital controller");
        return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalType).build();


    }

    @Override
    public Response listarClienteCDTDigital(Integer idCliente) {
        LOG.info("Inicia listarClienteCDTDigital controller");
        List<ClienteCDTDigitalTypeResponse> clienteCDTDigitalType = null;
        try{
            clienteCDTDigitalType = clienteCDTDigitalServiceImpl.listarClienteCDTDigital(idCliente);
        }catch(ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " listarClienteCDTDigital");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        LOG.info("Finaliza listarClienteCDTDigital controller");
        return Response.status(Response.Status.CREATED).entity(clienteCDTDigitalType).build();
    }

    @Override
    public Response eliminarClienteCDTDigital(Integer idCliente) {
        LOG.info("Inicia eliminarClienteCDTDigital controller");
        try{
            clienteCDTDigitalServiceImpl.eliminarClienteCDTDigital(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " eliminarClienteCDTDigital");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Finaliza eliminarClienteCDTDigital controller");
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Override
    public Response actualizarClienteCDTDigital(Integer idCliente, ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput) {
        LOG.info("Inicia actualizarClienteCDTDigital controller");
        ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse = null;
        try{
            clienteCDTDigitalTypeResponse = clienteCDTDigitalServiceImpl.actualizarClienteCDTDigital(idCliente, clienteCDTDigitalTypeInput);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " actualizarClienteCDTDigital controller");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalTypeResponse).build();
        }
        LOG.info("Finaliza actualizarClienteCDTDigital controller");
        return Response.status(Response.Status.OK).entity(clienteCDTDigitalTypeResponse).build();
    }


}
