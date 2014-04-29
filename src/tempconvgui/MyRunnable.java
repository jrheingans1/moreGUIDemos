/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvgui;

/**
 *
 * @author Instlogin
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(long l=0; l < 1000000000000L; l++) {
            System.out.println("Long running iteration #" + l);
        }
    }
    
}
