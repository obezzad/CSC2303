/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author fatimahejazi
 */
public class WrongPasswordException extends Exception{
    
    private int passAttempt, maxAttempts;
    
    public WrongPasswordException(int passAttempt, int maxAttempts){
        super("The password you entered is invalid, "+(maxAttempts-passAttempt)+" attempts remaining.");
        this.passAttempt = passAttempt;
        this.maxAttempts = maxAttempts;
    }
    
    public int getRemainingAttempts(){
        return (this.maxAttempts-this.passAttempt);
    }
    
}
