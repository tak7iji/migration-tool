//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:36 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pool", "entityCache", "lifecycle",
        "persistence", "entityClustering", "invalidationTarget" })
@XmlRootElement(name = "entity-descriptor")
public class EntityDescriptor {

    protected Pool pool;
    @XmlElement(name = "entity-cache")
    protected EntityCache entityCache;
    protected Lifecycle lifecycle;
    protected Persistence persistence;
    @XmlElement(name = "entity-clustering")
    protected EntityClustering entityClustering;
    @XmlElement(name = "invalidation-target")
    protected InvalidationTarget invalidationTarget;

    /**
     * Gets the value of the pool property.
     * 
     * @return possible object is {@link Pool }
     * 
     */
    public Pool getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *            allowed object is {@link Pool }
     * 
     */
    public void setPool(Pool value) {
        this.pool = value;
    }

    /**
     * Gets the value of the entityCache property.
     * 
     * @return possible object is {@link EntityCache }
     * 
     */
    public EntityCache getEntityCache() {
        return entityCache;
    }

    /**
     * Sets the value of the entityCache property.
     * 
     * @param value
     *            allowed object is {@link EntityCache }
     * 
     */
    public void setEntityCache(EntityCache value) {
        this.entityCache = value;
    }

    /**
     * Gets the value of the lifecycle property.
     * 
     * @return possible object is {@link Lifecycle }
     * 
     */
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * Sets the value of the lifecycle property.
     * 
     * @param value
     *            allowed object is {@link Lifecycle }
     * 
     */
    public void setLifecycle(Lifecycle value) {
        this.lifecycle = value;
    }

    /**
     * Gets the value of the persistence property.
     * 
     * @return possible object is {@link Persistence }
     * 
     */
    public Persistence getPersistence() {
        return persistence;
    }

    /**
     * Sets the value of the persistence property.
     * 
     * @param value
     *            allowed object is {@link Persistence }
     * 
     */
    public void setPersistence(Persistence value) {
        this.persistence = value;
    }

    /**
     * Gets the value of the entityClustering property.
     * 
     * @return possible object is {@link EntityClustering }
     * 
     */
    public EntityClustering getEntityClustering() {
        return entityClustering;
    }

    /**
     * Sets the value of the entityClustering property.
     * 
     * @param value
     *            allowed object is {@link EntityClustering }
     * 
     */
    public void setEntityClustering(EntityClustering value) {
        this.entityClustering = value;
    }

    /**
     * Gets the value of the invalidationTarget property.
     * 
     * @return possible object is {@link InvalidationTarget }
     * 
     */
    public InvalidationTarget getInvalidationTarget() {
        return invalidationTarget;
    }

    /**
     * Sets the value of the invalidationTarget property.
     * 
     * @param value
     *            allowed object is {@link InvalidationTarget }
     * 
     */
    public void setInvalidationTarget(InvalidationTarget value) {
        this.invalidationTarget = value;
    }

}
