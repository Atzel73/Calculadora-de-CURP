/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
class ConsonantesPaternas_Curp {

    static String getConsonantesPA(String ConPaterno) {
      char arregloConsonantesP[] = ConPaterno.toCharArray();
        char FC = ' ';
        char SL = ' ';
        String Letters7;

        for (int i = 1; i < arregloConsonantesP.length; i++) {

            if (arregloConsonantesP[i] == 'b' && arregloConsonantesP[i] == 'b') {

                FC = 'B';
                SL = 'B';
            } else if (arregloConsonantesP[i] == 'c' && arregloConsonantesP[i] == 'c') {

                FC = 'C';
                SL = 'C';
            } else if (arregloConsonantesP[i] == 'd' && arregloConsonantesP[i] == 'd') {

                FC = 'D';
                SL = 'D';
            } else if (arregloConsonantesP[i] == 'f' && arregloConsonantesP[i] == 'f') {

                FC = 'F';
                SL = 'F';
            }else if (arregloConsonantesP[i] == 'g' && arregloConsonantesP[i] == 'g'){

              FC = 'G';
              SL = 'G';
          }else if (arregloConsonantesP[i] == 'h' && arregloConsonantesP[i] == 'h'){
                  
              FC = 'H';
              SL = 'H';
          } else if (arregloConsonantesP[i] == 'j' && arregloConsonantesP[i] == 'j'){
                  
              FC = 'J';
              SL = 'J';
          } else if (arregloConsonantesP[i] == 'k' && arregloConsonantesP[i] == 'k'){
                  
              FC = 'K';
              SL = 'K';
          } else if (arregloConsonantesP[i] == 'l' && arregloConsonantesP[i] == 'l'){
                  
              FC = 'L';
              SL = 'L';
          } else if (arregloConsonantesP[i] == 'm' && arregloConsonantesP[i] == 'm'){
                  
              FC = 'M';
              SL = 'M';
          } else if (arregloConsonantesP[i] == 'n' && arregloConsonantesP[i] == 'n'){
                  
              FC = 'N';
              SL = 'N';
          } else if (arregloConsonantesP[i] == 'ñ' && arregloConsonantesP[i] == 'ñ'){
                  
              FC = 'X';
              SL = 'X';
          } else if (arregloConsonantesP[i] == 'p' && arregloConsonantesP[i] == 'p'){
                  
              FC = 'P';
              SL = 'P';
          } else if (arregloConsonantesP[i] == 'q' && arregloConsonantesP[i] == 'q'){
                  
              FC = 'Q';
              SL = 'Q';
          } else if (arregloConsonantesP[i] == 'r' && arregloConsonantesP[i] == 'r'){
                  
              FC = 'R';
              SL = 'R';
          } else if (arregloConsonantesP[i] == 's' && arregloConsonantesP[i] == 's'){
                  
              FC = 'S';
              SL = 'S';
          } else if (arregloConsonantesP[i] == 'h' && arregloConsonantesP[i] == 't'){
                  
              FC = 'T';
              SL = 'T';
          } else if (arregloConsonantesP[i] == 'v' && arregloConsonantesP[i] == 'v'){
                  
              FC = 'V';
              SL = 'V';
          } else if (arregloConsonantesP[i] == 'w' && arregloConsonantesP[i] == 'w'){
                  
              FC = 'W';
              SL = 'W';
          } else if (arregloConsonantesP[i] == 'x' && arregloConsonantesP[i] == 'x'){
                  
              FC = 'X';
              SL = 'X';
          } else if (arregloConsonantesP[i] == 'y' && arregloConsonantesP[i] == 'y'){
                  
              FC = 'Y';
              SL = 'Y';
          } else if (arregloConsonantesP[i] == 'z' && arregloConsonantesP[i] == 'z'){
                  
              FC = 'Z';
              SL = 'Z';
          }
        }
        Letters7 = String.valueOf(FC) + String.valueOf(SL);
        return Letters7;
    }
    
}
