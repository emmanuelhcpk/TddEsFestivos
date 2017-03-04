package udea;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class TestCalendarioFestivo {

	@Test
	public void testCalendarioFestivo() {
		CalendarioFestivos calendar = new CalendarioFestivos();
		LocalDate date = LocalDate.of(2017,Month.MARCH,3);
		boolean festivo = calendar.esFestivo(date);
		assertFalse(festivo);
	}
	@Test
	public void testDomigoFestivo() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.MARCH,5);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

	@Test
	public void testSabadoFestivo() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.MARCH,4);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

	@Test
	public void test25Diciembre() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.DECEMBER,25);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

	@Test
	public void test1Enero() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.JANUARY,1);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

	@Test
	public void test7Agosto() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.AUGUST,7);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

	@Test
	public void test1Mayo() {
		CalendarioFestivos calendar = new CalendarioFestivos(); 
		LocalDate date = LocalDate.of(2017,Month.MAY,1);  
		boolean festivo = calendar.esFestivo(date);
		assertTrue(festivo);
	}

}