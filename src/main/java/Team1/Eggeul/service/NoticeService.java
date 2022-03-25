package Team1.Eggeul.service;

import Team1.Eggeul.domain.NoticeVO;

import java.util.List;

public interface NoticeService {
    // 알림 등록
    public void register(NoticeVO notice);

    public List<NoticeVO> getList(String userId);

    public void modify(long sn);

}
