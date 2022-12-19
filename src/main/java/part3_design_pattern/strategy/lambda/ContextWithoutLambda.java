package part3_design_pattern.strategy.lambda;

/*
Lambda 식을 사용하지 않고, ValidationStrategy 를 직접 주입받아 처리함
 */
public class ContextWithoutLambda {

    public static void main(String[] args) {
        String input = "123456";

        NumberValidationStrategy numberValidationStrategy = new NumberValidationStrategy();
        LengthValidationStrategy lengthValidationStrategy = new LengthValidationStrategy();
        Validator numberValidator = new Validator(numberValidationStrategy);

        System.out.println(numberValidator.validate(input));

        Validator lengthValidator = new Validator(lengthValidationStrategy);

        System.out.println(lengthValidator.validate(input));


    }
}
