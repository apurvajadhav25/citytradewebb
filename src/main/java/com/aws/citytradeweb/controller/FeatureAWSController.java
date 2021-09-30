package com.aws.citytradeweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
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
import com.aws.citytradeweb.modeldto.FeatureDTO;
import com.cg.fda.domain.DeliveryBoy;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class FeatureAWSController {
	

	@GetMapping("/features")
	public ResponseEntity<List<FeatureDTO>> get() {
		List<FeatureDTO> features = new ArrayList<>();
		return new ResponseEntity<List<FeatureDTO>>(features, HttpStatus.OK);
	}

	@GetMapping("/features/{id}")
	public ResponseEntity<FeatureDTO> get(@PathVariable long id) {
		FeatureDTO feature = new FeatureDTO();
		if (feature != null) {
			return new ResponseEntity<FeatureDTO>(feature, HttpStatus.OK);
		}
		return new ResponseEntity<FeatureDTO>(feature, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "features", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody FeatureDTO featuredto) {
		String message = "";
		
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/features/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody FeatureDTO featuredto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "features/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
