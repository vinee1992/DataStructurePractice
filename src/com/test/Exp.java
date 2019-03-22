package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class a{
	public a()
	{
		System.out.println("a");
	}

}

class b extends a implements Serializable

{
	public b() {
		System.out.println("b");
	}
}
public class Exp  {

public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	//List<Object> l= new ArrayList<String>();
	
	b b1 = new b();
	ObjectOutputStream  o = new ObjectOutputStream(new FileOutputStream("dasd"));
	o.writeObject(b1);
	o.flush();
	
	ObjectInputStream i = new ObjectInputStream(new FileInputStream("dasd"));
   
	b b2= (b)i.readObject();
	

/*	PriorityQueue<Integer> p = new PriorityQueue<>();
	p.offer(2);
	p.offer(new Integer(1));
	p.offer(3);
	
	while(!p.isEmpty()) {
		
		System.out.println(p.poll());
		
	}*/
}	


	
}
