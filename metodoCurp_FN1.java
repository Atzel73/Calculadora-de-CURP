/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class metodoCurp_FN1 {
    public static String getFirstName(String Paterno){
    char arregloPaterno[] = Paterno.toCharArray();
        char FN1 = arregloPaterno[0];
        
        char SL = ' ';
        String Letters ;
        
        for (int i = 1; i < arregloPaterno.length; i++) {
            
            if(arregloPaterno[i] == 'a'){
                
                SL = 'a';
                break;
                
            }else if( arregloPaterno[i] == 'e'){
                
                SL = 'e';
                break;
                
            }else if(arregloPaterno[i] == 'i'){
                
                SL = 'i';
               break;
                
            }else if ( arregloPaterno[i] == 'o'){
                
                SL = 'o';
                break;
                
            } else if ( arregloPaterno[i] == 'u'){
                
                SL = 'u';
               break;
                
            }
            
        }
        
        
        Letters = String.valueOf(FN1) + String.valueOf(SL);

        return  Letters;
        
    }
    
}
