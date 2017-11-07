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
    
}
public MiddleSquare(long seed){
    this.seed = seed;
}

@Override
public double next(){
               public double next(){
    int seed2=seed;
    while (seed2!=0){
    seed2=seed2/10;
    int cifre++;

    }

    int primele=pow(10,(cifre/2));
    int ultimele=pow(10,(cifre));
   
    for (i=1; i<=n; i++)
        {
        int square = seed*seed;
        nr = square / primele % ultimele;
        if (nr == seed){
        nr = nr+1;
        }
        seed=nr;
        System.out.println (seed);
	}
return (double) seed;
}
	}
