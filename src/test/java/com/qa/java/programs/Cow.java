package com.qa.java.programs;
public class Cow {
int speed = 5;

public Cow() {
}

public Cow(Cow c) {
}
public Cow(int weight, Cow p) {
 this();
}
public void run(int speed){
this.speed = speed;
walk(this);
}
public Cow walk( Cow w){
return this;
}
public void eat(){
new Cow(this);
}

public static void main(String[] args) {
	
	
	Cow cow = new Cow();
	
}
}
