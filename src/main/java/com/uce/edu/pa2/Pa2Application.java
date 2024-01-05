package com.uce.edu.pa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.pa2.repository.modelo.HistoriaClinica;
import com.uce.edu.pa2.repository.modelo.Paciente;
import com.uce.edu.pa2.service.IHistoriaClinicaService;
import com.uce.edu.pa2.service.IPacienteService;

@SpringBootApplication
public class Pa2Application implements CommandLineRunner{
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IHistoriaClinicaService clinicaService;
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
		
		this.clinicaService.guardar(h1);
		//this.iPacienteService.guardar(p1);
	}

}
