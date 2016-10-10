/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1psp;

/**
 *
 * @author jpatriciodasilva
 */
public class MiThread extends Thread {

    public MiThread(String name) {
        super(name);
    }

    public void run(){
     int i;   
    for(i=0;i<10;i++){
        try{
            System.out.println(i+""+getName());
            
            Thread.sleep(1000);
            
        }catch (InterruptedException e){
            System.out.println("Fio interrumpido");
            
            return;
        }
    
        
    
    
    }
    
    }
    
    
    
}
