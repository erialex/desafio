package test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import desafio.DesafioDois;
import junit.framework.TestCase;

public class TestDesafioDois extends TestCase {
	
	public void testCenarioFeliz() {
		String valor = "X1b4$@";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
	public void testCenario4caractes() {
		String valor = "X1b@";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
	public void testCenarioDigito() {
		String valor = "xpto##";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
	public void testCenarioMinusculo() {
		String valor = "S2B9FFFFFFF##";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	public void testCenarioMaiusculo() {
		String valor = "s2b9##";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
	public void testCenarioCaracteresEspeciais() {
		String valor = "s2b9FF";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
	public void testCenarioMaisDeSeisCaracteres() {
		String valor = "@#s2b9FF!!!!!";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);
		
		DesafioDois.main(args);
		
	}
	
}
