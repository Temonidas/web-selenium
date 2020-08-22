package com.javabasic;

public class Tickets {

	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	/*********************************************************************************Constructor**************************/
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal * (.85);
		precioEstudiante = precioNormal * (.50);
		costo = "Precio normal";
		edad =edadPersona; 
		estudiante = credencialEstudiante;
	}
	
	/****************************************************************************METHODS**************************/
	public void costoDia () {
		System.out.println("El costo Ticket: " + costo);
		
	}
	
	public void precioAdulto () {
		System.out.println("Ticket Adulto: $" + precioAdulto);
		
	}
	
	public void precioNino () {
		System.out.println("Ticket Nino: $" + precioNino);
	
	}
	
	public void precioEstudiante() {
		System.out.println("Ticket Estudiante: $" + precioEstudiante);
	}
	
	public void verificarCostoTicket () {
		if (estudiante==true) {
			System.out.println("Eres un estudiante el precio de tu ticket es: $"+ precioEstudiante);
		}else if (edad<18) {
			System.out.println("Eres un adulto el precio de tu ticket es: $ "+ precioAdulto);
			
		}else {
			System.out.println("Eres un NINO el precio de tu ticket es: $"+ precioNino);
		}
	}
	
	/**********************************sobrecarga***************************************************************/
	
	public double sumarTicket() {
		double suma =precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
		
	}
	
	public double sumarTicket(int descuento) {
		double suma =(precioAdulto + precioNino)- descuento;
		System.out.println(suma);
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tickets tickets = new Tickets (100,19,true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTicket();
		
		
	}

}
