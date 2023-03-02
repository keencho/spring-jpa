package com.keencho.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    private static final List<String> nf = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
            "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
            "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
            "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
            "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");

    private static final List<String> ns = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
            "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
            "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
            "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
            "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
            "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
            "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
            "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
            "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
            "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");

    private static final Random rand = new Random();

    public static String name() {
        var f = nf.get(rand.nextInt(nf.size()));
        var s = ns.get(rand.nextInt(ns.size()));

        String t;
        do {
            t = ns.get(rand.nextInt(ns.size()));
        } while (s.equals(t));

        return f + s + t;
    }

    public static String phone() {
        return "010" + (int)(Math.random() * 8999) + (int)(Math.random() * 8999);
    }

    private static final List<String> af = Arrays.asList("종로구","중구","용산구","성동구","광진구","동대문구","중랑구","성북구",
            "강북구","도봉구","노원구","은평구","서대문구","마포구","양천구","강서구",
            "구로구","금천구","영등포구","동작구","관악구","서초구","강남구","송파구","강동구");

    private static final List<String> as = Arrays.asList("남부순환로","양재대로","영동대로","언주로","논현로","개포로","삼성로","선릉로","개포로109길","개포로15길","개포로17길","개포로20길",
            "개포로21길","개포로22길","개포로24길","개포로25길","개포로26길","개포로28길","개포로30길","개포로31길","개포로32길","개포로34길",
            "개포로35길","개포로36길","개포로38길","개포로82길");

    public static String address() {
        return "서울특별시 " + af.get(rand.nextInt(af.size())) + " " + as.get(rand.nextInt(as.size()));
    }

    private static final List<String> i = Arrays.asList("컴퓨터", "모니터", "스마트폰", "물병", "의자", "우산", "책", "선풍기", "에어컨", "안경집", "물티슈", "롱패딩",
            "오트밀", "가래떡", "순대", "기름종이", "로션", "크림", "아이라이너", "인공눈물", "홍삼", "다이어리", "명함집", "맥북"
    );

    public static String itemName() {
        return i.get(rand.nextInt(i.size()));
    }
}
