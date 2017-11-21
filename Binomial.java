/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;
import java.util.Random;

/**
 *
 * @author Jiga
 */


public class Binomial implements Generator{
	
	private final int n;
	private final float p;
	
	public Binomial(int n, float p)
	{
		this.n = n;
		this.p = p;
	}

        @Override
	public double next() 
	{
		DefaultGenerator u = new DefaultGenerator();
		  int x = 0;
		  for(int i = 0; i < n; i++) {
			if(u.next() < p)
		      x++;
		  }
		  
		  return (float)x/n;
	}
	
}