package co.com.test.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.test.entity.ListPersona;
import co.com.test.entity.Persona;
import co.com.test.service.TestService;

@RestController
public class TestController implements ITestController {

	@Autowired
	private TestService testService;

	@GetMapping(path = "personGroup")
	public ResponseEntity<?> listPersonGroup() {
		Map<Integer, List<Persona>> response = testService.listPersonGroup(new ListPersona());
		return new ResponseEntity<>(response, OK);
	}

	@GetMapping(path = "personGroupAndOrder")
	public ResponseEntity<?> listPersonGroupAndOrderByName() {
		Map<Integer, List<Persona>> response = testService.listPersonGroupAndOrderByName(new ListPersona());
		return new ResponseEntity<>(response, OK);
	}

}
