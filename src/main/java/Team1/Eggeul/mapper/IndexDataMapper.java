package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.GroupVO;
import Team1.Eggeul.domain.StudyVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IndexDataMapper {

    List<GroupVO> popularGroupList(@Param("pageNum") int pageNum, @Param("amount") int amount);

    List<StudyVO> popularStudyList(@Param("pageNum") int pageNum, @Param("amount") int amount);

    Date timeTest();

    void setSessionTime();
}
