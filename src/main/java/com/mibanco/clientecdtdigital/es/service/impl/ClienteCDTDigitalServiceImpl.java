package com.mibanco.clientecdtdigital.es.service.impl;

import com.mibanco.clientecdtdigital.es.controller.ClienteCDTDigitalController;
import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigitalEntity;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeInput;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import com.mibanco.clientecdtdigital.es.utils.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.ClienteCDTDigitalMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;

@ApplicationScoped
public class ClienteCDTDigitalServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalServiceImpl.class);

    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;

    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Transactional
    public ClienteCDTDigitalTypeResponse crearClienteCDTDigital(ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput){
        LOG.info("Inicia crearClienteCDTDigital service");
        ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse =  null;
        try{
            ClienteCDTDigitalEntity clienteCDTDigitalEntity = clienteCDTDigitalMapper.clienteCDTDigitalTypeToEntity(clienteCDTDigitalTypeInput);
            clienteCDTDigitalDao.persist(clienteCDTDigitalEntity);
            clienteCDTDigitalTypeResponse = clienteCDTDigitalMapper.clienteCDTDigitalEntityToTypeResponse(clienteCDTDigitalEntity);
            LOG.info("Finaliza crearClienteCDTDigital service");
        }catch (ApplicationException e){
            LOG.error("Error al crearClienteCDTDigita service" + e.getMessage());
        }
        return clienteCDTDigitalTypeResponse;
    }

    public List<ClienteCDTDigitalTypeResponse> listarClienteCDTDigital(Integer idCliente){
        LOG.info("Inicia listarClienteCDTDigital service");
        try{
            long id = Long.valueOf(idCliente);
            ClienteCDTDigitalEntity client = clienteCDTDigitalDao.findById(id);
            ClienteCDTDigitalTypeResponse response = clienteCDTDigitalMapper.clienteCDTDigitalEntityToTypeResponse(client);
            LOG.info("Finaliza listarClienteCDTDigital service");
            return Collections.singletonList(response);
        }catch (ApplicationException e){
            LOG.error("Se presento un error al listarClienteCDTDigital service: " + e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }

    @Transactional
    public void eliminarClienteCDTDigital (Integer idCliente){
        LOG.info("Inicia eliminarClienteCDTDigital service");
        try{
            Long id = Long.valueOf(idCliente);
            clienteCDTDigitalDao.deleteById(id);
            LOG.info("Finaliza eliminarClienteCDTDIgital service");
        }catch(ApplicationException e){
            LOG.error(ERROR_SERVICIO + e.getMessage() + " eliminarClienteCDTDigital service");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }

    @Transactional
    public ClienteCDTDigitalTypeResponse actualizarClienteCDTDigital(Integer idCliente, ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput){
        LOG.info("Inicia actualizarClienteCDTDigital service");
        try{
            ClienteCDTDigitalEntity clienteCDTDigitalEntity = clienteCDTDigitalDao.findById(idCliente.longValue());
            ClienteCDTDigitalEntity clienteCDTDigitalEntityNew = clienteCDTDigitalMapper.clienteCDTDigitalTypeToEntity(clienteCDTDigitalTypeInput);

            clienteCDTDigitalEntity.setTipoTelefonoPrincipal(clienteCDTDigitalEntityNew.getTipoTelefonoPrincipal());

            clienteCDTDigitalEntity.setTelefonoPrincipal(clienteCDTDigitalEntityNew.getTelefonoPrincipal());
            clienteCDTDigitalEntity.setTipoCorreoElectronico(clienteCDTDigitalEntityNew.getTipoCorreoElectronico());
            clienteCDTDigitalEntity.setFechaNacimientoDia(clienteCDTDigitalEntityNew.getFechaNacimientoDia());
            clienteCDTDigitalEntity.setFechaNacimientoMes(clienteCDTDigitalEntityNew.getFechaNacimientoMes());
            clienteCDTDigitalEntity.setFechaNacimientoAno(clienteCDTDigitalEntityNew.getFechaNacimientoAno());
            clienteCDTDigitalEntity.setLugarNacimientoPais(clienteCDTDigitalEntityNew.getLugarNacimientoPais());
            clienteCDTDigitalEntity.setLugarNacimientoDpto(clienteCDTDigitalEntityNew.getLugarNacimientoDpto());
            clienteCDTDigitalEntity.setLugarNacimientoCiudad(clienteCDTDigitalEntityNew.getLugarNacimientoCiudad());

            ClienteCDTDigitalTypeResponse response = clienteCDTDigitalMapper.usuarioTypeToTypeResponse(clienteCDTDigitalEntityNew);
            LOG.info("Finaliza actualizarClienteCDTDigital service");
            return response;

        }catch(ApplicationException e){
            LOG.error(ERROR_SERVICIO + e.getMessage() + " actualizarClienteCDTDigital service");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());


        }



    }

}
