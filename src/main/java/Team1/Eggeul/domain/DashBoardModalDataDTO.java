package Team1.Eggeul.domain;

import lombok.Data;

import java.util.List;

@Data
public class DashBoardModalDataDTO {
    int count;
    List<DashBoardModalDataVO> list;
}
