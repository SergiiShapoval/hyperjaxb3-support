
package integration.mindbody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ArrayOfContactLogComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLogComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLogComment" type="{http://clients.mindbodyonline.com/api/0_5}ContactLogComment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactLogComment", propOrder = {
    "contactLogComment"
})
@Entity(name = "ArrayOfContactLogComment")
@Table(name = "ARRAYOFCONTACTLOGCOMMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfContactLogComment
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ContactLogComment", nillable = true)
    protected List<ContactLogComment> contactLogComment;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the contactLogComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLogComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLogComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactLogComment }
     * 
     * 
     */
    @OneToMany(targetEntity = ContactLogComment.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTACTLOGCOMMENT_ARRAYOFCON_0")
    public List<ContactLogComment> getContactLogComment() {
        if (contactLogComment == null) {
            contactLogComment = new ArrayList<ContactLogComment>();
        }
        return this.contactLogComment;
    }

    /**
     * 
     * 
     */
    public void setContactLogComment(List<ContactLogComment> contactLogComment) {
        this.contactLogComment = contactLogComment;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ContactLogComment> theContactLogComment;
            theContactLogComment = (((this.contactLogComment!= null)&&(!this.contactLogComment.isEmpty()))?this.getContactLogComment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactLogComment", theContactLogComment), currentHashCode, theContactLogComment);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfContactLogComment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfContactLogComment that = ((ArrayOfContactLogComment) object);
        {
            List<ContactLogComment> lhsContactLogComment;
            lhsContactLogComment = (((this.contactLogComment!= null)&&(!this.contactLogComment.isEmpty()))?this.getContactLogComment():null);
            List<ContactLogComment> rhsContactLogComment;
            rhsContactLogComment = (((that.contactLogComment!= null)&&(!that.contactLogComment.isEmpty()))?that.getContactLogComment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactLogComment", lhsContactLogComment), LocatorUtils.property(thatLocator, "contactLogComment", rhsContactLogComment), lhsContactLogComment, rhsContactLogComment)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<ContactLogComment> theContactLogComment;
            theContactLogComment = (((this.contactLogComment!= null)&&(!this.contactLogComment.isEmpty()))?this.getContactLogComment():null);
            strategy.appendField(locator, this, "contactLogComment", buffer, theContactLogComment);
        }
        return buffer;
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
