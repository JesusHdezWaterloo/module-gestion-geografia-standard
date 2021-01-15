/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.gestion.geografia.core.domain;

import com.root101.clean.core.utils.SortBy;
import static com.root101.module.gestion.geografia.service.ResourceKeysStandard.*;
import com.root101.utils.clean.EntityDomainObjectValidated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 */
@SortBy(priority = {"nombreMunicipio"})
public class MunicipioDomain extends EntityDomainObjectValidated {

    private Integer idMunicipio;
    
    @NotEmpty(message = VALIDATION_MUNICIPIO_NOMBRE_VACIO)
    @Size(max = 95, message = VALIDATION_MUNICIPIO_NOMBRE_LARGO)
    private String nombreMunicipio;

    @Size(max = 495, message = VALIDATION_DESCRIPCION_LARGA)
    private String descripcion;

    @NotNull(message = VALIDATION_MUNICIPIO_PROVINCIA_NULL)
    private ProvinciaDomain provinciaFk;

    public MunicipioDomain() {
    }

    public MunicipioDomain(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public MunicipioDomain(Integer idMunicipio, String nombreMunicipio, String descripcion) {
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.descripcion = descripcion;
    }

    public MunicipioDomain(String nombreMunicipio, String descripcion, ProvinciaDomain provinciaFk) {
        this.nombreMunicipio = nombreMunicipio;
        this.descripcion = descripcion;
        this.provinciaFk = provinciaFk;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ProvinciaDomain getProvinciaFk() {
        return provinciaFk;
    }

    public void setProvinciaFk(ProvinciaDomain provinciaFk) {
        this.provinciaFk = provinciaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MunicipioDomain)) {
            return false;
        }
        MunicipioDomain other = (MunicipioDomain) object;
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreMunicipio;
    }

}
