/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluationtool;

import java.io.BufferedReader;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author
 */
//Server
public interface EvalInterface extends Remote{
    public ArrayList<String> fetchInstructors() throws RemoteException;
    public String fetchQuestions(int n) throws RemoteException;
    public ArrayList<String> fetchChoices() throws RemoteException;
    public void record(String name, ArrayList<Integer> scores) throws RemoteException;
    public ArrayList<String> fetchRecord(String name) throws RemoteException;
    public void addInstructor(String fullName) throws RemoteException;
    public void removeInstructor(String fullName,int pos) throws RemoteException;
    
}
