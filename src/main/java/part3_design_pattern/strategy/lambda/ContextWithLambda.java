package part3_design_pattern.strategy.lambda;

/*
Strategy concrete class 를 따로 생성하지 않고,
Lambda 를 통해 특정 조건에 따른 Operator 를 갖는 Functional Interface 의 익명 구현체를 주입받는다.

이 경우에는 ValidationStrategy 의 익명 구현체를 주입받음

단, Strategy 가 Functional Interface 인 경우에만 적용가능함.

Functional Interface 는 하나의 함수(람다 표현식의 대상이 될)만 가질 수 있기 때문.
 */
public class ContextWithLambda {

    public static void main(String[] args) {

        String input = "123456";
        Validator numberValidator = new Validator((s -> s.matches("\\d+")));
        Validator lengthValidator = new Validator(s -> s.length()>5);

        System.out.println(numberValidator.validate(input));
        System.out.println(lengthValidator.validate(input));
    }
}
