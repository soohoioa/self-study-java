package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5; // 이번에는 `main()` 에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘다 `number` 로 같다.
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
    /*
    `main()` 도 사실은 메서드이다.
    각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
    물론 이름이 같아도 완전히 다른 변수다.
    따라서 `main()` 의 `number` 와 `changeNumber()` 의 `number` 는 서로 다른 변수이다.
     */
}
/*
changeNumber(number); //changeNumber 를 호출한다. main 의 number(5)
changeNumber(5); //number 의 값을 읽는다.

//main 의 number 값 5가 changeNumber 의 number 에 복사된다.
//결과: main 의 number(5), changeNumber 의 number(5)
void changeNumber(int number=5)

//changeNumber 의 number 에 값 10을 대입한다.
//결과: main 의 number(5), changeNumber 의 number(10) number = number * 2;
main 의 number 을 출력한다: main 의 number 의 값인 5가 출력된다.
 */
