package com.aws.citytradeweb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aws.citytradeweb.Constant;
import com.aws.citytradeweb.modeldto.CategoryDTO;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class CategoryAWSController {
	
 
	private static Map<String, CategoryDTO> categoryRepository = new HashMap();
	private int primaryKey=6;
	
	static {
		CategoryDTO category1 = new CategoryDTO();
		category1.setId(1);
		category1.setName("Restaurant");
		category1.setFilterHeading("Khana Khazana");
		categoryRepository.put(String.valueOf(category1.getId()), category1);
		
		CategoryDTO category2 = new CategoryDTO();
		category2.setId(2);
		category2.setName("Garments");
		category2.setFilterHeading("Kapda");
		categoryRepository.put(String.valueOf(category2.getId()), category2);
		
		CategoryDTO category3 = new CategoryDTO();
		category3.setId(3);
		category3.setName("Jewellery");
		category3.setFilterHeading("Gahana");
		categoryRepository.put(String.valueOf(category3.getId()), category3);
		
		CategoryDTO category4 = new CategoryDTO();
		category4.setId(4);
		category4.setName("Gym");
		category4.setFilterHeading("Body Building");
		categoryRepository.put(String.valueOf(category4.getId()), category4);
		
		CategoryDTO category5 = new CategoryDTO();
		category5.setId(5);
		category5.setName("Grocery");
		category5.setFilterHeading("Kirana");
		categoryRepository.put(String.valueOf(category5.getId()), category5);
		
		CategoryDTO category6 = new CategoryDTO();
		category6.setId(6);
		category6.setName("Real Estate");
		category6.setFilterHeading("Builder");
		categoryRepository.put(String.valueOf(category6.getId()), category6);
		
		CategoryDTO category7 = new CategoryDTO();
		category7.setId(7);
		category7.setName("Class");
		category7.setFilterHeading("Tution");
		categoryRepository.put(String.valueOf(category7.getId()), category7);
		
		CategoryDTO category8 = new CategoryDTO();
		category8.setId(8);
		category8.setName("Saloon");
		category8.setFilterHeading("Hair Dressing");
		categoryRepository.put(String.valueOf(category8.getId()), category8);
	}

	@GetMapping("/categories")
	public ResponseEntity<Object> get() {
		System.out.println("Get Categories");
		return new ResponseEntity<>(categoryRepository.values(), HttpStatus.OK);

	}

	@GetMapping("/categories/{id}")
	public ResponseEntity<Object> get(@PathVariable long id) {
		System.out.println("Get Category by id");
		CategoryDTO category = categoryRepository.get(String.valueOf(id));
		if (category != null) {
			return new ResponseEntity<>(category, HttpStatus.OK);
		}
		return new ResponseEntity<>(category, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "categories", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody CategoryDTO categorydto) {
		primaryKey=primaryKey+1;
		categorydto.setId(primaryKey);
		categoryRepository.put(String.valueOf(primaryKey), categorydto);
		System.out.println("Added Category");
	
		return new ResponseEntity<String>("Created Successfully", HttpStatus.CREATED);
	}

	@PutMapping(path = "/categories/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody CategoryDTO categorydto) {
		categoryRepository.remove(id);
		categorydto.setId(id);
		categoryRepository.put(String.valueOf(id), categorydto);
		System.out.println("Updated Category");
		return new ResponseEntity<String>("Updated Successfully", HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/categories/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		System.out.println(id);
		categoryRepository.remove(id);
		System.out.println("Deleted Successfully");
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.NO_CONTENT);
	}

	@PostMapping(path = "categories/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			boolean isUploaded = false;
			System.out.println("OriginalFilename: "+file.getOriginalFilename());
			System.out.println("Size: "+file.getSize());
			System.out.println("Name: "+file.getName());
			System.out.println("ContentType: "+file.getContentType());
			if(file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
			}
			if(!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG content are allowed");
			}
			/*
			 * FileUploadHelper fileUploadHelper = new FileUploadHelper(); isUploaded =
			 * fileUploadHelper.uploadFile(file);
			 */
			if (isUploaded) {
				return ResponseEntity.ok(Constant.IMAGE + Constant.UPLOADED_SUCCESSFULLY);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constant.IMAGE + Constant.UPLOAD_FAILED);
	}

}
