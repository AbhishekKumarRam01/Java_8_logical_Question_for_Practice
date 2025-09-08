package com.jtc.p1;

import java.util.function.Consumer;

public class ConsumerUse {
public static void main(String[] args) {
	Consumer<String> s=(name)->System.out.println(name);
	s.accept("Abhishek");
	s.accept("Kumar");
	s.accept("IT");
	s.accept("Java ");

}}
