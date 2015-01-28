/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author Christel
 */
@Entity
@Table(name = "fototbl")
@NamedQueries({
    @NamedQuery(name = "Fototbl.findAll", query = "SELECT f FROM Fototbl f"),
    @NamedQuery(name = "Fototbl.findByNaam", query = "SELECT f FROM Fototbl f WHERE f.naam = :naam"),
    @NamedQuery(name = "Fototbl.findByFilenaam", query = "SELECT f FROM Fototbl f WHERE f.filenaam = :filenaam"),
    @NamedQuery(name = "Fototbl.findById", query = "SELECT f FROM Fototbl f WHERE f.id = :id")})
public class Fototbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "naam")
    private String naam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "filenaam")
    private String filenaam;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fotoId")
    private List<Wijnhuistbl> wijnhuistblList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fotoId")
    private List<Wijntbl> wijntblList;

    public Fototbl() {
    }

    public Fototbl(Integer id) {
        this.id = id;
    }

    public Fototbl(Integer id, String naam, String filenaam) {
        this.id = id;
        this.naam = naam;
        this.filenaam = filenaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getFilenaam() {
        return filenaam;
    }

    public void setFilenaam(String filenaam) {
        this.filenaam = filenaam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Wijnhuistbl> getWijnhuistblList() {
        return wijnhuistblList;
    }

    public void setWijnhuistblList(List<Wijnhuistbl> wijnhuistblList) {
        this.wijnhuistblList = wijnhuistblList;
    }

    public List<Wijntbl> getWijntblList() {
        return wijntblList;
    }

    public void setWijntblList(List<Wijntbl> wijntblList) {
        this.wijntblList = wijntblList;
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
        if (!(object instanceof Fototbl)) {
            return false;
        }
        Fototbl other = (Fototbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naam + "[" + id + "]";
    }
    
}
