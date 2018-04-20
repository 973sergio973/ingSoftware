package test;

public class A {
	public static int gcd(int a, int b) {
		if(b==0)return a;
		else return gcd(b,b%a);
	}
}
