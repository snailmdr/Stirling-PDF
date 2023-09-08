package stirling.software.SPDF.model.api;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Data
public class MultiplePDFFiles {
	@Schema(description = "The input PDF files", type = "array", format = "binary")
    private MultipartFile[] fileInput;
}
