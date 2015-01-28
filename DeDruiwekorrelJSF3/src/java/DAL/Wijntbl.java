/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Christel
 */
@Entity
@Table(name = "wijntbl")
@NamedQueries({
    @NamedQuery(name = "Wijntbl.findAll", query = "SELECT w FROM Wijntbl w"),
    @NamedQuery(name = "Wijntbl.findByNaam", query = "SELECT w FROM Wijntbl w WHERE w.naam = :naam"),
    @NamedQuery(name = "Wijntbl.findByPlatter", query = "SELECT w FROM Wijntbl w WHERE w.platter = :platter"),
    @NamedQuery(name = "Wijntbl.findByJaar", query = "SELECT w FROM Wijntbl w WHERE w.jaar = :jaar"),
    @NamedQuery(name = "Wijntbl.findByPrijsKarton", query = "SELECT w FROM Wijntbl w WHERE w.prijsKarton = :prijsKarton"),
    @NamedQuery(name = "Wijntbl.findByAantalKarton", query = "SELECT w FROM Wijntbl w WHERE w.aantalKarton = :aantalKarton"),
    @NamedQuery(name = "Wijntbl.findByPrijs", query = "SELECT w FROM Wijntbl w WHERE w.prijs = :prijs"),
    @NamedQuery(name = "Wijntbl.findByVolume", query = "SELECT w FROM Wijntbl w WHERE w.volume = :volume"),
    @NamedQuery(name = "Wijntbl.findByFlags", query = "SELECT w FROM Wijntbl w WHERE w.flags = :flags"),
    @NamedQuery(name = "Wijntbl.findById", query = "SELECT w FROM Wijntbl w WHERE w.id = :id")})
public class Wijntbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "naam")
    private String naam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "platter")
    private String platter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jaar")
    private int jaar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "prijsKarton")
    private BigDecimal prijsKarton;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aantalKarton")
    private short aantalKarton;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prijs")
    private BigDecimal prijs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "volume")
    private BigDecimal volume;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "omschrijving")
    private String omschrijving;
    @Basic(optional = false)
    @NotNull
    @Column(name = "flags")
    private short flags;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "fotoId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fototbl fotoId;
    @JoinColumn(name = "wijnhuisId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Wijnhuistbl wijnhuisId;
    @JoinColumn(name = "wijntypeId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Wijntypetbl wijntypeId;

    public Wijntbl() {
    }

    public Wijntbl(Integer id) {
        this.id = id;
    }

    public Wijntbl(Integer id, String naam, String platter, int jaar, BigDecimal prijsKarton, short aantalKarton, BigDecimal prijs, BigDecimal volume, String omschrijving, short flags) {
        this.id = id;
        this.naam = naam;
        this.platter = platter;
        this.jaar = jaar;
        this.prijsKarton = prijsKarton;
        this.aantalKarton = aantalKarton;
        this.prijs = prijs;
        this.volume = volume;
        this.omschrijving = omschrijving;
        this.flags = flags;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPlatter() {
        return platter;
    }

    public void setPlatter(String platter) {
        this.platter = platter;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public BigDecimal getPrijsKarton() {
        return prijsKarton;
    }

    public void setPrijsKarton(BigDecimal prijsKarton) {
        this.prijsKarton = prijsKarton;
    }

    public short getAantalKarton() {
        return aantalKarton;
    }

    public void setAantalKarton(short aantalKarton) {
        this.aantalKarton = aantalKarton;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public short getFlags() {
        return flags;
    }

    public void setFlags(short flags) {
        this.flags = flags;
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

    public Wijnhuistbl getWijnhuisId() {
        return wijnhuisId;
    }

    public void setWijnhuisId(Wijnhuistbl wijnhuisId) {
        this.wijnhuisId = wijnhuisId;
    }

    public Wijntypetbl getWijntypeId() {
        return wijntypeId;
    }

    public void setWijntypeId(Wijntypetbl wijntypeId) {
        this.wijntypeId = wijntypeId;
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
        if (!(object instanceof Wijntbl)) {
            return false;
        }
        Wijntbl other = (Wijntbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Wijntbl[ id=" + id + " ]";
    }
    
}
