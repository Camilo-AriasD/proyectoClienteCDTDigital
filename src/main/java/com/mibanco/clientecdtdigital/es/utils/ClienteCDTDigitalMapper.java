package com.mibanco.clientecdtdigital.es.utils;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigitalEntity;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeInput;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;


@ApplicationScoped
public class ClienteCDTDigitalMapper {

    public ClienteCDTDigitalEntity clienteCDTDigitalTypeToEntity(ClienteCDTDigitalTypeInput clienteCDTDigitalType){
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCDTDigitalEntity.class);
    }

    public ClienteCDTDigitalTypeInput clienteCDTDigitalEntityToType(ClienteCDTDigitalEntity clienteCDTDigitalEntity){
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalTypeInput.class);
    }

    public ClienteCDTDigitalTypeResponse clienteCDTDigitalEntityToTypeResponse(ClienteCDTDigitalEntity clienteCDTDigitalEntity ){
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalTypeResponse.class);
    }

    public ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse(ClienteCDTDigitalEntity clienteCDTDigitalEntity){
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalTypeResponse.class);
    }


    public ClienteCDTDigitalTypeResponse usuarioTypeToTypeResponse(ClienteCDTDigitalEntity clienteCDTDigitalEntity) {
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalTypeResponse.class);



    }
}
