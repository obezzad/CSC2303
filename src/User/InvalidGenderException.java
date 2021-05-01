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
public class InvalidGenderException extends Exception {
    
    public InvalidGenderException(String g){
        super(" The gender " + g + " is not valid!");
    }
    
    public String[] getValidGenders(){
        Gender g[] = Gender.values();
        String[] genders = new String[g.length];
        for(int i = 0; i < g.length; i++)
            genders[i] = g[i].name();
            
       return genders;
    }
    
    
}
