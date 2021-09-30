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
import com.aws.citytradeweb.modeldto.VendorFilterDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class VendorFilterAWSController {

	@GetMapping("/vendorfilters")
	public ResponseEntity<List<VendorFilterDTO>> get() {
		List<VendorFilterDTO> vendorfilters = new ArrayList<>();
		return new ResponseEntity<List<VendorFilterDTO>>(vendorfilters, HttpStatus.OK);
	}

	@GetMapping("/vendorfilters/{id}")
	public ResponseEntity<VendorFilterDTO> get(@PathVariable long id) {
		VendorFilterDTO vendorfilter = new VendorFilterDTO();
		if (vendorfilter != null) {
			return new ResponseEntity<VendorFilterDTO>(vendorfilter, HttpStatus.OK);
		}
		return new ResponseEntity<VendorFilterDTO>(vendorfilter, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("categories/{categoryId}/vendorfilters")
	public ResponseEntity<List<VendorFilterDTO>> getVendorsByCategory(@PathVariable long categoryId) {
		List<VendorFilterDTO> vendorfilterlist =  new ArrayList<>();
		if (!vendorfilterlist.isEmpty()) {
			return new ResponseEntity<List<VendorFilterDTO>>(vendorfilterlist, HttpStatus.OK);
		}
		return new ResponseEntity<List<VendorFilterDTO>>(vendorfilterlist, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "vendorfilters", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody VendorFilterDTO vendorfilterdto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/vendorfilters/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody VendorFilterDTO vendorfilterdto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "vendorfilters/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
