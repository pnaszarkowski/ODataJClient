/*
 * Copyright 2013 MS OpenTech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.msopentech.odatajclient.communication.request;

import com.msopentech.odatajclient.data.AbstractEntity;
import com.msopentech.odatajclient.data.Entity;
import com.msopentech.odatajclient.data.ODataURI;
import com.msopentech.odatajclient.data.Query;


/**
 * ODataRequest factory.
 */
public class ODataRequestFactory {

    /**
     * Get a create request object instance. Use this kind of request for either entities and links.
     *
     * @param targetURI entity set or link attribute URI.
     * @param entity entity or relationships to be created.
     * @return create request object.
     */
    public static <T extends AbstractEntity> ODataRequest getCreateRequest(final ODataURI targetURI, final T entity) {
        return new ODataCreateRequest(targetURI, entity);
    }

    /**
     * Get a delete request object instance.Use this kind of request for either entities and links.
     *
     * @return delete request object.
     */
    public static ODataRequest getDeleteRequest(final ODataURI targetURI) {
        return new ODataDeleteRequest(targetURI);
    }

    /**
     * Get an update request object instance.
     *
     * @return update request object.
     */
    public static ODataRequest getUpdateRequest(final ODataURI targetURI, final Entity entity, final UpdateType type) {
        return new ODataUpdateRequest(targetURI, entity, type);
    }

    /**
     * Get a query request object instance.
     *
     * @return
     */
    public static ODataRequest getQueryRequest(final Query query) {
        return new ODataQueryRequest(query);
    }
}