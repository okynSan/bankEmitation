/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbaf.bankemitation.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Entity
@Table(name = "client")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_id")
    private Integer clientId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "client_name")
    private String clientName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "client_surname")
    private String clientSurname;
    @OneToMany(mappedBy = "clientId")
    @Cascade(CascadeType.ALL)
    private List<ClientContact> clientContactList = new ArrayList<>();

    @OneToMany(mappedBy = "clientId", targetEntity = ClientAddress.class)
    @Cascade(CascadeType.ALL)
    private List<ClientAddress> addressesList = new ArrayList<>();

    public Client() {
    }

    public Client(Integer clientId) {
        this.clientId = clientId;
    }

    public Client(Integer clientId, String clientName, String clientSurname) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public List<ClientContact> getClientContactList() {
        return clientContactList;
    }

    public void setClientContactList(List<ClientContact> clientContactList) {
        this.clientContactList = clientContactList;
    }

    public List<ClientAddress> getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(List<ClientAddress> addressesList) {
        this.addressesList = addressesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mbaf.bankemitation.client.model.Client[ clientId=" + clientId + " ]";
    }

}
