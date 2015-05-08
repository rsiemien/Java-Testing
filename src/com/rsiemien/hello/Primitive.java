package com.rsiemien.hello;

public class Primitive {
	private String min, max, name;
	private byte bits;
	protected Primitive(String name, int i, String min, String max){
		this.name = name;
		this.bits = (byte) i;
		this.min = min;
		this.max = max;
	}
	protected void print(){
		System.out.println(name + " :");
		System.out.println("\t Has a size of " + bits + "bits");
		System.out.println("\t Mininum is: " + min);
		System.out.println("\t Maximun is: " + max);
	}
}
