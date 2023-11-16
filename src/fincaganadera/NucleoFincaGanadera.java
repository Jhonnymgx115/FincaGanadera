
package fincaganadera;


public class NucleoFincaGanadera {
    static String Potreros[][];
    static String PotrerosAux [][];
    static String Razas [] = new String [5];
    static String Animales[];
    static int N_animales = 20;
    
    public static void main(String[] args) {
        try {
            Potreros = new String [20][8];
            
            
            Animales = new String [N_animales];
            
            Razas [0] = "Holstein";
            Razas [1] = "Jersey";
            Razas [2] = "Angus";
            Razas [3] = "Swiss";
            Razas [4] = "Hereford";
            
            for(int i = 0; i<Potreros.length;i++){
                for(int j = 0; j<Potreros[i].length;j++){
                    System.out.print(Potreros[i][j] + "|");
                }
                System.out.println("");
            }
            generarAnimales(Razas,N_animales);
            for(int i = 0; i<Potreros.length;i++){{
                   for(int j = 0; j<Potreros[i].length;j++){
                       System.out.print(Potreros[i][j] + "|");
                   
                   }
                   System.out.println("");
       
               }}
            
            
            FincaGanadera InterfazPrincipal = new FincaGanadera();
            InterfazPrincipal.setVisible(true);
        } catch (Exception Error) {
            System.out.println("Error: main " + Error);
        }
        
    }
        public static void generarAnimales(String [] Raza, int N_vacas){
        try {
           int Raza_al;
           int Id_al;
           String animal = "";
           String mensaje = "";
           int contador = 0;
           for(int i = 0; i<Animales.length;i++){
               
               Id_al = (int)(Math.random()*(9999-1000+1)+1000);
               Raza_al = (int)(Math.random()*(4-0+1)+0);
               animal = Razas[Raza_al] + "|" + Id_al;
               Animales[i]= animal;
               
           }
           for(int i = 0; i<Potreros.length;i++){{
                   for(int j = 0; j<Potreros[i].length;j++){
                       if(contador==Animales.length){break;}
                       Potreros[i][j]=Animales[contador];
                       contador++;
                       
                   
                   }
       
               }
                   
               }
           
           
           
            
        } catch (Exception Error) {
            System.out.println("Error  funcion " + Error);
        }
    }

    
}
