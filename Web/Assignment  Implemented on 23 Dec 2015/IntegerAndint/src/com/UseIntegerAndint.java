package com;

 /*Difference between int and Integer
 1.int is preemetive type where Integer is class
 2.In collecrtions we pass Integer not int*/
 
class IntegerAndint{
	void changeValue(int premetiveValue,Integer classValue){
		premetiveValue=50;
		System.out.println("Both are Pass By Value: \n Premeetive int: "+premetiveValue +"\n Class Integer : "+ classValue);
		}
}
public class UseIntegerAndint {
	static int premetiveValue;
	static Integer classValue;
	public static void main(String[] args) {
		System.out.println("Default Values: \n Premeetive int: "+premetiveValue +"\n Class Integer : "+ classValue);
		premetiveValue=10;
		classValue=new Integer(100);
		new IntegerAndint().changeValue(premetiveValue, classValue);
	}

}
