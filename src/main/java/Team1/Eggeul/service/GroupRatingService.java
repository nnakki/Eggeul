package Team1.Eggeul.service;

import Team1.Eggeul.domain.GroupCriteria;
import Team1.Eggeul.domain.GroupRatingPageDTO;
import Team1.Eggeul.domain.GroupRatingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupRatingService {

    int register(GroupRatingVO groupRating);

    public GroupRatingVO get(Long sn);

    List<GroupRatingVO> getListWithPaging(@Param("grpSn") Long grpSn, @Param("cri") GroupCriteria cri);

    GroupRatingPageDTO getListPage(GroupCriteria cri, Long grpSn);

    int modify(GroupRatingVO groupRating);

    int delete(Long sn);

}
