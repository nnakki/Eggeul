package Team1.Eggeul.domain;

import lombok.Data;

import java.util.List;

@Data
public class GroupListDTO {
    private List<GroupVO> list;
    private int count;
}
