package com.mibanco.clientecdtdigital.es.graphql;

import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.controller.ClienteCDTDigitalController;
import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigitalEntity;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.ClienteCDTDigitalMapper;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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
            return (List<es-clientecdtdigital.src.main.entity.ClienteCDTDigitalEntity>)
        }
    }






}
