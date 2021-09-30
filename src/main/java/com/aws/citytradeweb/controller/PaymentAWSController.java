package com.aws.citytradeweb.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aws.citytradeweb.Constant;
import com.aws.citytradeweb.modeldto.PaymentDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class PaymentAWSController {
	
	@GetMapping("/payments")
	public ResponseEntity<List<PaymentDTO>> get() {
	    List<PaymentDTO> payments =  new ArrayList<>();
	    return new ResponseEntity<List<PaymentDTO>>(payments,HttpStatus.OK);
	}
	
	@GetMapping("/payments/{id}")
	public ResponseEntity<PaymentDTO> get(@PathVariable long id) {
		PaymentDTO payment =  new PaymentDTO();
		if (payment != null) {
			return new ResponseEntity<PaymentDTO>(payment, HttpStatus.OK);
		}
		return new ResponseEntity<PaymentDTO>(payment, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(path ="payments", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody PaymentDTO paymentdto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
		
	}
	
	@PutMapping(path = "/payments/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody PaymentDTO paymentdto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}
}
