package API.dto.projects;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Result {
    int total;
    int filtered;
    int count;
    ArrayList<Project> entities;
}