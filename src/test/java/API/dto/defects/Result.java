package API.dto.defects;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Result {
    int total;
    int filtered;
    int count;
    ArrayList<Defect> entities;
}
