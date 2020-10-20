/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celcius;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class CELCIUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    float celcius = 0, reamur = 0, fahrenheit = 0, kelvin = 0, hasil;
   
    
    String[]namaSuhu = {"Celcius", "Reamur", "Fahrenheit", "kelvin"};
    
    for(int i=0; i<namaSuhu.length; i++){
        System.out.println(i+". "+ namaSuhu[i]);
    }
    
    //scanner
    System.out.println("");
    System.out.print("Masukan nomer suhu : " );
    Scanner masukan = new Scanner(System.in);
    int pilih1 = masukan.nextInt();
    
    System.out.println("");
     
    System.out.println(namaSuhu[pilih1]);
   
    
    if(namaSuhu[pilih1].equalsIgnoreCase("celcius")){
        System.out.print("Masukan nilai sushu (Celcius) : ");
    celcius = masukan.nextFloat();
    
    }else if(namaSuhu[pilih1].equalsIgnoreCase("reamur")){
        System.out.print("Masukan nilai sushu (reamur) : ");
    reamur = masukan.nextFloat();
    
    }else if(namaSuhu[pilih1].equalsIgnoreCase("fahrenheit")){
        System.out.print("Masukan nilai sushu (fahrenheit) : ");
    fahrenheit = masukan.nextFloat();
    
    }else if(namaSuhu[pilih1].equalsIgnoreCase("kelvin")){
        System.out.print("Masukan nilai sushu (kelvin) : ");
    kelvin = masukan.nextFloat();
    }    
   System.out.println("");
   System.out.println("================================================================");

    //Scanner
     for(int i=0; i<namaSuhu.length; i++){
        System.out.println(i+". "+ namaSuhu[i]);
    }
    System.out.println(""); 
    System.out.print("jadikan ke nomer suhu : " );
    int pilih2 = masukan.nextInt();
    System.out.println(namaSuhu[pilih2]);
    
    
    //output
    
     if(namaSuhu[pilih2].equalsIgnoreCase("celcius")){
        
        if(namaSuhu[pilih1].equalsIgnoreCase("reamur")){
            hasil =  5/4f* reamur  ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("fahrenheit")){
            hasil =  5/9f* (fahrenheit - 32) ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("kelvin")){
            hasil =  kelvin - 273 ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
        }
               
            
    }else if(namaSuhu[pilih2].equalsIgnoreCase("reamur")){
        
        if(namaSuhu[pilih1].equalsIgnoreCase("celcius")){
            hasil =  4/5f* celcius  ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("fahrenheit")){
            hasil =  4/9f* (fahrenheit - 32) ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("kelvin")){
            hasil = 4/5f * (kelvin - 273) ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
        }
        
        
    }else if(namaSuhu[pilih2].equalsIgnoreCase("fahrenheit")){
        
        if(namaSuhu[pilih1].equalsIgnoreCase("celcius")){
            hasil =  9/5f* celcius + 32  ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("reamur")){
            hasil =  9/4f* reamur + 32 ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("kelvin")){
            hasil = 9/5f * (kelvin - 273) + 32 ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
        }
        
        
    }else if(namaSuhu[pilih2].equalsIgnoreCase("kelvin")){
        
        if(namaSuhu[pilih1].equalsIgnoreCase("celcius")){
            hasil = celcius + 273  ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("reamur")){
            hasil =  5/4f* reamur + 273 ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
            
        }else if(namaSuhu[pilih1].equalsIgnoreCase("fahrenheit")){
            hasil = 5/9f * (fahrenheit - 32 ) + 273 ;
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("hasilnya : "+hasil);
        }
    }

}
}

    

