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
import com.aws.citytradeweb.modeldto.TimeSlotDTO;

@CrossOrigin(origins="*", allowedHeaders = "*", exposedHeaders = "Access-Control-Expose-Headers")
@RestController
public class TimeSlotAWSController {

	@GetMapping("/timeslots")
	public ResponseEntity<List<TimeSlotDTO>> get() {
		List<TimeSlotDTO> timeslots = new ArrayList<>();
		return new ResponseEntity<List<TimeSlotDTO>>(timeslots, HttpStatus.OK);
	}

	@GetMapping("/timeslots/{id}")
	public ResponseEntity<TimeSlotDTO> get(@PathVariable long id) {
		TimeSlotDTO timeSlotdto = new TimeSlotDTO();
		if (timeSlotdto != null) {
			return new ResponseEntity<TimeSlotDTO>(timeSlotdto, HttpStatus.OK);
		}
		return new ResponseEntity<TimeSlotDTO>(timeSlotdto, HttpStatus.NOT_FOUND);
	}

	@PostMapping(path = "timeslots", consumes = "application/json")
	private ResponseEntity<String> add(@RequestBody TimeSlotDTO timeSlotdto) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PutMapping(path = "/timeslots/{id}", consumes = "application/json")
	private ResponseEntity<String> update(@PathVariable long id, @RequestBody TimeSlotDTO timeSlotdto) {
		String message = "";
		if (Constant.NOT_FOUND.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}

	@PostMapping(path = "timeslots/delete-resources", consumes = "application/json")
	public ResponseEntity<String> delete(@RequestBody String[] ids) {
		String message = "";
		if (Constant.EMPTY.equals(message)) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
