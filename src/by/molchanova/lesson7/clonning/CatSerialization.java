package by.molchanova.lesson7.clonning;

import java.io.*;

public class CatSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cat vaska = new Cat("Vaska", "Gray", 4);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream ous = new ObjectOutputStream(baos);
		ous.writeObject(vaska);
		ous.close();

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);

		Cat cloneVaska = (Cat) ois.readObject();
		System.out.println(vaska);
		System.out.println(cloneVaska);
		
		System.out.println("*********************************************");
//		cloneVaska.setColor("White");
//		cloneVaska.setName("ExperimentalVaska");
		
		System.out.println(vaska);
		System.out.println(cloneVaska);

	}
}
