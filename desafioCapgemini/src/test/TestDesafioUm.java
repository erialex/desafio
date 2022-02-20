package test;

import desafio.DesafioUm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import junit.framework.TestCase;

public class TestDesafioUm extends TestCase {

	public void testDesafioUmSuccess() {
		String valor = "6";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);

		DesafioUm.main(args);

	}

	public void testDesafioUmFail() {
		String valor = "xpto";
		String[] args = { "" };

		InputStream in = new ByteArrayInputStream(valor.getBytes());
		System.setIn(in);

		DesafioUm.main(args);

	}

}
