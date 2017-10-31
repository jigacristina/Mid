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
public class MiddleSquare implements Generator {
    private long seed;
    private int lseed;
    
}
public MiddleSquare(long seed){
    this.seed = seed;
    this.lseed = String.valueOf(seed).length();
}

@Override
public double next(){
                int square = seed*seed;
		
		System.out.println (square);
		
		String squareString = Integer.toString(square);
		
		while(squareString.length() < lengthSeed*2)
		{
			squareString = 0 + squareString;
		}
		
		int n = (int) Math.pow(10, lengthSeed / 2);
		int m = (int)Math.pow(10, lengthSeed);
		
		square =  square /n % m;
		
		if(square == seed)
		{
			square = square+1;    
		}
		
		seed = square;
		System.out.println (seed);
		return seed/Math.pow(10,lengthSeed);
	}
