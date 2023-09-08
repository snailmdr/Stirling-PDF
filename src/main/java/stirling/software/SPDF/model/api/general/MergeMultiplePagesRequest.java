package stirling.software.SPDF.model.api.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import stirling.software.SPDF.model.api.PDFFile;

@Data
public class MergeMultiplePagesRequest extends PDFFile {

    @Schema(description = "The number of pages to fit onto a single sheet in the output PDF.",
            type = "integer", allowableValues = {"2", "3", "4", "9", "16"})
    private int pagesPerSheet;
}
