package _05_String;

public class PersonalNumber {
    public static void main(String[] args) {
        String pn = "991122-1234567";

        // 1. 앞 6자리만 추출(생년월일)
        // 2. 성별코드 (뒷자리 첫번째 숫자)
        // 출력!

        System.out.println(pn.substring(0,6));
        System.out.println(pn.substring(7,8));

        String email = "baekec1013@gmail.com";
        boolean isValidEmail;
        String username;
        String domainName;
        // 1. 입력한 이메일이 유효한가 - "@" 있는가? "."있는가?
        // 2. 사용자 아이디 추출
        // 3. 도메인(naver, google)추출

        System.out.println(email.contains("@"));
        System.out.println(email.contains("."));
        System.out.println(email.substring(0,10));
        System.out.println(email.substring(11,16));
    }
}
