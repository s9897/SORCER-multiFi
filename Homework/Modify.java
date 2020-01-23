
package Homework;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

public interface Modify {

   	public Context AddBrownSugar(Context context) throws RemoteException, ContextException; 
	
	
	public Context AddWhiteSugar(Context context ) throws RemoteException, ContextException;
	
	
	public Context CountSugarCubes(Context context) throws RemoteException, ContextException;
	
	
	public Context AddMilk(Context context) throws RemoteException, ContextException;
	
	
	public Context AddMilkCoconut(Context context) throws RemoteException, ContextException; 
	
	
	public Context AddMilkRice(Context context) throws RemoteException, ContextException;
	
	
	public Context AddExtraIngridient(Context context) throws RemoteException, ContextException;
		
}
