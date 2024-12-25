package main;

public class University {

	public String name;
	public String address;
	public char phone;

	public void toProvideEducation() {
		// TODO - implement University.toProvideEducation
		throw new UnsupportedOperationException();
	}

	public void addEmployee() {
		// TODO - implement University.addEmployee
		throw new UnsupportedOperationException();
	}

	public void setPhone(char phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public char getPhone() {
		return this.phone;
	}

}