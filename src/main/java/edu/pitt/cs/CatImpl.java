package edu.pitt.cs;

public class CatImpl implements Cat {
	int i = 0;
	String n = "";
	boolean rented = false;

	public CatImpl(int id, String name) {
		i = id;
		n = name;
		System.out.println(id + " " + name);
		// TODO: Fill in
	}

	public void rentCat() {
		rented = true;
	}

	public void returnCat() {
		rented = false;
	}

	public void renameCat(String name) {
		n = name;
	}

	public String getName() {
		return n;
	}

	public int getId() {
		return i;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		String result= "ID ";
		result = result + getId() + ". " + getName();
		return result;
	}

}