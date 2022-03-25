package Team1.Eggeul.domain;

import lombok.Data;

import java.util.List;

@Data
public class MemberDTO {

    List<MemberVO> list;
    int count;
}
