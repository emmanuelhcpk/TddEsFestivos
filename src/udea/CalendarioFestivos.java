package udea;

import java.time.LocalDate;

public class CalendarioFestivos {
	public boolean esFestivo(LocalDate date){
		if(date.getDayOfWeek().getValue() == 7 || date.getDayOfWeek().getValue() == 6 || (date.getMonthValue()==1 && date.getDayOfMonth() == 1)|| (date.getMonthValue()==12 && date.getDayOfMonth() == 25) || (date.getMonthValue()==8 && date.getDayOfMonth() == 7)|| (date.getMonthValue() == 5 && date.getDayOfMonth() == 1)){
			return true;
		}
		return false;
	}
}
