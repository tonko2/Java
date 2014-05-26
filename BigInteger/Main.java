import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){

	BigInteger zero = new BigInteger("0");
	BigInteger one = new BigInteger("1");
	BigInteger calculatedValue;
	BigInteger value = zero;
	
	//add
	calculatedValue = zero;
	value = new BigInteger("1234567890");
	calculatedValue = calculatedValue.add(value);
	System.out.println("add = " + calculatedValue);
	
	//subtract
	calculatedValue = zero;
	value = new BigInteger("1234567890");
	calculatedValue = calculatedValue.subtract(value);
	System.out.println("subtract = " + calculatedValue);

	//multiply
	calculatedValue = new BigInteger("2");
	value = new BigInteger("5");
	calculatedValue = calculatedValue.multiply(value);
	System.out.println("multi = " + calculatedValue);

	//divide
	calculatedValue = new BigInteger("10");
	value = new BigInteger("2");
	calculatedValue = calculatedValue.divide(value);
	System.out.println("divide = " + calculatedValue);

	//remainder
	calculatedValue = new BigInteger("3");
	value = new BigInteger("2");
	calculatedValue = calculatedValue.remainder(value);
	System.out.println("remainder = " + calculatedValue);

    }
}
