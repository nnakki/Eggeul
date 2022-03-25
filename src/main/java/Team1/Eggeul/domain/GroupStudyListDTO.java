package Team1.Eggeul.domain;

import lombok.Data;

import java.util.List;

@Data
public class GroupStudyListDTO {
    private int count;
    private List<StudyVO> list;
}
