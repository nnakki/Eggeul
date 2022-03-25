package Team1.Eggeul.service;

import Team1.Eggeul.domain.GroupCriteria;
import Team1.Eggeul.domain.GroupVO;
import Team1.Eggeul.domain.StudyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexDataService {

    List<GroupVO> popularGroupList(GroupCriteria cri);

    // 인기있는 스터디 리스트
    List<StudyVO> popularStudyList(GroupCriteria cri);

    List<GroupVO> test(GroupCriteria cri);
}
