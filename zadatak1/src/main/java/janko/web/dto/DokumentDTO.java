package janko.web.dto;

import java.time.LocalDateTime;

import janko.utils.TipDokumenta;

public class DokumentDTO {

	
	private long id;
	private LocalDateTime created;
	private LocalDateTime modified;
	private String brojDokumenta;
	private TipDokumenta tipDokumenta;
	private String maticniBroj;
	private int pib;
	private double iznosBezPdv;
	private double pdv;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMaticniBroj() {
		return maticniBroj;
	}
	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
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
	
	
}
