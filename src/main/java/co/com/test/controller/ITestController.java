package co.com.test.controller;

import org.springframework.http.ResponseEntity;

public interface ITestController {

	public ResponseEntity<?> listPersonGroup();

	public ResponseEntity<?> listPersonGroupAndOrderByName();

}
