package janko.support;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import janko.model.Dokument;
import janko.web.dto.DokumentDTO;


@Component
public class DokumentToDto  implements Converter<Dokument, DokumentDTO>{

	@Override
	public DokumentDTO convert(Dokument source) {
		DokumentDTO ret = new DokumentDTO();
		
		BeanUtils.copyProperties(source, ret);
		
		return ret;
	}
	
	public List<DokumentDTO> convert(List<Dokument> source){
		List<DokumentDTO> ret = new ArrayList<DokumentDTO>();
		for (Dokument racun : source) {
			ret.add(convert(racun));
		}
		return ret;
	}

}
