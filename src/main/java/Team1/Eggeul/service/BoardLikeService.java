package Team1.Eggeul.service;

import Team1.Eggeul.domain.BoardLikeVO;
import org.apache.ibatis.annotations.Param;

public interface BoardLikeService {

    public int register(BoardLikeVO boardLike);

    public int remove(@Param("brdSn") long brdSn, @Param("userId") String userId);

    public BoardLikeVO read(BoardLikeVO boardLike);

    public int getBoardLikeCnt(long brdSn);

}
