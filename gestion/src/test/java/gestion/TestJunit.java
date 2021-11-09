package gestion;
import gest.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJunit {

	public Groupe g;
	public Encadrant e;
	public Sujet s;
	

	@BeforeEach
	void setUp() throws Exception {
		g = new Groupe(1,"groupe");
		e = new Encadrant("Michel","Ok");
		s = new Sujet(1,"Ttitre","Desc",e);
	}

	@Test
	void test() {
		g.setSujet(s);
		assertEquals(s,g.getSujet());
	}

}
