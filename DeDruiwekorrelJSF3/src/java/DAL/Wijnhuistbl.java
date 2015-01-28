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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "wijnhuistbl")
@NamedQueries({
    @NamedQuery(name = "Wijnhuistbl.findAll", query = "SELECT w FROM Wijnhuistbl w"),
    @NamedQuery(name = "Wijnhuistbl.findByNaam", query = "SELECT w FROM Wijnhuistbl w WHERE w.naam = :naam"),
    @NamedQuery(name = "Wijnhuistbl.findByStreek", query = "SELECT w FROM Wijnhuistbl w WHERE w.streek = :streek"),
    @NamedQuery(name = "Wijnhuistbl.findByEigenaar", query = "SELECT w FROM Wijnhuistbl w WHERE w.eigenaar = :eigenaar"),
    @NamedQuery(name = "Wijnhuistbl.findByLink", query = "SELECT w FROM Wijnhuistbl w WHERE w.link = :link"),
    @NamedQuery(name = "Wijnhuistbl.findById", query = "SELECT w FROM Wijnhuistbl w WHERE w.id = :id")})
public class Wijnhuistbl implements Serializable {
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
    @Size(min = 1, max = 120)
    @Column(name = "streek")
    private String streek;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "eigenaar")
    private String eigenaar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "link")
    private String link;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "fotoId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fototbl fotoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wijnhuisId")
    private List<Wijntbl> wijntblList;

    public Wijnhuistbl() {
    }

    public Wijnhuistbl(Integer id) {
        this.id = id;
    }

    public Wijnhuistbl(Integer id, String naam, String omschrijving, String streek, String eigenaar, String link) {
        this.id = id;
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.streek = streek;
        this.eigenaar = eigenaar;
        this.link = link;
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

    public String getStreek() {
        return streek;
    }

    public void setStreek(String streek) {
        this.streek = streek;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fototbl getFotoId() {
        return fotoId;
    }

    public void setFotoId(Fototbl fotoId) {
        this.fotoId = fotoId;
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
        if (!(object instanceof Wijnhuistbl)) {
            return false;
        }
        Wijnhuistbl other = (Wijnhuistbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naam + "["+ id + "]";
    }
    
}
