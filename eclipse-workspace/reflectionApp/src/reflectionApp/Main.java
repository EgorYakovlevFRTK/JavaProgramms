package reflectionApp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Main {
	
	public static void main(String args[]) {
		EgorPomidor ep = new EgorPomidor ("Egor", 1);
		Class cls = ep.getClass();
		Class cls2 = EgorPomidor.class;
		try {
			EgorPomidor ep2 = (EgorPomidor) cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(cls.getName());
		Constructor[] constructors = cls.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			System.out.println("Constructor: " + constructor.getName());
			Parameter[] params = constructor.getParameters();
			for (Parameter param: params) {
				System.out.println("Parameter (name): " + param.getName());
				System.out.println("Parameter (type): " + param.getType().getName());
			}
		}
		
		System.out.println("");
		System.out.println("Methods:");
		Method [] meths = cls.getDeclaredMethods();
		for (Method meth: meths) {
			System.out.println(meth.getName());
			System.out.println(Modifier.toString(meth.getModifiers()));
			System.out.println(meth.getReturnType().getName());
			Parameter[] params = meth.getParameters();
			System.out.println("");
			System.out.println("Method's parameters");
			for (Parameter param: params) {
				System.out.println(param.getName());
				System.out.println(param.getType().getName());
			}
		}
		
		System.out.println("");
		System.out.println("Fields: ");
		Field [] fields = cls.getDeclaredFields();
 		for (Field field: fields) {
 			System.out.println(field.getName());
 			System.out.println(field.getType().getName());
 			System.out.println(Modifier.toString(field.getModifiers()));
 			System.out.println();
 		}
	}
}

class EgorPomidor {
	String s;
	public static int t;
	
	public EgorPomidor(String s, int t) {
		this.s = s;
	}
	
	public EgorPomidor() {
		
	}
	
	public synchronized String EgorMethod(String s) {
		System.out.println("You enter:" + s);
		return s;
	}
}