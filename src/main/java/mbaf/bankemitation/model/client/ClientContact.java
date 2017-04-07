/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.model.client;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Entity
@Table(name = "client_contact")
@NamedQueries({
    @NamedQuery(name = "ClientContact.findAll", query = "SELECT c FROM ClientContact c")})
public class ClientContact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_contact_id")
    private Integer clientContactId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "client_phone_numbe")
    private Float clientPhoneNumbe;
    @Column(name = "phone_status")
    private Short phoneStatus;
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne
    @Cascade(CascadeType.ALL)
    private Client clientId;

    public ClientContact() {
    }

    public ClientContact(Integer clientContactId) {
        this.clientContactId = clientContactId;
    }

    public Integer getClientContactId() {
        return clientContactId;
    }

    public void setClientContactId(Integer clientContactId) {
        this.clientContactId = clientContactId;
    }

    public Float getClientPhoneNumbe() {
        return clientPhoneNumbe;
    }

    public void setClientPhoneNumbe(Float clientPhoneNumbe) {
        this.clientPhoneNumbe = clientPhoneNumbe;
    }

    public Short getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Short phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientContactId != null ? clientContactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientContact)) {
            return false;
        }
        ClientContact other = (ClientContact) object;
        if ((this.clientContactId == null && other.clientContactId != null) || (this.clientContactId != null && !this.clientContactId.equals(other.clientContactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mbaf.bankemitation.client.model.ClientContact[ clientContactId=" + clientContactId + " ]";
    }
    
}
