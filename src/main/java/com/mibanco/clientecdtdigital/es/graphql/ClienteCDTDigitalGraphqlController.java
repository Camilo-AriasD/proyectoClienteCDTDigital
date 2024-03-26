package com.mibanco.clientecdtdigital.es.graphql;

import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.controller.ClienteCDTDigitalController;
import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigitalEntity;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeInput;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.ClienteCDTDigitalMapper;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;

@GraphQLApi
public class ClienteCDTDigitalGraphqlController {
    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalGraphqlController.class);

    @Inject
    ClienteCDTDigitalServiceImpl clienteCDTDigitalServiceImpl;

    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;

    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Query("allClients")
    public List<ClienteCDTDigitalEntity> listarTodo(){
        LOG.info("Inicia listarTodo de ClienteCDTDigitalGraphqlController");
        try{
            List<ClienteCDTDigitalEntity> all = clienteCDTDigitalDao.listAll();
            return all;
        }catch(ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " listarTodo ClienteCDTDigitalGraphqlController");
            Object ClienteCDTDigitalEntity = null;
            return (List<com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigitalEntity>) Response.status(Response.Status.BAD_REQUEST);
        }
    }

    @Mutation("createClient")
    public ClienteCDTDigitalTypeInput crearClienteCDTDigital (ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput){
        LOG.info("Inicia crearClienteCDTDigital controller");
        try{
            ClienteCDTDigitalEntity clienteCDTDigitalEntity = clienteCDTDigitalMapper.clienteCDTDigitalTypeToEntity(clienteCDTDigitalTypeInput);
            clienteCDTDigitalDao.persist(clienteCDTDigitalEntity);
            clienteCDTDigitalTypeInput = clienteCDTDigitalMapper.clienteCDTDigitalEntityToType(clienteCDTDigitalEntity);
        }catch(ApplicationException e){
            LOG.error(ERROR_SERVICIO + e.getMessage() + " crearClienteCDTDigital controller");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
        return clienteCDTDigitalTypeInput;
    }

    @Mutation("deleteClient")
    public void eliminarClienteCDTDigital (@Name("idCliente") Integer idCliente){
        LOG.info("Inicia eliminarClienteCDTDigital controller");
        try{
            clienteCDTDigitalServiceImpl.eliminarClienteCDTDigital(idCliente);
            LOG.info("Finaliza eliminarClienteCDTDIgital controller");
        }catch(ApplicationException e){
            LOG.error(ERROR_SERVICIO + e.getMessage() + " eliminarClienteCDTDigital controller");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }

}