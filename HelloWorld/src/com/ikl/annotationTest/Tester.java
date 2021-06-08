package com.ikl.annotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Tester {
	public static void main(String args[]) {
		Class person = Person.class;
		Field[] fi = person.getFields();
		for (Field f : fi) {
			Annotation[] as = f.getAnnotations();
			if (f.isAnnotationPresent(Personal.class)) {
			}
		}
		
	}
}
