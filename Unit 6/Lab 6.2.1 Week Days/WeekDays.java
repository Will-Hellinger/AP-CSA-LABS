public class WeekDays
{
	public static void main(String [] args)
	{
		String [] daysEnglish = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String [] daysSpanish = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    String [] daysGerman = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
		for(int x=0;x<daysEnglish.length;x++)
			System.out.print(daysEnglish[x]+" ");
		System.out.println();

		for(int x=0;x<daysSpanish.length;x++)
			System.out.print(daysSpanish[x]+" ");
		System.out.println();

		for(int x=0;x<daysGerman.length;x++)
			System.out.print(daysGerman[x]+" ");
    System.out.println();
	}
}
