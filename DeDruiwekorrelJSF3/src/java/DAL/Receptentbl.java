/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Christel
 */
@Entity
@Table(name = "receptentbl")
@NamedQueries({
    @NamedQuery(name = "Receptentbl.findAll", query = "SELECT r FROM Receptentbl r"),
    @NamedQuery(name = "Receptentbl.findByNaam", query = "SELECT r FROM Receptentbl r WHERE r.naam = :naam"),
    @NamedQuery(name = "Receptentbl.findByWijnId", query = "SELECT r FROM Receptentbl r WHERE r.wijnId = :wijnId"),
    @NamedQuery(name = "Receptentbl.findById", query = "SELECT r FROM Receptentbl r WHERE r.id = :id")})
public class Receptentbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "naam")
    private String naam;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "omschrijving")
    private String omschrijving;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wijnId")
    private int wijnId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Receptentbl() {
    }

    public Receptentbl(Integer id) {
        this.id = id;
    }

    public Receptentbl(Integer id, String naam, String omschrijving, int wijnId) {
        this.id = id;
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.wijnId = wijnId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public int getWijnId() {
        return wijnId;
    }

    public void setWijnId(int wijnId) {
        this.wijnId = wijnId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receptentbl)) {
            return false;
        }
        Receptentbl other = (Receptentbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Receptentbl[ id=" + id + " ]";
    }
    
}
