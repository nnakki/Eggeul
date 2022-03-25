package Team1.Eggeul.mapper;

import Team1.Eggeul.domain.ChatAttendVO;
import Team1.Eggeul.domain.ChatMessageVO;
import Team1.Eggeul.domain.ChatRoomVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatRoomMapper {

    public List<ChatRoomVO> getRoomList();

    public List<ChatRoomVO> getRoomsOfUser(String userId);

    public List<ChatMessageVO> getRoomListById(String userId);

    public void insertRoom(String id);

    public void insertAttendant(@Param("id") String id, @Param("userId") String userId);

    public ChatAttendVO getOldChatRoom(@Param("me") String me, @Param("you") String you);

    public ChatAttendVO getYourId(@Param("chatRoomId") String chatRoomId, @Param("userId") String userId);
}
