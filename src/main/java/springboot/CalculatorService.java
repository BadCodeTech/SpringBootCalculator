package springboot;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorForm calculate(CalculatorForm calculator){
        if (calculator.getOperation().equals("+")) {
            calculator.setResult(calculator.getNumber1() + calculator.getNumber2());
        } else if (calculator.getOperation().equals("-")) {
            calculator.setResult(calculator.getNumber1() - calculator.getNumber2());
        } else if ((calculator.getOperation().equals("*"))){
            calculator.setResult(calculator.getNumber1() * calculator.getNumber2());
        } else if(calculator.getOperation().equals("/")) {
            if(calculator.getNumber2() == 0){
                throw new IllegalArgumentException("Second number cannot be 0!");
            }
            calculator.setResult(calculator.getNumber1() / calculator.getNumber2());
        }
        return calculator;
    }

}

