package com.app.tools;

public class CalendarTool
{
	public String getJourSemaine(int numero)
	{
		String[] weekDays = new String[] {"Dim", "Lun", "Mar", "Mer", "Jeu", "Ven", "Sam"};
		return weekDays[numero];
	}
	
	public int traductJourNegatif(int numero)
	{
		int joursem = numero;
		if (numero < 0)
		{
			switch (numero)
			{
			  case -1:
				joursem = 6;
				break;  
			  case -2:
				joursem = 5;
				break;  
			  case -3:
				joursem = 4;
				break;  
			  case -4:
				joursem = 3;
				break;  
			  case -5:
				joursem = 2;
				break;  
			  case -6:
				joursem = 1;
				break;       
			  default:
			    joursem = 0;             
			}
		}
		return joursem;
	}
}
