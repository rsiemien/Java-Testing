package com.rsiemien.hello;

public class Main {

	private static Primitive[] primitives = new Primitive[8];
	public static void main(String[] args) {
		initPrimitives();
		for(Primitive p : primitives){
			p.print();
		}
	}
	private static void initPrimitives(){
		primitives[0] = new Primitive("byte", 8, "-127", "128");
		primitives[1] = new Primitive("boolean", 1, "false", "true");
		primitives[2] = new Primitive("char", 8, "\u0000", "\uffff");
		primitives[3] = new Primitive("short", 16, "-32,768", "32,767");
		primitives[4] = new Primitive("int", 32, "-2147483648", "2147483647");
		primitives[5] = new Primitive("float", 32, "-complicated", "complicated");
		primitives[6] = new Primitive("long", 64, "9223372036854775808", "9223372036854775807");
		primitives[7] = new Primitive("double", 64, "-complicated", "complicated");
	}
}
