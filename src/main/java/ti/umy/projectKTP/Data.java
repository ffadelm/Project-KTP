/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.projectKTP;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d"),
    @NamedQuery(name = "Data.findById", query = "SELECT d FROM Data d WHERE d.id = :id"),
    @NamedQuery(name = "Data.findByNoktp", query = "SELECT d FROM Data d WHERE d.noktp = :noktp"),
    @NamedQuery(name = "Data.findByNama", query = "SELECT d FROM Data d WHERE d.nama = :nama"),
    @NamedQuery(name = "Data.findByTtl", query = "SELECT d FROM Data d WHERE d.ttl = :ttl"),
    @NamedQuery(name = "Data.findByJeniskelamin", query = "SELECT d FROM Data d WHERE d.jeniskelamin = :jeniskelamin"),
    @NamedQuery(name = "Data.findByAlamat", query = "SELECT d FROM Data d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Data.findByAgama", query = "SELECT d FROM Data d WHERE d.agama = :agama"),
    @NamedQuery(name = "Data.findByStatus", query = "SELECT d FROM Data d WHERE d.status = :status"),
    @NamedQuery(name = "Data.findByPekerjaan", query = "SELECT d FROM Data d WHERE d.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "Data.findByWarganegara", query = "SELECT d FROM Data d WHERE d.warganegara = :warganegara"),
    @NamedQuery(name = "Data.findByBerlaku", query = "SELECT d FROM Data d WHERE d.berlaku = :berlaku")})
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "noktp")
    private String noktp;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "ttl")
    @Temporal(TemporalType.DATE)
    private Date ttl;
    @Basic(optional = false)
    @Column(name = "jeniskelamin")
    private String jeniskelamin;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Column(name = "pekerjaan")
    private String pekerjaan;
    @Basic(optional = false)
    @Column(name = "warganegara")
    private String warganegara;
    @Basic(optional = false)
    @Column(name = "berlaku")
    private String berlaku;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public Data() {
    }

    public Data(Long id) {
        this.id = id;
    }

    public Data(Long id, String noktp, String nama, Date ttl, String jeniskelamin, String alamat, String agama, String status, String warganegara, String berlaku) {
        this.id = id;
        this.noktp = noktp;
        this.nama = nama;
        this.ttl = ttl;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.status = status;
        this.warganegara = warganegara;
        this.berlaku = berlaku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoktp() {
        return noktp;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTtl() {
        return ttl;
    }

    public void setTtl(Date ttl) {
        this.ttl = ttl;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getWarganegara() {
        return warganegara;
    }

    public void setWarganegara(String warganegara) {
        this.warganegara = warganegara;
    }

    public String getBerlaku() {
        return berlaku;
    }

    public void setBerlaku(String berlaku) {
        this.berlaku = berlaku;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
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
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ti.umy.projectKTP.Data[ id=" + id + " ]";
    }
    
}
