package com.uce.edu.pa2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.pa2.repository.modelo.CitaMedica;
import com.uce.edu.pa2.repository.modelo.HistoriaClinica;
import com.uce.edu.pa2.repository.modelo.Paciente;
import com.uce.edu.pa2.service.ICitaMedicaService;
import com.uce.edu.pa2.service.IHistoriaClinicaService;
import com.uce.edu.pa2.service.IPacienteService;

@SpringBootApplication
public class Pa2Application implements CommandLineRunner{
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IHistoriaClinicaService clinicaService;
	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente p1 = new Paciente();
		p1.setNombre("Joel");
		p1.setApellido("Espinosa");

		HistoriaClinica h1 = new HistoriaClinica();
		h1.setEstatura(1.75);
		h1.setImc(17.5);
		h1.setPeso(50.2);

		p1.setHistoriaClinica(h1);
		h1.setPaciente(p1);
		
		//this.clinicaService.guardar(h1);
		//this.iPacienteService.guardar(p1);

		Paciente paux = this.iPacienteService.buscar(1);
		Paciente p2 = new Paciente();
		p2.setNombre("Andres");
		p2.setApellido("Aragon");
		//this.iPacienteService.guardar(p2);

		CitaMedica c1 = new CitaMedica();
		c1.setFecha(LocalDateTime.now());
		c1.setMotivo("Esguince");
		c1.setTratante("Doc. Rodillas");
		c1.setPaciente(p2);
		CitaMedica c3 = new CitaMedica();
		c3.setFecha(LocalDateTime.of(2024, 3, 2, 10, 0, 0));
		c3.setMotivo("Magnetoterapia");
		c3.setTratante("Doc. Rodillas");
		c3.setPaciente(p2);

		CitaMedica c2 = new CitaMedica();
		c2.setFecha(LocalDateTime.of(2024, 2, 2, 10, 0, 0));
		c2.setMotivo("Distencion");
		c2.setTratante("Doc. Traramiento");
		c2.setPaciente(paux);

		List<CitaMedica> citasP2 = new ArrayList<>();
		citasP2.add(c3);
		citasP2.add(c1);
		List<CitaMedica> citasPaux = new ArrayList<>();
		citasPaux.add(c2);
		
		p2.setCitas(citasP2);
		paux.setCitas(citasPaux);

		//this.citaMedicaService.guardar(c2);
		this.citaMedicaService.guardar(c3);
	}

}
