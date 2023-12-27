package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        /*
        예제2. 상품 주문 시스템 개발 - 사용자 입력
        주문 수량을 입력 받자 - 예) 입력할 주문의 개수를 입력하세요:
        가격, 수량, 상품명을 입력 받자 - 입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
        입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요:" );
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요. ");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);

        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        // 단축키 - option + command + V
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
        // iter 단축키
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
/*
정리
**대원칙: 자바는 항상 변수의 값을 복사해서 대입한다.**
자바에서 변수에 값을 대입하는 것은 변수에 들어 있는 값을 복사해서 대입하는 것이다.
기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다.
기본형이면 변수에 들어 있는 실제 사용하는 값을 복사 해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.
기본형이든 참조형이든 변수의 값을 대입하는 방식은 같다. 하지만 기본형과 참조형에 따라 동작하는 방식이 달라진다.


**기본형 vs 참조형 - 기본**
자바의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 나눌 수 있다.
기본형을 제외한 나머지 변수는 모두 참조형이다. 클래스와 배열을 다루는 변수는, 참조형이다.
기본형 변수는 값을 직접 저장하지만, 참조형 변수는 참조(주소)를 저장한다.
기본형 변수는 산술 연산을 수행할 수 있지만, 참조형 변수는 산술 연산을 수행할 수 없다.
기본형 변수는 `null` 을 할당할 수 없지만, 참조형 변수는 `null` 을 할당할 수 있다.


**기본형 vs 참조형 - 대입**
기본형과 참조형 모두 대입시 변수 안에 있는 값을 읽고 복사해서 전달한다.
기본형은 사용하는 값을 복사해서 전달하고, 참조형은 참조값을 복사해서 전달한다! 이것이 중요하다.
실제 인스턴스가 복사되는 것이 아니다. 인스턴스를 가리키는 참조값을 복사해서 전달하는 것이다! 따라서 하나의 인스턴스를 여러곳에서 참조할 수 있다.
헷갈리면 그냥 변수 안에 들어간 값을 떠올려보자. 기본형은 사용하는 값이, 참조형은 참조값이 들어있다! 변수에 어떤 값이 들어있든간에 그 값을 그대로 복사해서 전달한다.


**기본형 vs 참조형 - 메서드 호출**
메서드 호출시 기본형은 메서드 내부에서 매개변수(파라미터)의 값을 변경해도 호출자의 변수 값에는 영향이 없다.
메서드 호출시 참조형은 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
 */
