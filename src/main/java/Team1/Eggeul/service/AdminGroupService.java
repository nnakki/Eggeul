package Team1.Eggeul.service;

import Team1.Eggeul.domain.AdminGroupCriteria;
import Team1.Eggeul.domain.AdminGroupPageDTO;

public interface AdminGroupService {

    //어드민 모임 리스트 페이징
    AdminGroupPageDTO adminGetGroupListWithPagingBySn(AdminGroupCriteria cri);

    //어드민 모임 삭제
    int adminGroupRemove(Long sn);

}
