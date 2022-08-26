package co.com.test.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ListPersona {

	public List<Persona> nationalTeam;

	public ListPersona() {
		this.nationalTeam = new ArrayList<Persona>();
		this.nationalTeam.add(new Persona(37, "Claudio Bravo"));
		this.nationalTeam.add(new Persona(36, "Jean Beausejour"));
		this.nationalTeam.add(new Persona(34, "Gonzalo Jara"));
		this.nationalTeam.add(new Persona(33, "Gary Medel"));
		this.nationalTeam.add(new Persona(32, "Mauricio Isla"));
		this.nationalTeam.add(new Persona(31, "Charles Aránguiz"));
		this.nationalTeam.add(new Persona(33, "Arturo Vidal"));
		this.nationalTeam.add(new Persona(34, "Matias Fernandez"));
		this.nationalTeam.add(new Persona(36, "Jorge Valdivia"));
		this.nationalTeam.add(new Persona(31, "Alexis Sánchez"));
		this.nationalTeam.add(new Persona(30, "Eduardo Vargas"));
	}

}
