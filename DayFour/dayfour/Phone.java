/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

/**
 *
 * @author jheso
 */
public abstract class Phone {
    int battery = 10;
    int volume = 0;
    public abstract void sendMessage(String receiver, String msg);
    public abstract void call(String receiver);
    
    public void charging(){
        battery += 1;
    }
    
    public final void addVolume(){
        volume += 1;
    }
}
