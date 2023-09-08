package stirling.software.SPDF.model.api.general;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import stirling.software.SPDF.model.api.MultiplePDFFiles;

@Data
public class MergePdfsRequest extends MultiplePDFFiles {
	
    @Schema(description = "The type of sorting to be applied on the input files before merging.",
            allowableValues = {
                "orderProvided", 
                "byFileName", 
                "byDateModified", 
                "byDateCreated", 
                "byPDFTitle"
            }, 
            defaultValue = "orderProvided")
    private String sortType;
}
