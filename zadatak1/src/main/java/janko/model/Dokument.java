package janko.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import janko.utils.TipDokumenta;
@Entity
public class Dokument {
	@Id
	@GeneratedValue
	@Column
	private long id;
	@Column(nullable = false)
	private LocalDateTime created;
	@Column
	private LocalDateTime modified;
	@Column(nullable = false)
	private String brojDokumenta;
	@Column(nullable = false)
	private TipDokumenta tipDokumenta;
	@Column
	private String maticniBroj;
	@Column
	private int pib;
	@Column
	private double iznosBezPdv;
	@Column
	private double pdv;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getModified() {
		return modified;
	}
	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
	public String getBrojDokumenta() {
		return brojDokumenta;
	}
	public void setBrojDokumenta(String brojDokumenta) {
		this.brojDokumenta = brojDokumenta;
	}
	public TipDokumenta getTipDokumenta() {
		return tipDokumenta;
	}
	public void setTipDokumenta(TipDokumenta tipDokumenta) {
		this.tipDokumenta = tipDokumenta;
	}
	public String getMaticniBroj() {
		return maticniBroj;
	}
	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public double getIznosBezPdv() {
		return iznosBezPdv;
	}
	public void setIznosBezPdv(double iznosBezPdv) {
		this.iznosBezPdv = iznosBezPdv;
	}
	public double getPdv() {
		return pdv;
	}
	public void setPdv(double pdv) {
		this.pdv = pdv;
	}
	public Dokument() {
		super();
	}
	public Dokument(LocalDateTime created, LocalDateTime modified, String brojDokumenta, TipDokumenta tipDokumenta,
			String maticniBroj, int pib, double iznosBezPdv, double pdv) {
		super();
		this.created = created;
		this.modified = modified;
		this.brojDokumenta = brojDokumenta;
		this.tipDokumenta = tipDokumenta;
		this.maticniBroj = maticniBroj;
		this.pib = pib;
		this.iznosBezPdv = iznosBezPdv;
		this.pdv = pdv;
	}
	
	
}
