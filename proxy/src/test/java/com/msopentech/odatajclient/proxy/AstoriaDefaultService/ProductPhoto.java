package com.msopentech.odatajclient.proxy.AstoriaDefaultService;

import com.msopentech.odatajclient.proxy.api.AbstractEntitySet;
import com.msopentech.odatajclient.proxy.api.annotations.EntitySet;
import com.msopentech.odatajclient.proxy.api.annotations.CompoundKey;
import com.msopentech.odatajclient.proxy.api.annotations.CompoundKeyElement;
import com.msopentech.odatajclient.proxy.AstoriaDefaultService.types.*;

// EdmSimpleType property imports
import com.msopentech.odatajclient.engine.data.ODataDuration;
import com.msopentech.odatajclient.engine.data.ODataTimestamp;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Geospatial;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.GeospatialCollection;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.LineString;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiLineString;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiPoint;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiPolygon;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Point;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Polygon;
import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Collection;

import java.io.Serializable;
import com.msopentech.odatajclient.proxy.AstoriaDefaultService.ProductPhoto.ProductPhotoKey;

@EntitySet("ProductPhoto")
public interface ProductPhoto extends AbstractEntitySet<com.msopentech.odatajclient.proxy.AstoriaDefaultService.types.ProductPhoto, ProductPhotoKey> {
    
    @CompoundKey
    public static class ProductPhotoKey implements Serializable {
    
        private Integer _photoId;

        @CompoundKeyElement(name = "PhotoId", position = 0)
        public Integer getPhotoId() {
            return _photoId;
        }

        public void setPhotoId(final Integer _photoId) {
            this._photoId = _photoId;
        }
    
        private Integer _productId;

        @CompoundKeyElement(name = "ProductId", position = 1)
        public Integer getProductId() {
            return _productId;
        }

        public void setProductId(final Integer _productId) {
            this._productId = _productId;
        }
    }
}