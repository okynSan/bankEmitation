/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.client.model;

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
import javax.validation.constraints.Size;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Entity
@Table(name = "client_address")
@NamedQueries({
    @NamedQuery(name = "ClientAddress.findAll", query = "SELECT c FROM ClientAddress c")})
public class ClientAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_address_id")
    private Integer clientAddressId;
    @Size(max = 45)
    @Column(name = "client_address_street")
    private String clientAddressStreet;
    @Size(max = 45)
    @Column(name = "client_address_town")
    private String clientAddressTown;
    @Size(max = 45)
    @Column(name = "client_address_hous")
    private String clientAddressHous;
    @Size(max = 45)
    @Column(name = "client_address_flat")
    private String clientAddressFlat;
    @Size(max = 45)
    @Column(name = "client_address_country")
    private String clientAddressCountry;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @ManyToOne
    @Cascade(CascadeType.ALL)
    private Client clientId;

    public ClientAddress() {
    }

    public ClientAddress(Integer clientAddressId) {
        this.clientAddressId = clientAddressId;
    }

    public Integer getClientAddressId() {
        return clientAddressId;
    }

    public void setClientAddressId(Integer clientAddressId) {
        this.clientAddressId = clientAddressId;
    }

    public String getClientAddressStreet() {
        return clientAddressStreet;
    }

    public void setClientAddressStreet(String clientAddressStreet) {
        this.clientAddressStreet = clientAddressStreet;
    }

    public String getClientAddressTown() {
        return clientAddressTown;
    }

    public void setClientAddressTown(String clientAddressTown) {
        this.clientAddressTown = clientAddressTown;
    }

    public String getClientAddressHous() {
        return clientAddressHous;
    }

    public void setClientAddressHous(String clientAddressHous) {
        this.clientAddressHous = clientAddressHous;
    }

    public String getClientAddressFlat() {
        return clientAddressFlat;
    }

    public void setClientAddressFlat(String clientAddressFlat) {
        this.clientAddressFlat = clientAddressFlat;
    }

    public String getClientAddressCountry() {
        return clientAddressCountry;
    }

    public void setClientAddressCountry(String clientAddressCountry) {
        this.clientAddressCountry = clientAddressCountry;
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
        hash += (clientAddressId != null ? clientAddressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientAddress)) {
            return false;
        }
        ClientAddress other = (ClientAddress) object;
        if ((this.clientAddressId == null && other.clientAddressId != null) || (this.clientAddressId != null && !this.clientAddressId.equals(other.clientAddressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mbaf.bankemitation.client.model.ClientAddress[ clientAddressId=" + clientAddressId + " ]";
    }

}
