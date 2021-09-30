package com.aws.citytradeweb.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.amazonaws.services.s3.AmazonS3;
import com.aws.citytradeweb.service.AmazonClient;


@CrossOrigin
@RestController
public class FileUploadController {
	private AmazonS3 s3client;

	private AmazonClient amazonClient;

	@Autowired
	FileUploadController(AmazonClient amazonClient) {
		this.amazonClient = amazonClient;
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestPart(value = "file") MultipartFile file,@RequestParam String folderName) throws IOException {
		return this.amazonClient.uploadFile(file,folderName);
	}
	
/*	@PostMapping("/createFolder")
	public String createFolder(@RequestParam String folderName) throws IOException {
		return this.amazonClient.createFolder(folderName);
	}*/
	

	@DeleteMapping("/deleteFile")
	public String deleteFile(@RequestPart(value = "url") String fileUrl) {
		return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
	}
	
}

