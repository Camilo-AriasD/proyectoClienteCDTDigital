package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteCDTDigitalTypeInput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-25T11:26:45.469432700-05:00[America/Bogota]")
public class ClienteCDTDigitalTypeInput   {
  private @Valid Integer idCliente;
  private @Valid String tipoTelefonoPrincipal;
  private @Valid String telefonoPrincipal;
  private @Valid String tipoCorreoElectronico;
  private @Valid Integer fechaNacimientoDia;
  private @Valid Integer fechaNacimientoMes;
  private @Valid Integer fechaNacimientoAno;
  private @Valid String lugarNacimientoPais;
  private @Valid String lugarNacimientoDpto;
  private @Valid String lugarNacimientoCiudad;

  /**
   **/
  public ClienteCDTDigitalTypeInput idCliente(Integer idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  
  @JsonProperty("idCliente")
  public Integer getIdCliente() {
    return idCliente;
  }

  @JsonProperty("idCliente")
  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput tipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    return this;
  }

  
  @JsonProperty("tipoTelefonoPrincipal")
  public String getTipoTelefonoPrincipal() {
    return tipoTelefonoPrincipal;
  }

  @JsonProperty("tipoTelefonoPrincipal")
  public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput telefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
    return this;
  }

  
  @JsonProperty("telefonoPrincipal")
  public String getTelefonoPrincipal() {
    return telefonoPrincipal;
  }

  @JsonProperty("telefonoPrincipal")
  public void setTelefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput tipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
    return this;
  }

  
  @JsonProperty("tipoCorreoElectronico")
  public String getTipoCorreoElectronico() {
    return tipoCorreoElectronico;
  }

  @JsonProperty("tipoCorreoElectronico")
  public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput fechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
    return this;
  }

  
  @JsonProperty("fechaNacimientoDia")
  public Integer getFechaNacimientoDia() {
    return fechaNacimientoDia;
  }

  @JsonProperty("fechaNacimientoDia")
  public void setFechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput fechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
    return this;
  }

  
  @JsonProperty("fechaNacimientoMes")
  public Integer getFechaNacimientoMes() {
    return fechaNacimientoMes;
  }

  @JsonProperty("fechaNacimientoMes")
  public void setFechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput fechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
    return this;
  }

  
  @JsonProperty("fechaNacimientoAno")
  public Integer getFechaNacimientoAno() {
    return fechaNacimientoAno;
  }

  @JsonProperty("fechaNacimientoAno")
  public void setFechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput lugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
    return this;
  }

  
  @JsonProperty("lugarNacimientoPais")
  public String getLugarNacimientoPais() {
    return lugarNacimientoPais;
  }

  @JsonProperty("lugarNacimientoPais")
  public void setLugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput lugarNacimientoDpto(String lugarNacimientoDpto) {
    this.lugarNacimientoDpto = lugarNacimientoDpto;
    return this;
  }

  
  @JsonProperty("lugarNacimientoDpto")
  public String getLugarNacimientoDpto() {
    return lugarNacimientoDpto;
  }

  @JsonProperty("lugarNacimientoDpto")
  public void setLugarNacimientoDpto(String lugarNacimientoDpto) {
    this.lugarNacimientoDpto = lugarNacimientoDpto;
  }

  /**
   **/
  public ClienteCDTDigitalTypeInput lugarNacimientoCiudad(String lugarNacimientoCiudad) {
    this.lugarNacimientoCiudad = lugarNacimientoCiudad;
    return this;
  }

  
  @JsonProperty("lugarNacimientoCiudad")
  public String getLugarNacimientoCiudad() {
    return lugarNacimientoCiudad;
  }

  @JsonProperty("lugarNacimientoCiudad")
  public void setLugarNacimientoCiudad(String lugarNacimientoCiudad) {
    this.lugarNacimientoCiudad = lugarNacimientoCiudad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteCDTDigitalTypeInput clienteCDTDigitalTypeInput = (ClienteCDTDigitalTypeInput) o;
    return Objects.equals(this.idCliente, clienteCDTDigitalTypeInput.idCliente) &&
        Objects.equals(this.tipoTelefonoPrincipal, clienteCDTDigitalTypeInput.tipoTelefonoPrincipal) &&
        Objects.equals(this.telefonoPrincipal, clienteCDTDigitalTypeInput.telefonoPrincipal) &&
        Objects.equals(this.tipoCorreoElectronico, clienteCDTDigitalTypeInput.tipoCorreoElectronico) &&
        Objects.equals(this.fechaNacimientoDia, clienteCDTDigitalTypeInput.fechaNacimientoDia) &&
        Objects.equals(this.fechaNacimientoMes, clienteCDTDigitalTypeInput.fechaNacimientoMes) &&
        Objects.equals(this.fechaNacimientoAno, clienteCDTDigitalTypeInput.fechaNacimientoAno) &&
        Objects.equals(this.lugarNacimientoPais, clienteCDTDigitalTypeInput.lugarNacimientoPais) &&
        Objects.equals(this.lugarNacimientoDpto, clienteCDTDigitalTypeInput.lugarNacimientoDpto) &&
        Objects.equals(this.lugarNacimientoCiudad, clienteCDTDigitalTypeInput.lugarNacimientoCiudad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCliente, tipoTelefonoPrincipal, telefonoPrincipal, tipoCorreoElectronico, fechaNacimientoDia, fechaNacimientoMes, fechaNacimientoAno, lugarNacimientoPais, lugarNacimientoDpto, lugarNacimientoCiudad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteCDTDigitalTypeInput {\n");
    
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    tipoTelefonoPrincipal: ").append(toIndentedString(tipoTelefonoPrincipal)).append("\n");
    sb.append("    telefonoPrincipal: ").append(toIndentedString(telefonoPrincipal)).append("\n");
    sb.append("    tipoCorreoElectronico: ").append(toIndentedString(tipoCorreoElectronico)).append("\n");
    sb.append("    fechaNacimientoDia: ").append(toIndentedString(fechaNacimientoDia)).append("\n");
    sb.append("    fechaNacimientoMes: ").append(toIndentedString(fechaNacimientoMes)).append("\n");
    sb.append("    fechaNacimientoAno: ").append(toIndentedString(fechaNacimientoAno)).append("\n");
    sb.append("    lugarNacimientoPais: ").append(toIndentedString(lugarNacimientoPais)).append("\n");
    sb.append("    lugarNacimientoDpto: ").append(toIndentedString(lugarNacimientoDpto)).append("\n");
    sb.append("    lugarNacimientoCiudad: ").append(toIndentedString(lugarNacimientoCiudad)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

