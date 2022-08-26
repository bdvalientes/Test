package co.com.test.service;

import java.util.List;
import java.util.Map;

import co.com.test.entity.ListPersona;
import co.com.test.entity.Persona;

public interface TestService {

	public Map<Integer, List<Persona>> listPersonGroup(ListPersona persona);

	public Map<Integer, List<Persona>> listPersonGroupAndOrderByName(ListPersona persona);

}
