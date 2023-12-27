package cond;

public class Switch3 {
    public static void main(String[] args) {
        /*
        만약 `break` 문이 없으면?
         */

        int grade = 2;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break; }
        System.out.println("발급받은 쿠폰 " + coupon);

        /*
        - 예를 들어서 `grade` 가 2등급이면 먼저 `case 2` 가 실행된다.
        - 그런데 `case 2` 에는 `break` 문이 없다. 그러면 중단하지 않고 바로 다음에 있는 `case 3` 의 코드를 실행한다.
        여기서 `coupon = 3000;` 을 수행하고 `break` 문을 만나서 `switch` 문 밖으로 빠져나간다.
        - `"발급받은 쿠폰 3000` 이 출력된다.
         */

    }
}
/*
**if문 vs switch문**
`switch` 문 의 조건식을 넣는 부분을 잘 보면 `x>10` 과 같은 참 거짓의 결과가 나오는 조건이 아니라, 단순히 값만 넣을 수 있다.
`switch` 문은 조건식이 특정 `case` 와 같은지만 체크할 수 있다. 쉽게 이야기해서 값이 같은지 확인하는 연산만 가능하다. (문자도 가능)
반면에 `if` 문 은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있다. 예) `x>10` , `x==10`
정리하자면 `swtich` 문 없이 `if` 문만 사용해도 된다. 하지만 특정 값에 따라 코드를 실행할 때는 `switch` 문을 사용하 면 `if` 문 보다 간결한 코드를 작성할 수 있다.
 */