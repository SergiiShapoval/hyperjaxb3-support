
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.jvnet.hyperjaxb3.item.Item;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "ArrayOfLongLongItem")
@Table(name = "ARRAYOFLONGLONGITEM")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfLongLongItem
    implements Serializable, Item<Long>
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "long", namespace = "http://clients.mindbodyonline.com/api/0_5")
    protected Long item;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "ITEM", precision = 20, scale = 0)
    public Long getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItem(Long value) {
        this.item = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
