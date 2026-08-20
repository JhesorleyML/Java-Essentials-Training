/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

/**
 *
 * @author jheso
 */
public class KeypadPhone extends Phone{
    String ringtone;

    @Override
    public void sendMessage(String receiver, String msg) {
        System.out.println("Receiver: " + receiver);
        System.out.println("Message:");
        System.out.println(msg);
    }

    @Override
    public void call(String receiver) {
        System.out.println("Calling " + receiver);
    }
    
    public void playRingtone(){
        System.out.println("Toot toot toot");
    }
    
    public void receivedMessage(String sender, String msg){
        playRingtone();
        System.out.println("Sender: ");
        System.out.println("Message");
        System.out.println(msg);
    }
    
    @Override
    public void charging(){
        battery += 5;
    }
    
    
}
