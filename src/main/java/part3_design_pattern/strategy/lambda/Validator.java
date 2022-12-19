package part3_design_pattern.strategy.lambda;

public class Validator {

    private final ValidationStrategy validationStrategy;

    //Validator 는 ValidationStrategy 에게 abstract validate 를 위임받음
    public Validator(final ValidationStrategy validationStrategy){
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String s){
        return validationStrategy.validate(s);
    }

}
