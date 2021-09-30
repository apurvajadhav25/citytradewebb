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
import com.aws.citytradeweb.modeldto.MenuSectionDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class MenuSectionAWSController {

	@GetMapping("/menusections")
	public ResponseEntity<List<MenuSectionDTO>> get() {
		List<MenuSectionDTO> menusections = new ArrayList<>();
		return new ResponseEntity<List<MenuSectionDTO>>(menusections, HttpStatus.OK);
	}

	@GetMapping("/menusections/{id}")
	public ResponseEntity<MenuSectionDTO> get(@PathVariable long id) {
		MenuSectionDTO menusection = new MenuSectionDTO();
		if (menusection != null) {
			return new ResponseEntity<MenuSectionDTO>(menusection, HttpStatus.OK);
		}
		return new ResponseEntity<MenuSectionDTO>(menusection, HttpStatus.NOT_FOUND);
	}

	@GetMapping("vendors/{vendorId}/menusections")
	public ResponseEntity<List<MenuSectionDTO>> getMenuSectionByVendorId(@PathVariable long vendorId) {
		List<MenuSectionDTO> menusection = new ArrayList<>();
		if (!menusection.isEmpty()) {
			return new ResponseEntity<List<MenuSectionDTO>>(menusection, HttpStatus.OK);
		}
		return new ResponseEntity<List<MenuSectionDTO>>(menusection, HttpStatus.NOT_FOUND);
	}
	@PostMapping(path = "menusections", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody MenuSectionDTO menusectiondto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/menusections/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody MenuSectionDTO menusectiondto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "menusections/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
