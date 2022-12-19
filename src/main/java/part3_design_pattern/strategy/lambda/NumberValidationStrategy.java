package part3_design_pattern.strategy.lambda;

public class NumberValidationStrategy implements ValidationStrategy{

    @Override
    public boolean validate(String s) {
        return s.matches("\\d+");
    }

}
