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
package com.root101.module.gestion.geografia.rest;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class ModuleGestionGeografiaRESTConstants {

    public static final String PROVINCIA = "provincia";

    //localhost:8080/geografia/provincia/{find_all,create}
    public static final String GEOGRAFIA_GENERAL_PATH = "/geografia";

    //-----------------------PROVINCIA-----------------------\\
    public static final String PROVINCIA_GENERAL_PATH = GEOGRAFIA_GENERAL_PATH + "/provincia";

    //-----------------------MUNICIPIO-----------------------\\
    public static final String MUNICIPIO_GENERAL_PATH = GEOGRAFIA_GENERAL_PATH + "/municipio";

    public static final String MUNICIPIO_FIND_BY_PROV_PATH = "/find_by_prov/{" + PROVINCIA + "}";
    public static final RequestMethod MUNICIPIO_FIND_BY_PROV_METHOD = RequestMethod.GET;

}
