package aw.some;


/************************************************************************
 * Implementation of Eucladian Vector 
 * This class is implementated to be immutable
 * Once the user init the Vector it cannot change its value 
 * either directly or indirectly
 * Immutable is a very desirable feature of a data type
 * 
 * % java Vector
 *  x = [ 1.0 2.0 3.0 4.0 5.0 ]
 *  y = [ 5.0 2.0 4.0 1.0 ]
 *  z = [ 6.0 4.0 7.0 5.0 ]
 *  10z = [ 60.0 40.0 70.0 50.0 ]
 *  |x| = 5.477225575
 *  <x,y> = 25.0
 *
 * *********************************************************************/
/**
* 
*/
public class Scenario20 {

	private int d; // dimmension of Vector
	private double[] data; // array of vector's component

	/**
	* Init a d-dimmension zero vector
	* */
	public Scenario20(int d) {
		this.d = d;
		data = new double[d];
	}

	/**
	* Initialize a vector from either an array of a varang list
	*
	* @param a the array or varang list
	*
	* */
	public Scenario20(double... a) {
		d = a.length;
		data = new double[d];
		for (int i = 0; i < a.length; i++) {
			data[i] = a[i];	
		}
	}

	/**
	* Returns the dimmension of this vector
	*
	* @return the dimmension of this vector
	* */
	public int dimmension() {
		return this.d;
	}
	
	/**
	* Returns the dot product of this vector with the specified vector
	*
	* */
	public double dot(Scenario20 that) {
		if (this.d != that.d) {
			throw new IllegalArgumentException("Dimmension don't agree");
		}
		double sum = 0.0;
		for (int i = 0; i < d; i++) {
			sum = sum + (this.data[i] * that.data[i]);
		}
		return sum;
	}


	/**
	* Returns the magnitude of this vector
	* This is also known as the 
	*
	* */
	public double magnitude() {
		return Math.sqrt(this.dot(this));
	}
	
	/**
	* Return the euclidan distance between this vector and specified vector
	* 
	* @param that {@link Scenario20}
	* */
	public double distanceTo(Scenario20 that) {
		if (this.d != that.d) {
			throw new IllegalArgumentException("Dimmension don't agree");
		}
		return this.minus(that).magnitude();
	}

	/**
	*  Return the sum of this vector and the specified vector
	*   
	* */
	public Scenario20 plus(Scenario20 that) {
		if(this.d != that.d) {
			throw new IllegalArgumentException("Dimmensions don't agree");
		}
		Scenario20 scenario20 = new Scenario20(d);
		for (int i = 0; i < d; i++) {
			scenario20.data[i] = this.data[i] + that.data[i];
		}
		return scenario20;
	}

	/**
	* Return the diffrence between this vector and the specified vector
	* @param that vector to subtract from this vector
	* @return the vector whose value is {@code (this - that)}
	* @throws IllegalArgumentException if the dimmensions are not equal
	* */
	public Scenario20 minus(Scenario20 that) {
		if (this.d != that.d) {
			throw new IllegalArgumentException("Dimmensions don't agree");
		}
		Scenario20 scenario20 = new Scenario20(this.d);
		for (int i = 0; i < d; i++) {
			scenario20.data[i] = this.data[i] - that.data[i];
		}
		return scenario20;
	}
	
	/**
	* Return the ith cartesian coordinate
	*
	* @param i the coordinate index
	* @return  the ith cordinate 
	* */
	public double cartesian(int i) {
		return data[i];
	}

	/**
	* Returns the scaler-vector product of this vector and the specified
	* scaler
	* @param alpha the scaler
	* @return the vector whose value is {@code (alpha * this)}
	* */
	public Scenario20 scale(double alpha) {
		Scenario20 scenario20 = new Scenario20(data);
		for (int i = 0; i < d; i++) {
			scenario20.data[i] = alpha * data[i];
		}
		return scenario20;
	}	
	
	/**
	* Returns a unit vector in the direction of this vector
	* @return a unit vector in the direction of this vector
	* @throws ArithmeticException
	* */
	public Scenario20 direction() {
		if (this.magnitude() == 0.0 ) {
			throw new ArithmeticException("Zero-vector has no direction");
		}
		return this.scale(1.0/this.magnitude());
	}

	/**
	* Returns a string representation of this vector.
	*  @return a string representation of this vector, which consists of the 
	*  the vector enteries, separates by single spaces
	* */
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < d; i++) {
			s.append(data[i] + " ");
		}
		return s.toString();
	}
}
