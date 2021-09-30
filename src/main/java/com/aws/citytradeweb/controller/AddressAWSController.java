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
import com.aws.citytradeweb.modeldto.AddressDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class AddressAWSController {

	@GetMapping("/addresses")
	public ResponseEntity<List<AddressDTO>> get() {
		List<AddressDTO> addresses = new ArrayList<>();
		return new ResponseEntity<List<AddressDTO>>(addresses, HttpStatus.OK);
	}

	@GetMapping("/addresses/{id}")
	public ResponseEntity<AddressDTO> get(@PathVariable long id) {
		AddressDTO address = new AddressDTO();
		if (address != null) {
			return new ResponseEntity<AddressDTO>(address, HttpStatus.OK);
		}
		return new ResponseEntity<AddressDTO>(address, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "addresses", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody AddressDTO addressdto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);

	}
	
	@PutMapping(path = "/addresses/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody AddressDTO addressdto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}
	
	@PostMapping(path = "addresses/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
