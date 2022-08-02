package API.dto.projects;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class Project {
    @Expose
    String title;
    @Expose
    String code;
    @Expose
    String description;
    @Expose
    String access;
    @Expose
    String group;
    @Expose(serialize = false)
    Counts counts;
}
