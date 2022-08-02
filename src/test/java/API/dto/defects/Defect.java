package API.dto.defects;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class Defect {
    @Expose
    int id;
    @Expose
    String title;
    @Expose
    String actual_result;
    @Expose
    String status;
    @Expose
    int severity;
}
