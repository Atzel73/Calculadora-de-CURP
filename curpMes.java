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
        String SM = " ";
        
        
        if(Mes.equals("enero")){
            SM = "01";
            
        }else if(Mes.equals("febrero")){
            SM = "02";
        }else if(Mes.equals("marzo")){
            SM = "03";
        }else if(Mes.equals("abril")){
            SM = "04";
        }else if(Mes.equals("mayo")){
            SM = "05";
        }else if(Mes.equals("junio")){
            SM = "06";
        }else if(Mes.equals("julio")){
            SM = "07";
        }else if(Mes.equals("agosto")){
            SM = "08";
        }else if(Mes.equals("septiembte")){
            SM = "09";
        }else if(Mes.equals("octubre")){
            SM = "10";
        }else if(Mes.equals("noviembre")){
            SM = "11";
        }else if(Mes.equals("diciembre")){
            SM = "12";
        }
        return Letters9 = SM;
    }
    
}
