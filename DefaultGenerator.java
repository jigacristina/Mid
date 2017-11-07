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
public class DefaultGenerator implements Generator{
	
	private Random rand;
	
	public DefaultGenerator()
	{
		rand = new Random();
	}
	
        @Override
	public double next()
	{
		double min = 0.0f;
                double max = 1.0f;
                double random = rand.nextDouble();
		return random;
	}

}
