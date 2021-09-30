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
import com.aws.citytradeweb.modeldto.UserDetailDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class UserDetailAWSController {

	@GetMapping("/userdetails")
	public ResponseEntity<List<UserDetailDTO>> get() {
		List<UserDetailDTO> userDetails = new ArrayList<>();
		return new ResponseEntity<List<UserDetailDTO>>(userDetails, HttpStatus.OK);
	}

	@GetMapping("/userdetails/{id}")
	public ResponseEntity<UserDetailDTO> get(@PathVariable long id) {
		UserDetailDTO userDetail = new UserDetailDTO();
		if (userDetail != null) {
			return new ResponseEntity<UserDetailDTO>(userDetail, HttpStatus.OK);
		}
		return new ResponseEntity<UserDetailDTO>(userDetail, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "userdetails", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody UserDetailDTO userDetailDto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/userdetails/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody UserDetailDTO userDetailDto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "userdetails/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(path = "userdetails/search/{contactNo}")
	private ResponseEntity<UserDetailDTO> get(@PathVariable String contactNo) {
		UserDetailDTO userDetail = new UserDetailDTO();
		return new ResponseEntity<UserDetailDTO>(userDetail, HttpStatus.OK);
	}

}
