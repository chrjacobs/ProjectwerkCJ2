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
@Table(name = "druiftbl")
@NamedQueries({
    @NamedQuery(name = "Druiftbl.findAll", query = "SELECT d FROM Druiftbl d"),
    @NamedQuery(name = "Druiftbl.findByNaam", query = "SELECT d FROM Druiftbl d WHERE d.naam = :naam"),
    @NamedQuery(name = "Druiftbl.findById", query = "SELECT d FROM Druiftbl d WHERE d.id = :id")})
public class Druiftbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "naam")
    private String naam;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Druiftbl() {
    }

    public Druiftbl(Integer id) {
        this.id = id;
    }

    public Druiftbl(Integer id, String naam) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Druiftbl)) {
            return false;
        }
        Druiftbl other = (Druiftbl) object;
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
