/*
  memo.txtに詳細がある。
 */


import java.math.*;

public class Main {
    public static void main(String[] args){
	
	//BigDecimalの生成
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("2.0");
        BigDecimal c = new BigDecimal("3.0");
	BigDecimal zero = new BigDecimal("0");
	BigDecimal calculatedValue;
	
        //足し算（1.0 ＋ 2.0）
	calculatedValue = new BigDecimal("1.1");
	calculatedValue = calculatedValue.add(b);
	calculatedValue = calculatedValue.setScale(3,BigDecimal.ROUND_CEILING); //少数第4位で正の無限大に近づく(小数点3ケタ表示)
	System.out.println(calculatedValue);

	
        //引き算（1.0 － 2.0）
        double val2 = a.subtract(b).doubleValue();
	
        //掛け算（2.0 × 3.0）
        double val3 = b.multiply(c).doubleValue();
	
        //割り算（1.0 ÷ 3.0 を小数第３位で切上げ）
        double val4 = a.divide(c, 3, BigDecimal.ROUND_HALF_UP).doubleValue();
	
	
    }
}
