package part3_design_pattern.strategy.lambda;

public class LengthValidationStrategy implements ValidationStrategy{

    @Override
    public boolean validate(String s) {
        return s.length() > 5;
    }
}
