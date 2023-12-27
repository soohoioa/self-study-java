package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
/*
`temp` 를 `if` 코드 블록 안에서 선언했다.
이제 `temp` 는 `if` 코드 블록 안으로 스코프가 줄어든다.
덕분에 `temp` 메모 리를 빨리 제거해서 메모리를 효율적으로 사용하고, `temp` 변수를 생각해야 하는 범위를 줄여서 더 유지보수 하기 좋은 코드를 만들었다.
 */