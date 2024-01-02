package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        // super(); //기본 생성자 생략 가능
        this(a, 0); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
/*
- `ClassB` 는 `ClassA` 를 상속 받았다. 상속을 받으면 **생성자의 첫줄**에 `super(...)` 를 사용해서 부모 클래스의 생성자를 호출해야 한다.
  - 예외로 생성자 첫줄에 `this(...)` 를 사용할 수는 있다. 하지만 `super(...)` 는 자식의 생성자 안에서 언젠가는 반드시 호출해야 한다.
- 부모 클래스의 생성자가 기본 생성자(파라미터가 없는 생성자)인 경우에는 `super()` 를 생략할 수 있다.
  - 상속 관계에서 첫줄에 `super(...)` 를 생략하면 자바는 부모의 기본 생성자를 호출하는 `super()` 를 자 동으로 만들어준다.
  - 참고로 기본 생성자를 많이 사용하기 때문에 편의상 이런 기능을 제공한다.
 */