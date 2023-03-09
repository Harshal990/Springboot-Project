package CalculatorProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DivisionOperation {
	@GetMapping("/calculator/division")
	public String additionNo(@RequestParam(value="firstParamForDiv",required=true,defaultValue="3")int firstParamForDiv ,
			@RequestParam(value="secondParamForDiv", required=true,defaultValue="2")int secondParamForDiv)
	{
		return"</h2>Sum of two number is"+Calculator.divNo(firstParamForDiv, secondParamForDiv)+"</h2>";
	}

}