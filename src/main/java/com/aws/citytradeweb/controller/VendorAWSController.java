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
import com.aws.citytradeweb.modeldto.VendorDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class VendorAWSController {
	
	@GetMapping("/vendors")
	public ResponseEntity<List<VendorDTO>> get() {
	    List<VendorDTO> vendors =  new ArrayList<>();
	    return new ResponseEntity<List<VendorDTO>>(vendors,HttpStatus.OK);
	}
	
	@GetMapping("/vendors/{id}")
	public ResponseEntity<VendorDTO> get(@PathVariable long id) {
		VendorDTO vendor =  new VendorDTO();
		if (vendor != null) {
			return new ResponseEntity<VendorDTO>(vendor, HttpStatus.OK);
		}
		return new ResponseEntity<VendorDTO>(vendor, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("categories/{categoryId}/vendors")
	public ResponseEntity<List<VendorDTO>> getVendorsByCategory(@PathVariable long categoryId) {
		List<VendorDTO> vendorlist =  new ArrayList<>();
		System.out.println(vendorlist);
		if (!vendorlist.isEmpty()) {
			return new ResponseEntity<List<VendorDTO>>(vendorlist, HttpStatus.OK);
		}
		return new ResponseEntity<List<VendorDTO>>(vendorlist, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("categories/{categoryId}/term/{startingVendorName}")
	public ResponseEntity<List<VendorDTO>> getVendorsByStartingName(@PathVariable long categoryId, @PathVariable String startingVendorName) {
		List<VendorDTO> vendorlist;
		System.out.println("in" + categoryId + "   "+ startingVendorName);
		if (categoryId != 0) {
			vendorlist = new ArrayList<>();
		} else {
			vendorlist = new ArrayList<>();
		}
		System.out.println(vendorlist);
		if (!vendorlist.isEmpty()) {
			return new ResponseEntity<List<VendorDTO>>(vendorlist, HttpStatus.OK);
		}
		return new ResponseEntity<List<VendorDTO>>(vendorlist, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(path ="vendors", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody VendorDTO vendordto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
		
	}
	
	@PutMapping(path = "/vendors/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody VendorDTO vendordto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "vendors/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
}
