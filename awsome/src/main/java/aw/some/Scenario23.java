package aw.some;

import java.util.Comparator;
import java.util.Date;

/**
* Scenario23
* Immuatble Data Type to ecapsulate a commercial 
* Transaction 
*
*
*/
public class Scenario23 implements Comparable<Scenario23> {
 
	private final String who;
	private final Date when;
	private final Double amount;

	/***
	* Initialize a new trasaction from the given argument
	* 
	* @param who
	* @param when
	* @param amount
	* @throws IllegalArgumentException
	*/
	public Scenario23(String who,Date when,double amount){
		if (Double.isNaN(amount) || Double.isInfinite(amount)) {
			throw new IllegalArgumentException("Amount Can't be NaN or infinite");
		}
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Scenario23(String trasaction) {
		String[] a = trasaction.split("\\s+");
		who = a[0];
		when = new Date(a[1]);
		amount = Double.parseDouble(a[2]);
		if (Double.isNaN(amount) || Double.isInfinite(amount)) {
			throw new IllegalArgumentException("Amount cannot be Nan or infinite");
		}
	}

	public String who(){
		return who;
	}
	
	public Date when(){return when;}

	public double amount() { return amount; }
	
	@Override
	public int compareTo(Scenario23 that) {
		return Double.compare(this.amount(),that.amount());

	}
	
	@Override
	public boolean equals(Object other){
		if (other == this) {
			return true;	
		}if (other == null) {
		return false;	
		}
		if (other.getClass() != this.getClass()) {
			return false;	
		}
		Scenario23 that = (Scenario23) other;
		return (this.amount == that.amount) && (this.who.equals(that.who)) && (this.when.equals(that.when));

	}

	public int hashCode(){
		int hash = 1;
		hash = hash * 31 + who.hashCode();
		hash = hash * 31 + when.hashCode();
		hash = hash * 31 + ((Double)amount).hashCode();
		return hash;
	}

	public static class WhoOrder implements Comparator<Scenario23> {
		
		@Override
		public int compare(Scenario23 u,Scenario23 w) {
			return u.who.compareTo(w.who);
		}	
	}
	
	public static class WhenOrder implements Comparator<Scenario23> {
		
		@Override
		public int compare(Scenario23 u,Scenario23 w) {
			return u.when.compareTo(w.when);
		}	
	}

	public static class HowMuch implements Comparator<Scenario23> {
		
		@Override
		public int compare(Scenario23 u,Scenario23 w) {
			return u.amount.compareTo(w.amount);
		}	
	}


	@Override
	public String toString(){
		return String.format("%-10s %10s %8.2f", who,when,amount);
	}
	

}
