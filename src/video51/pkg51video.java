/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video51;
/**
 *
 * @author JOSE JAVIER
 */
public class pkg51video {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    public class pkg51video {
   int i,j,temporal;
   public pkg51video (){
       this.i=0;
       this.j=0;
      this.temporal=0;
   }
   //metodo burbuja
   public void burbuja(int [] arreglo){
       for(i=0;i<arreglo.length;i++){
       for(j=i+1;j<arreglo.length;j++){
           if(arreglo[i]>arreglo[j]){
               temporal=arreglo[i]);
                arreglo[i]=arreglo[j]);
               arreglo[]=[j]temporal;
               
           }
           
       }
   }
   }       
               
     //meotodo burbuja version 2
   public void burbuja2(int [] arreglo){
      for(i=0;i<arreglo.length;i++){              
        for(j=i+1;j<arreglo.length-1;j++){      
        if(arreglo[j]>arreglo[j+1]){
            temporal=arreglo[j]);
            arreglo[j]=arreglo[j+1]);
               arreglo[]=[j+1]temporal;
               
        }
   }
}
   }
   //Mostrar los datos del vector 
   public void mostrarArreglo()(int [] arreglo){
    int k;
    for(k=0;k<arreglo.length;k++){
        System.out.println("["+arreglo[k]+"]");
        
    }
    System.out.println();
    
}
}

    }
    
}
