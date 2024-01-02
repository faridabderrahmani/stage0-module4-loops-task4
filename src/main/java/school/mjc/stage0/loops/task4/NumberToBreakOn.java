package school.mjc.stage0.loops.task4;
//Write a program that will consume 2 args: the first is number to
// break on, the second to iterate till, if number to iterate till
// is less than to break with -> sout("iterating till the end") and p
// rint all the numbers till the end, otherwise all numbers till
// toBreakWith.
public class NumberToBreakOn {
    public static void main(String[] args) {

printNumbersUntilWithBreakOn(15, 20);
    }
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        String textLine = "iterating till the end ";
        for(int i = 1; i <= numberToGoUntil; i++){
            if(numberToGoUntil < toBreakWith) {
                textLine += "\n"+i;
            }
            else {
                if (i > toBreakWith){
                    break;
                }System.out.println(i);

            }
        }System.out.println(textLine);
    }
}
