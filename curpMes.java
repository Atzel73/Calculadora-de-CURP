/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
class curpMes {
      public static String getMonth(String mes){
        
        String Mes = mes;
        String Letters9;
        int SM = 0;
        
        
        if(Mes == "enero"){
            SM = 01;
        }else if(Mes == "febrero"){
            SM = 02;
        }else if(Mes == "marzo"){
            SM = 03;
        }else if(Mes == "abril"){
            SM = 04;
        }else if(Mes == "mayo"){
            SM = 05;
        }else if(Mes == "junio"){
            SM = 06;
        }else if(Mes == "julio"){
            SM = 07;
        }else if(Mes == "agosto"){
            SM = 8;
        }else if(Mes == "septiembte"){
            SM = 9;
        }else if(Mes == "octubre"){
            SM = 10;
        }else if(Mes == "noviembre"){
            SM = 11;
        }else if(Mes == "diciembre"){
            SM = 12;
        }
        return Letters9 = String.valueOf(SM);
    }
    
}
