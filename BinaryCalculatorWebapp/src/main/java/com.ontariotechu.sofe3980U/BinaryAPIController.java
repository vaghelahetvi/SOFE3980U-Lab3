package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BinaryAPIController {

	@GetMapping("/add")
	public String addString(@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return Binary.add(number1, number2).getValue();
		// http://localhost:8080/add?operand1=111&operand2=1010
	}

	@GetMapping("/add_json")
	public BinaryAPIResult addJSON(
			@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return new BinaryAPIResult(number1, "add", number2, Binary.add(number1, number2));
		// http://localhost:8080/add?operand1=111&operand2=1010
	}

	@GetMapping("/OR")
	public String orString(@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return Binary.OR(number1, number2).getValue();
		// http://localhost:8080/OR?operand1=111&operand2=1010
	}

	@GetMapping("/Multiply")
	public String multiplyString(@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return Binary.Multiply(number1, number2).getValue();
		// http://localhost:8080/Multiply?operand1=111&operand2=1010
	}

	@GetMapping("/AND")
	public String andString(@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return Binary.AND(number1, number2).getValue();
		// http://localhost:8080/AND?operand1=111&operand2=1010
	}

	@GetMapping("/or_json")
	public BinaryAPIResult orJSON(@RequestParam(name = "operand1", required = false, defaultValue = "") String operand1,
			@RequestParam(name = "operand2", required = false, defaultValue = "") String operand2) {
		Binary number1 = new Binary(operand1);
		Binary number2 = new Binary(operand2);
		return new BinaryAPIResult(number1, "or", number2, Binary.add(number1, number2));
		// http://localhost:8080/add?operand1=111&operand2=1010
	}

}