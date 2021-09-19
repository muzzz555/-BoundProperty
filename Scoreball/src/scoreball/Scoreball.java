/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreball;

import java.util.Scanner;
/**
 *
 * @author AN515-43
 */
public class Scoreball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listenerl = new Listener1();
        Listener2 listener2 = new Listener2();
        
        mySource.addPropertyChangeListener(listenerl);
        mySource.addPropertyChangeListener(listener2);
        
        while (true) {
            
                System.out.print("Enter Score ");
                String score = sc.nextLine();
                if (score.equals("")) {
                    break;
                } else {
                    mySource.setscore(score);
                }
        }
    }
}
