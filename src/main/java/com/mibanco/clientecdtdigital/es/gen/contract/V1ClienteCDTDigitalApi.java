package com.mibanco.clientecdtdigital.es.gen.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeInput;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-25T11:26:45.469432700-05:00[America/Bogota]")
public interface V1ClienteCDTDigitalApi {

    @PUT
    @Path("/actualizarClienteCDT/{idCliente}")
    @Consumes({ "application/json" })
    Response actualizarClienteCDTDigital(@PathParam("idCliente") @Min(1) Integer idCliente,@Valid ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput);

    @POST
    @Path("/clienteCDT")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response crearClienteCDTDigital(@Valid ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput);

    @DELETE
    @Path("/eliminarClienteCDT/{idCliente}")
    Response eliminarClienteCDTDigital(@PathParam("idCliente") @Min(1) Integer idCliente);

    @GET
    @Path("/listarClienteCDT/{idCliente}")
    @Produces({ "application/json" })
    Response listarClienteCDTDigital(@PathParam("idCliente") @Min(1) Integer idCliente);
}
