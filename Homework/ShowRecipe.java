package Homework;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;


public interface ShowRecipe{

   	
	public Context showIngridients(Context context) throws ContextException, NoRecipeException;
	
	public Context showCaloricValue(Context context) throws ContextException, NoRecipeException;
	
	public Context showNutritionalValue(Context context)throws ContextException, NoRecipeException;
	
	
}