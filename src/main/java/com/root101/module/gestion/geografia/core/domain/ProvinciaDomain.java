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
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 */
@SortBy(priority = {"nombreProvincia"})
public class ProvinciaDomain extends EntityDomainObjectValidated {

    private Integer idProvincia;

    @NotEmpty(message = VALIDATION_PROVINCIA_NOMBRE_VACIO)
    @Size(max = 95, message = VALIDATION_PROVINCIA_NOMBRE_LARGO)
    private String nombreProvincia;

    @Size(max = 495, message = VALIDATION_DESCRIPCION_LARGA)
    private String descripcion;

    public ProvinciaDomain() {
    }

    public ProvinciaDomain(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public ProvinciaDomain(Integer idProvincia, String nombreProvincia, String descripcion) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.descripcion = descripcion;
    }

    public ProvinciaDomain(String nombreProvincia, String descripcion) {
        this.nombreProvincia = nombreProvincia;
        this.descripcion = descripcion;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvincia != null ? idProvincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProvinciaDomain)) {
            return false;
        }
        ProvinciaDomain other = (ProvinciaDomain) object;
        if ((this.idProvincia == null && other.idProvincia != null) || (this.idProvincia != null && !this.idProvincia.equals(other.idProvincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreProvincia;
    }

}
