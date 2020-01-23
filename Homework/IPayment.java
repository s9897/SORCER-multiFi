package Homework;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

public interface IPayment {

    public Context paymentWithCard(Context context) throws  RemoteException, ContextException;
    
    public Context paymentWithCash(Context context) throws  RemoteException, ContextException;

    public Context paymentWithPhone(Context context) throws  RemoteException, ContextException;
}