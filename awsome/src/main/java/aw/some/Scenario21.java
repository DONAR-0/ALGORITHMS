package aw.some;

import java.sql.Date;

/**
* Scenario21 : Date
* The {@code Date} class is an immutable data type to encapsulate a
* date ( day, month, and year).
* <p>
* For additional Documentation 
*
*/
public class Scenario21 implements Comparable<Scenario21> {

	private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private final int month; 
	private final int day;
	private final int year;

	/**
	* Initialize a new date from the month, day and year.
	* @param month the month(btween 1 and 12)
	* @param day the day (between 1 and 28-31,depending on the month)
	* @param year the year
	* @throws IllegalArgumentException if this date is invalid 
	* */
	public Scenario21(int day,int month,int year) {
		if(!isValid(month,day,year)) {
			throw new IllegalArgumentException("Invalid Date");
		}	
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Scenario21/*Date*/(String date) {
		String[] fields = date.split("/");
		if (fields.length != 3) {
			throw new IllegalArgumentException("Invalid Date");
		}
		month = Integer.parseInt(fields[0]);
		day = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);
		if(!isValid(month, day, year)) throw new IllegalArgumentException("Invalid Date");	
	}

	/***
	* Check if the date provided is valid 
	*
	* @return false
	*/
	private static boolean isValid(int d,int m,int y) {
		if (m < 1 || m > 12) {
			return false;
		}
		if (d < 1 || d > DAYS[m]) {
			return false;
		} 
		if (m == 2 && d == 29 && isLeapYear(y)) {
			return false;
		}
		return true;
	}

	/***
	* Returns true if year is valid
	*
	* @param y year value
	* @return boolean
	*/
	private static boolean isLeapYear(int y){
		if ( y % 400 == 0) return true;
		if ( y % 100 == 0) {
			return false;
		}
		return y % 4 == 0;
	}

	/***
	* Check if next date is correct if yes that return the date and
	* if not it will provide next year
	*
	* @return boolean
	*/
	public Scenario21 next() {
		if (isValid(month, day + 1, year)) {
			return new Scenario21(month,day + 1,year);
		}
		else if( isValid(month + 1, 1, year)) {
			return new Scenario21(month + 1,1,year);
		} else {
			return new Scenario21(1,1,year + 1);
		}
	}
	

	/**
	*
	* */
	public int month() {
		return month;
	}
	
      @Override
	public int compareTo(Scenario21 that){
		if (this.year < that.year) {
			return -1;	
		} if(this.year > that.year) {	
			return +1;
		} if (this.month > that.month) {
			return -1;	
		} if (this.month < that.month) {
			return +1;
		} if (this.day < that.day) {
			return -1;
		} if (this.day > that.day) {
			return +1;
		}
		return 0;
	}

	/***
	* Returns a string representation of this date
	* @return the string representation in the format of MM/DD/YYYY
	* */
	@Override
	public String toString(){
		return month + "/" + day + "/" + year;
	}
	
	@Override
	public boolean equals(Object other){
		if(other == this) return true;
		if (other == null) {
			return false;	
		}
		if (other.getClass() != this.getClass()) {
			return false;	
		}
		Scenario21 that = (Scenario21) other;
		return (this.month == that.month) && (this.day == that.day) && (this.year == that.year);
	}
	
	@Override
	public int hashCode() {
		return day + 31*month + 31*12*year;
	}
}
