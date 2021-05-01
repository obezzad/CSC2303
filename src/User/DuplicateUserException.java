/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.Random;

/**
 *
 * @author fatimahejazi
 */
public class DuplicateUserException  extends Exception {
    
    private String username;
    
    public DuplicateUserException(String username){
        super(" This username " + username + " already exists! ");
    }    
    
    public String[] suggestUsernames(Account acc){
        
        String[] suggestions = new String[2];
        String name = acc.getProfile().getEmail().substring(0, acc.getProfile().getEmail().indexOf('@')) + new Random().nextInt(50);       
        suggestions[0] = name;
        name = acc.getProfile().getDescription().substring(0, acc.getProfile().getDescription().indexOf(' ')) + new Random().nextInt(50);
        suggestions[1] = name;
        
       return suggestions;
    }
}
