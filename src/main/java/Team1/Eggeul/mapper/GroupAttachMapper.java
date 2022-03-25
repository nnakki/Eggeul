package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.GroupAttachVO;

import java.util.List;

public interface GroupAttachMapper {

    void insert (GroupAttachVO vo);

    void delete(String uuid);

    GroupAttachVO findByGrpSn(Long grpSn);

    void deleteAll(Long grpSn);

    List<GroupAttachVO> getOldFiles();
}
