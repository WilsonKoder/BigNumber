/**
 * Created by Wilson on 5/17/2015.
 */
import java.lang.StringBuilder;


public class BigNumber {

    private static final float log2 = 0.30103F;

    private int[] number;

    public BigNumber (String numberString){
        if (numberString.equals("10")){
            number = new int[] {10};return;}

        int[] result=new int[(int)(numberString.length()/(log2*32))];

        for(int i = 0; i != numberString.length(); ++i) {
            result=this.multiply(new BigNumber("10")).number;
            if (numberString.charAt(i)== '1'){
                System.out.println("it was one");
                addResult(1,0,result);}
            else if (numberString.charAt(i)== '2'){
                System.out.println("it was one");
                addResult(2,0,result);
            }
            else if (numberString.charAt(i)== '3'){
                System.out.println("it was one");
                addResult(3, 0, result);
            }
            else if (numberString.charAt(i)== '4'){
                System.out.println("it was one");
                addResult(4, 0, result);
            }
            else if (numberString.charAt(i)== '5'){
                System.out.println("it was one");
                addResult(5, 0, result);
            }
            else if (numberString.charAt(i)== '6'){
                System.out.println("it was one");
                addResult(6, 0, result);
            }
            else if (numberString.charAt(i)== '7'){
                System.out.println("it was one");
                addResult(7, 0, result);
            }
            else if (numberString.charAt(i)== '8'){
                System.out.println("it was one");
                addResult(8, 0, result);
            }
            else if (numberString.charAt(i)== '9'){
                System.out.println("it was one");
                addResult(9, 0, result);
            }
            else if (numberString.charAt(i)== '0'){
                System.out.println("it was one");}}
        number = result;}
    private BigNumber (int[] numberArray){
        this.number=numberArray;}

    public BigNumber doubleNumber() {
        return multiply(new BigNumber("2"));}
    public BigNumber multiply(BigNumber x) {
        int[] result = new int[number.length+x.number.length+1];
        for(int i = 0; i != number.length; ++i) {
            for(int j = 0; j != x.number.length; ++j) {
                multiply(number[i],x.number[j],i+j,result);}}
        return new BigNumber(result);}
    private void multiply(int num1, int num2, int index, int[] resultArray){
        long tempResult = num1 * num2;
        addResult((int)(tempResult % 0x100000000L), index, resultArray);
        addResult((int)(tempResult / 0x100000000L), index+1, resultArray);}
    private void addResult(int num, int index, int[] resultArray){
        long tempResult = num + resultArray[index];
        if (tempResult >= 0x100000000L) {
            resultArray[index] = (int)(tempResult % 0x100000000L);
            addResult((int)(tempResult / 0x100000000L), index + 1, resultArray);}}
    @Override
    public String toString(){
        StringBuilder numString = new StringBuilder();
        for(int i = 0; i != number.length; ++i) {
            numString.append(number[i]);
        }
        return numString.toString();
    }
}
