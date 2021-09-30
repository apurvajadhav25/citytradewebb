package com.aws.citytradeweb.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aws.citytradeweb.modeldto.CategoryDTO;

@RestController
@RequestMapping("/categ/{id}")
public class VendorAWSController2 {
	
	@GetMapping("/ven")
	public ResponseEntity<List<CategoryDTO>> get() {
	    List<CategoryDTO> categories =  new ArrayList<>();
	    return new ResponseEntity<List<CategoryDTO>>(categories,HttpStatus.OK);
	}
	
	@GetMapping("/vend/{id}")
	public ResponseEntity<CategoryDTO> get(@PathVariable long id) {
	    CategoryDTO category =  new CategoryDTO();
	    if(category != null) {
	    return new ResponseEntity<CategoryDTO>(category,HttpStatus.OK);
	    }else {
	    	return new ResponseEntity<CategoryDTO>(category,HttpStatus.NOT_FOUND);
	    }
	}
	
	@PostMapping(path ="/vendo", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody CategoryDTO categorydto) {
		String responseString = "";
		if(responseString.equals("")) {
		return new ResponseEntity<String>(responseString,HttpStatus.CREATED);
		}else {
		return new ResponseEntity<String>(responseString,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
