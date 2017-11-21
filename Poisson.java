/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;
public class Poisson {
	private final int n;

    /**
     *
     * @param n
     */
    public Poisson(int n){
		this.n = n;
	}
	
	public double next(double lambda) {
		  double L = Math.exp(-lambda);
		  double p = 1.0;
		  int k = 0;
		  DefaultGenerator u = new DefaultGenerator();

		  do  {
		    k++;
		    p *= u.next();
		  } while (p > L && k < n);

		  return (float)(k-1)/n ;
	}


}
