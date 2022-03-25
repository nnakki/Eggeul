package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.AuthVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthMapper {

    List<AuthVO> getList(String id);

    int insert(@Param("id") String id, @Param("auth") String auth);

    int delete(@Param("id") String id);

    int deleteAuth(@Param("id") String id, @Param("auth") String auth);

    AuthVO select(@Param("id") String id, @Param("auth") String auth);

}
