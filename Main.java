/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

/**
 *
 * @author Jiga
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("MidlleSquare:");
        MiddleSquare md = new MiddleSquare(1234);
        for (int j = 0; j < 20; j++) {
            System.out.println (md.next());
        }
    }
    
}
