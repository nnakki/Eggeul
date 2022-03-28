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
    GRTG01("국내 여행"),
    GRTG02("해외 여행"),
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
    GRTG13("PC"),
    GRTG14("태블릿"),
    GRTG15("가전제품"),
    GRTG16("한식"),
    GRTG17("일식"),
    GRTG18("양식"),
    GRTG19("중식"),
    GRTG20("분식"),
    GRTG21("디즈니"),
    GRTG22("지브리"),
    GRTG23("롤"),
    GRTG24("배틀그라운드"),
    GRTG25("로스트아크"),
    GRTG26("카트라이더"),
    GRTG27("오버워치"),
    GRTG28("테일즈런너"),
    GRTG29("서든어택"),
    GRTG30("레인보우식스시즈"),
    GRTG31("메이플스토리"),
    GRTG32("경형"),
    GRTG33("소형"),
    GRTG34("준중형"),
    GRTG35("중형"),
    GRTG36("준대형"),
    GRTG37("대형"),
    GRTG38("스포츠카"),
    GRTG39("꿀팁"),
    GRTG40("레시피"),

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


    GRRO01("모임장"),
    GRRO02("운영진"),
    GRRO03("회원"),
    GRRO04("영구강퇴")
    ;

    private String value;

    CodeTable(String value) {
        this.value = value;
    }


}
