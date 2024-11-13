package edu.pitt.cs;

import org.mockito.Mockito;
import static org.mockito.Mockito.*; 
///i am adding xtra comments to see if i commit again if itll work

public interface Cat {
	public static Cat createInstance(InstanceType type, int id, String name) {
		switch (type) {
			case IMPL:
				return new CatImpl(id, name);
			case BUGGY:
				return new CatBuggy(id, name);
			case SOLUTION:
				return new CatSolution(id, name);
			case MOCK:
				Cat cat = Mockito.mock(Cat.class);
				//mock implementations
				String n ="garfield";
				Mockito.when(cat.getId()).thenReturn(id);
				Mockito.when(cat.getName()).thenReturn(name);
				Mockito.when(cat.toString()).thenReturn("ID " + id + ". " + name);
				//need to add a method where mockito 
				//Mockito.when(cat.rentCat()).thenReturn(name + "has been rented.");
				
				return cat;
			default:
				assert(false);
				return null;
		}
	}//hello!

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.
	
	public void rentCat();

	public void returnCat();

	public void renameCat(String name);

	public String getName();

	public int getId();

	public boolean getRented();

	public String toString();
}
