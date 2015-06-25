package it.unica.pr2.progetto2015.g47022_65046_65063;

public class Semplice implements it.unica.pr2.progetto2015.interfacce.SheetFunction 
{
	public Object execute(Object... args) 
	{
		Double val = (Double) args[0];
		return Math.toDegrees(val.doubleValue());
	}

	public final String getCategory() 
	{
		return "Matematica";
	}

	public final String getHelp() 
	{
		return "Converte i radianti in gradi.";
	} 
       
	public final String getName() 
	{
		return "GRADI";
	}
}
