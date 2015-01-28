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
@Table(name = "wijntypetbl")
@NamedQueries({
    @NamedQuery(name = "Wijntypetbl.findAll", query = "SELECT w FROM Wijntypetbl w"),
    @NamedQuery(name = "Wijntypetbl.findByNaam", query = "SELECT w FROM Wijntypetbl w WHERE w.naam = :naam"),
    @NamedQuery(name = "Wijntypetbl.findById", query = "SELECT w FROM Wijntypetbl w WHERE w.id = :id")})
public class Wijntypetbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "naam")
    private String naam;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wijntypeId")
    private List<Wijntbl> wijntblList;

    public Wijntypetbl() {
    }

    public Wijntypetbl(Integer id) {
        this.id = id;
    }

    public Wijntypetbl(Integer id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Wijntypetbl)) {
            return false;
        }
        Wijntypetbl other = (Wijntypetbl) object;
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
