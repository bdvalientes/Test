package co.com.test.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.com.test.entity.ListPersona;
import co.com.test.entity.Persona;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public Map<Integer, List<Persona>> listPersonGroup(ListPersona personas) {
		// TODO Auto-generated method stub
		Map<Integer, List<Persona>> groupPersona = personas.getNationalTeam().stream()
				.collect(Collectors.groupingBy(Persona::getAge, Collectors.toList()));
		return groupPersona;
	}

	@Override
	public Map<Integer, List<Persona>> listPersonGroupAndOrderByName(ListPersona personas) {
		// TODO Auto-generated method stub
		personas.getNationalTeam().sort(new Comparator<Persona>() {
			@Override
			public int compare(Persona a, Persona b) {
				return a.getName().compareTo(b.getName());
			}
		});
		Map<Integer, List<Persona>> groupPersona = personas.getNationalTeam().stream()
				.collect(Collectors.groupingBy(Persona::getAge, Collectors.toList()));
		return groupPersona;
	}

}
