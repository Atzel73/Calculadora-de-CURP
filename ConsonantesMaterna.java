/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class ConsonantesMaterna {
    static String getConsonantesMa(String Con_materno) {
      char arregloConsonanteM[] = Con_materno.toCharArray();
        char FC = ' ';
        char SL = ' ';
        String Letters7;

        for (int i = 0; i < arregloConsonanteM.length; i++) {

            if (arregloConsonanteM[i] == 'b' ) {

                FC = 'B';
                
            } else if (arregloConsonanteM[i] == 'c' ) {

                FC = 'C';
                
            } else if (arregloConsonanteM[i] == 'd' ) {

                FC = 'D';
                
            } else if (arregloConsonanteM[i] == 'f') {

                FC = 'F';
               
            }else if (arregloConsonanteM[i] == 'g'){

              FC = 'G';
             
          }else if (arregloConsonanteM[i] == 'h'){
                  
              FC = 'H';
              
          } else if (arregloConsonanteM[i] == 'j'){
                  
              FC = 'J';
              
          } else if (arregloConsonanteM[i] == 'k'){
                  
              FC = 'K';
           
          } else if (arregloConsonanteM[i] == 'l' ){
                  
              FC = 'L';
              
          } else if (arregloConsonanteM[i] == 'm' ){
                  
              FC = 'M';
              
          } else if (arregloConsonanteM[i] == 'n' ){
                  
              FC = 'N';
              
          } else if (arregloConsonanteM[i] == 'ñ' ){
                  
              FC = 'X';
            
          } else if (arregloConsonanteM[i] == 'p' ){
                  
              FC = 'P';
              
          } else if (arregloConsonanteM[i] == 'q'){
                  
              FC = 'Q';
              
          } else if (arregloConsonanteM[i] == 'r'){
                  
              FC = 'R';
              
          } else if (arregloConsonanteM[i] == 's'){
                  
              FC = 'S';
             
          } else if (arregloConsonanteM[i] == 'h'){
                  
              FC = 'T';
              
          } else if (arregloConsonanteM[i] == 'v'){
                  
              FC = 'V';
              
          } else if (arregloConsonanteM[i] == 'w'){
                  
              FC = 'W';
              
          } else if (arregloConsonanteM[i] == 'x'){
                  
              FC = 'X';
         
          } else if (arregloConsonanteM[i] == 'y'){
                  
              FC = 'Y';
              
          } else if (arregloConsonanteM[i] == 'z'){
                  
              FC = 'Z';
              
          }
        }
        Letters7 = String.valueOf(FC);
        return Letters7;
    }
    
}
