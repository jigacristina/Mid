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
public class LCG implements Generator {
	
	private int seed ;
	private final int a;
	private final int c;
	private final int m;
    
    LCG (int seed,int a , int c, int m)
    { 
    	this.seed = seed;
    	this.a = a;
    	this.c = c;
    	this.m = m;
    }

        @Override
	public double next(){
		
        if(c == 0)
        {
        	seed = seed / m;
        }
        else
        {
            seed = (a * seed + c) % m;
        }
        return (double)seed / m;
	}

}
