package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorControler {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculator")
    public String printCalculator(Model model) {
        model.addAttribute("calculator", new CalculatorForm());
        return "calculator";
    }

    @PostMapping("/calculator")
    public String handleCalculator(@ModelAttribute CalculatorForm calculator){
       calculatorService.calculate(calculator);
       return "result";
    }

}
