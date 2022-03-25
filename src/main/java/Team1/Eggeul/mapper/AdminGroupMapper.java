package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.AdminGroupCriteria;
import Team1.Eggeul.domain.GroupVO;

import java.util.List;

public interface AdminGroupMapper {

    //모임 리스트
    List<GroupVO> adminGetGroupListWithPagingBySn(AdminGroupCriteria cri);

    //모임 개수
    int adminGetCountBySn(AdminGroupCriteria cri);

    //모임 삭제
    int adminGroupRemove(Long sn);

    //모임 수정
    int adminGroupUpdate(GroupVO groupVO);
}
