package _03_Printing_Binary;

import _00_Binary_Conversion.DecimalToBinary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte) 7);
		bp.printIntBinary(8);
		bp.printLongBinary(9);
		bp.printShortBinary((short) 10);
	}
	public void printByteBinary(byte b) {
		System.out.println(DecimalToBinary.convertDecimalToBinary(b));
	}
	
	public void printShortBinary(short s) {
		System.out.println(DecimalToBinary.convertDecimalToBinary(s));
	}
	
	public void printIntBinary(int i) {
		System.out.println(DecimalToBinary.convertDecimalToBinary(i));
	}
	
	public void printLongBinary(long l) {
		System.out.println(DecimalToBinary.convertDecimalToBinary((int) l));
	}
}
