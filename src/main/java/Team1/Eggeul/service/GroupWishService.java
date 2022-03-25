package Team1.Eggeul.service;

import Team1.Eggeul.domain.GroupWishVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupWishService {

    boolean register(GroupWishVO vo);

    GroupWishVO read(GroupWishVO vo);

    boolean delete(GroupWishVO vo);

    List<GroupWishVO> getByGroupSn(long grpSn);

    List<GroupWishVO> getByid(String id);

    boolean remove(@Param("id") String id, @Param("grpSn") long grpSn);

}
