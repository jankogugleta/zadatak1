package janko;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import janko.model.Dokument;
import janko.service.DokumentService;
import janko.service.impl.JpaDokumentService;
import janko.utils.TipDokumenta;

@Component
public class TestData {

	@Autowired(required=true)
	JpaDokumentService ds;

	@PostConstruct
	public void init() {

		Dokument q = new Dokument(LocalDateTime.now(), null, "123", TipDokumenta.NALOG, "00200", 555, 250.6, 0.18);
		Dokument w = new Dokument(LocalDateTime.now(), null, "99", TipDokumenta.OTPREMNICA, "9879", 36, 20050.6, 0.18);

		ds.save(q);
		ds.save(w);

	}
}