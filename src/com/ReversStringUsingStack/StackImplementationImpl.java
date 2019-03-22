package com.ReversStringUsingStack;

import java.util.Arrays;

public class StackImplementationImpl<T> implements StackImplementationInterf<T> {

	
	private static final int DEFAULT_CAPACITY=10;
	private T[] store;
	private int size=0;
	private int capacity;
	
	
	public  StackImplementationImpl() {
		// TODO Auto-generated constructor stub
		this.capacity=DEFAULT_CAPACITY;
		store=(T[]) new Object[DEFAULT_CAPACITY];
	}
	
	
	public StackImplementationImpl(int capacity) {
		this.capacity=capacity;
		store=(T[]) new Object[capacity];
	}
	
	
	@Override
	public boolean push(T e) {
		// TODO Auto-generated method stub
		
		if(this.size>=store.length) {	
			int newSize=size+(size>>1);
			store=Arrays.copyOf(store, newSize);
		}
		store[size++]=e;
		return true;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(size<=0)
		throw new RuntimeException("Empty Stack");
		
		T v=store[--size];
		store[size]=null;
		
		int reducedSize=size;
		
		if(size>=capacity && size<(reducedSize + (reducedSize << 1))) {
			System.arraycopy(store, 0, store, 0, size);
		}
		
		return v;
	}

	@Override
	public boolean contains(T t) {
		// TODO Auto-generated method stub
		
		boolean found=false;
		for(int i=0;i<size;i++) {
			T ele= store[i];
			if(ele.equals(t)) {
				found =true;
			}
		}
		return found;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	    for (int i = 0; i < size; i++) {
            store[i] = null;
        }
	    size=0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}


	@Override
	public String toString() {
		
		

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(this.pop());

            if (i > 0) {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
		
	}

	
	public static void main(String... args) {
		
		StackImplementationImpl<Integer> s= new StackImplementationImpl<>();
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.size();
		s.pop();
		s.size();
		s.clear();
		s.pop();
		System.out.println("Stack of Integers : " + s);
		
	}
	

}
