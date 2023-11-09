package test.qsystem.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.qsystem.test.bean.DistributionCenter;
import test.qsystem.test.bean.Empleado;
import test.qsystem.test.bean.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class TechnicalExamApplication {

	public static void main(String[] args) {
		TechnicalExamApplication technicalExamApplication = new TechnicalExamApplication();
		SpringApplication.run(TechnicalExamApplication.class, args);

		technicalExamApplication.question1();
		technicalExamApplication.question2();
		technicalExamApplication.question3();
	}

	private void question1(){
		System.out.println("/**************************QUESTION 1*****************************/");

		List<Persona> orderDniList;
		List<Persona> orderAppPaternList;

		orderDniList = this.setDataPerson();
		orderAppPaternList = this.setDataPerson();

		//list original
		System.out.println("--------------LIST ORIGINAL---------------");
		for (Persona persona : this.setDataPerson()) {
			System.out.println("DNI: " + persona.getDni() + ", Name: " + persona.getNombre() + ", LastName: " + persona.getAppPaterno() + ", motherLastName: " + persona.getAppMatterno());
		}

		//order dni
		this.orderDni(orderDniList);
		//order appPaterno
		this.orderAppPatern(orderAppPaternList);

	}
	private void question2(){
		System.out.println("/**************************QUESTION 2*****************************/");

		List<DistributionCenter> distributionCenterList = this.setDataDistributionCenter();

		for (DistributionCenter distributionCenter: distributionCenterList
			 ) {
			switch (distributionCenter.getName()){
				case "LURIN": this.logicLurin();break;
				case "ICA": this.logicIca();break;
				case "TRUJILLO": this.logicTrujillo();break;
				case "HUANUCO": this.logicHuanuco();break;
				default:System.out.println("no operation for name"); break;
			}

		}

	}
	private void question3(){

		System.out.println("/**************************QUESTION 3*****************************/");

		//para resolver esta pregunta utilizo herencia y sobrescritura

		// Crear una instancia de Persona
		Persona persona1 = new Persona("Juan", "Blas", "Vega");

		// Llamar al método saludar de Persona
		persona1.saludar();

		// Crear una instancia de Empleado
		Empleado empleado1 = new Empleado("Ana", "Salas", "Salcedo",20000);

		// Llamar al método saludar de Persona desde la instancia de Empleado
		empleado1.saludar();

		// Llamar al método trabajar específico de Empleado
		empleado1.trabajar();

	}

	public List<Persona> setDataPerson(){
		Persona persona;
		List<Persona> personaList = new ArrayList<>();

		persona = new Persona();
		persona.setDni("12345678");
		persona.setNombre("Juan");
		persona.setAppPaterno("Perez");
		persona.setAppMatterno("Salas");
		personaList.add(persona);

		persona = new Persona();
		persona.setNombre("Jose");
		persona.setDni("11345678");
		persona.setAppPaterno("Garcia");
		persona.setAppMatterno("Huanuco");
		personaList.add(persona);

		persona = new Persona();
		persona.setNombre("Amy");
		persona.setDni("11145678");
		persona.setAppPaterno("Leon");
		persona.setAppMatterno("Mineto");
		personaList.add(persona);

		persona = new Persona();
		persona.setNombre("Nicolle");
		persona.setDni("11115678");
		persona.setAppPaterno("Prado");
		persona.setAppMatterno("Falcon");
		personaList.add(persona);

		return personaList;
	}

	public void orderDni(List<Persona> orderDniList){
		Collections.sort(orderDniList, new Comparator<Persona>() {
			@Override
			public int compare(Persona persona1, Persona persona2) {
				return persona1.getDni().compareTo(persona2.getDni());
			}
		});

		System.out.println("--------------ORDER DNI---------------");
		// print dni order list
		for (Persona persona : orderDniList) {
			System.out.println("DNI: " + persona.getDni() + ", Name: " + persona.getNombre() + ", LastName: " + persona.getAppPaterno() + ", motherLastName: " + persona.getAppMatterno());
		}
	}

	public void orderAppPatern(List<Persona> orderAppPaternList){
		Collections.sort(orderAppPaternList, new Comparator<Persona>() {
			@Override
			public int compare(Persona persona1, Persona persona2) {
				return persona1.getAppPaterno().compareTo(persona2.getAppPaterno());
			}
		});

		System.out.println("--------------ORDER APPPATERN---------------");
		// print appPatern order list
		for (Persona persona : orderAppPaternList) {
			System.out.println("DNI: " + persona.getDni() + ", Name: " + persona.getNombre() + ", LastName: " + persona.getAppPaterno() + ", motherLastName: " + persona.getAppMatterno());
		}
	}

	public List<DistributionCenter> setDataDistributionCenter(){
		DistributionCenter distributionCenter;
		List<DistributionCenter> distributionCenterList = new ArrayList<>();

		distributionCenter = new DistributionCenter();
		distributionCenter.setId(1L);
		distributionCenter.setName("LURIN");
		distributionCenterList.add(distributionCenter);

		distributionCenter = new DistributionCenter();
		distributionCenter.setId(2L);
		distributionCenter.setName("ICA");
		distributionCenterList.add(distributionCenter);

		distributionCenter = new DistributionCenter();
		distributionCenter.setId(3L);
		distributionCenter.setName("TRUJILLO");
		distributionCenterList.add(distributionCenter);

		distributionCenter = new DistributionCenter();
		distributionCenter.setId(4L);
		distributionCenter.setName("HUANUCO");
		distributionCenterList.add(distributionCenter);

		return   distributionCenterList;

	}

	public void logicLurin(){
		System.out.println("make logicLurin for LURIN");
	}

	public void logicIca(){
		System.out.println("make logicIca for ICA");
	}

	public void logicTrujillo(){
		System.out.println("make logicTrujillo for TRUJILLO");
	}

	public void logicHuanuco(){
		System.out.println("make logicHuanuco for HUANUCO");
	}

}


