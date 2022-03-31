package Team1.Eggeul.domain;

import lombok.Getter;

@Getter
public enum CodeTable {
    //카테고리
    GRCA01("여행"),
    GRCA02("반려동물"),
    GRCA03("외국어"),
    GRCA04("음악"),
    GRCA05("전자기기"),
    GRCA06("맛집"),
    GRCA07("만화"),
    GRCA08("게임"),
    GRCA09("자동차"),
    GRCA10("요리"),
    GRCA11("기타"),

    //태그
    GRTG01("국내여행"),
    GRTG02("해외여행"),
    GRTG03("고양이"),
    GRTG04("강아지"),
    GRTG05("햄스터"),
    GRTG06("파충류"),
    GRTG07("영어"),
    GRTG08("일본어"),
    GRTG09("중국어"),
    GRTG10("프랑스어"),
    GRTG11("러시아어"),
    GRTG12("핸드폰"),
    GRTG13("PC/태블릿"),
    GRTG14("가전제품"),
    GRTG15("한식"),
    GRTG16("분식"),
    GRTG17("일식"),
    GRTG18("양식"),
    GRTG19("중식"),
    GRTG20("지브리"),
    GRTG21("디즈니"),
    GRTG22("메이플스토리"),
    GRTG23("롤"),
    GRTG24("배틀그라운드"),
    GRTG25("로스트아크"),
    GRTG26("카트라이더"),
    GRTG27("오버워치"),
    GRTG28("테일즈런너"),
    GRTG29("서든어택"),
    GRTG30("레인보우식스시즈"),
    GRTG31("스포츠카"),
    GRTG32("경형"),
    GRTG33("소형"),
    GRTG34("준중형"),
    GRTG35("중형"),
    GRTG36("준대형"),
    GRTG37("대형"),
    GRTG38("꿀팁"),
    GRTG39("레시피"),
    GRTG40("기타"),

    // 시
    LODO01("서울특별시"),

    // 구
    LOGU01("강남구"),
    LOGU02("강동구"),
    LOGU03("강북구"),
    LOGU04("강서구"),
    LOGU05("관악구"),
    LOGU06("광진구"),
    LOGU07("구로구"),
    LOGU08("금천구"),
    LOGU09("노원구"),
    LOGU10("도봉구"),
    LOGU11("동대문구"),
    LOGU12("동작구"),
    LOGU13("마포구"),
    LOGU14("서대문구"),
    LOGU15("서초구"),
    LOGU16("성동구"),
    LOGU17("성북구"),
    LOGU18("송파구"),
    LOGU19("양천구"),
    LOGU20("영등포구"),
    LOGU21("용산구"),
    LOGU22("은평구"),
    LOGU23("종로구"),
    LOGU24("중구"),
    LOGU25("중랑구"),

    //모임 내 권한
    GRRO01("모임장"),
    GRRO02("운영진"),
    GRRO03("회원"),
    GRRO04("영구강퇴"),

    //모임 상태
    GRST01("정상"),
    GRST03("삭제"),

    //모임 가입 상태
    GRUS01("정상상태"),
    GRUS02("탈퇴"),
    GRUS03("영구강퇴"),

    //스터디 상태
    STST01("예정"),
    STST03("종료"),

    //스터디 가입 상태
    STUS01("참가상태"),
    STUS02("탈퇴"),
    STUS03("검토"),
    STUS04("영구강퇴"),

    //TopFix
    BOFI01("일반글"),
    BOFI02("공지글"),

    //게시글
    BOST01("정상"),
    BOST02("삭제"),
    BOST03("신고"),

    //댓글
    RPST01("정상"),
    RPST02("삭제"),
    RPST03("신고");

    private String value;

    CodeTable(String value) {
        this.value = value;
    }
}
