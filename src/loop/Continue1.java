package loop;

public class Continue1 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; }
            System.out.println(i);
            i++;
        }
        /*
        - `i==3` 인 경우 `i` 를 하나 증가하고 `continue` 를 실행한다.
        - 따라서 이 경우에는 `i` 를 출력하지 않고 바로 `while (i <= 5)` 조건식으로 이동한다.
        */
    }
}
