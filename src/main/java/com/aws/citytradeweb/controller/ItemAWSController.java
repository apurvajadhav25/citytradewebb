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
import com.aws.citytradeweb.modeldto.ItemDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class ItemAWSController {
	
	@GetMapping("/items")
	public ResponseEntity<List<ItemDTO>> get() {
		List<ItemDTO> items = new ArrayList<>();
		System.out.println("Controllers "+ new ResponseEntity<List<ItemDTO>>(items, HttpStatus.OK));
		return new ResponseEntity<List<ItemDTO>>(items, HttpStatus.OK);
	}

	@GetMapping("/items/{id}")
	public ResponseEntity<ItemDTO> get(@PathVariable long id) {
		ItemDTO items = new ItemDTO();
		if (items != null) {
			return new ResponseEntity<ItemDTO>(items, HttpStatus.OK);
		}
		return new ResponseEntity<ItemDTO>(items, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/menusections/{menuSectionId}/items")
	public ResponseEntity<List<ItemDTO>> getItemByMenuSectionId(@PathVariable long menuSectionId) {
		List<ItemDTO> items = new ArrayList<>();
		if (!items.isEmpty()) {
			return new ResponseEntity<List<ItemDTO>>(items, HttpStatus.OK);
		}
		return new ResponseEntity<List<ItemDTO>>(items, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(path = "items", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody ItemDTO itemDto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/items/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody ItemDTO itemDto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "items/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
