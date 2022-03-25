package Team1.Eggeul.service;

import Team1.Eggeul.domain.ChatMessageVO;

import java.util.List;

public interface ChatMessageService {

    // 채팅메시지 등록
    public void registerMsg(ChatMessageVO msg);

    // 해당 채팅방의 채팅 메시지 불러오기
    public List<ChatMessageVO> getMsg(String chatRoomId);

    public List<ChatMessageVO> getUnreadMsg(String senderId, String receiverId);

    public void readMsg(long sn);

    // 해당 유저의 안읽은 메시지 전체 개수를 반환 (메인페이지용)
    public ChatMessageVO getTotalUnreadMsg(String userId);
}
