package main;

import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;
	public int hours;

	public int getProjectCompleteANumberOfHours() {
		// TODO - implement Project.getProjectCompleteANumberOfHours
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}
}