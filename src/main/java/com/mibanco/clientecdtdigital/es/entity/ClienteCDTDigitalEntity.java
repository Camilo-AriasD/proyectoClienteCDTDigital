package com.mibanco.clientecdtdigital.es.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clienteCDTDigital")
public class ClienteCDTDigitalEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCLiente;

    public String tipoTelefonoPrincipal;
    public String telefonoPrincipal;
    public String tipoCorreoElectronico;
    public Integer fechaNacimientoDia;
    public Integer fechaNacimientoMes;
    public Integer fechaNacimientoAno;
    public String lugarNacimientoPais;
    public String lugarNacimientoDpto;
    public String lugarNacimientoCiudad;

    public Long getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(Long idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getTipoTelefonoPrincipal() {
        return tipoTelefonoPrincipal;
    }

    public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
        this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTipoCorreoElectronico() {
        return tipoCorreoElectronico;
    }

    public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
        this.tipoCorreoElectronico = tipoCorreoElectronico;
    }

    public Integer getFechaNacimientoDia() {
        return fechaNacimientoDia;
    }

    public void setFechaNacimientoDia(Integer fechaNacimientoDia) {
        this.fechaNacimientoDia = fechaNacimientoDia;
    }

    public Integer getFechaNacimientoMes() {
        return fechaNacimientoMes;
    }

    public void setFechaNacimientoMes(Integer fechaNacimientoMes) {
        this.fechaNacimientoMes = fechaNacimientoMes;
    }

    public Integer getFechaNacimientoAno() {
        return fechaNacimientoAno;
    }

    public void setFechaNacimientoAno(Integer fechaNacimientoAno) {
        this.fechaNacimientoAno = fechaNacimientoAno;
    }

    public String getLugarNacimientoPais() {
        return lugarNacimientoPais;
    }

    public void setLugarNacimientoPais(String lugarNacimientoPais) {
        this.lugarNacimientoPais = lugarNacimientoPais;
    }

    public String getLugarNacimientoDpto() {
        return lugarNacimientoDpto;
    }

    public void setLugarNacimientoDpto(String lugarNacimientoDpto) {
        this.lugarNacimientoDpto = lugarNacimientoDpto;
    }

    public String getLugarNacimientoCiudad() {
        return lugarNacimientoCiudad;
    }

    public void setLugarNacimientoCiudad(String lugarNacimientoCiudad) {
        this.lugarNacimientoCiudad = lugarNacimientoCiudad;
    }
}
