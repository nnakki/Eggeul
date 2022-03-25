package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.AdminStudyCriteria;
import Team1.Eggeul.domain.AdminStudyPageDTO;
import Team1.Eggeul.domain.AdminStudyVO;

import java.util.List;

public interface AdminStudyMapper {

    // 전체 스터디 리스트 반환
    public List<AdminStudyVO> getTotalStudyList(AdminStudyCriteria cri);

    public AdminStudyPageDTO getTotalCnt();

    // 예정된 스터디 리스트 반환
    public List<AdminStudyVO> getFutureStudyList(AdminStudyCriteria cri);

    // 지난 스터디 리스트 반환
    public List<AdminStudyVO> getPastStudyList(AdminStudyCriteria cri);

    // 삭제된 스터디 리스트 반환
    public List<AdminStudyVO> getDeletedStudy(AdminStudyCriteria cri);
}
