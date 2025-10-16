package _03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 단항연산자
        int a = 1;
        a++; // a의 값을 1 증가시켜라
        int b = a++; // 후위증감: 사용(대입)후에 증가시켜라 -> 1증가하고 대입된다.
        // b = 2
        a = 1;

        //전위증감: 사용(대입)전에 증가시켜라
        b = ++a; // b = 2

        a = 1;
        // 후위 감소: 먼저 사용(대입)하고 감소
        b = a--; // b = 1

        a = 1;
        // 전위감소: 먼저 감소되고, 대입 됨
        b = --a; // b = 0

        // 단독사용시(대입없이 코드 한줄 차지할때)
        a++; // a를 1 증가시켜라
        ++a; // a를 1 증가시켜라

    }
}
