package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {

    }
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int lastSum = 0;
        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else if(lastInRow < 0){
            System.out.println("last number in row is negative");
        }else{
            for(int i = 0; i <= numberToSkip; i++){

                skippedSum += i;
            }
            for(int j = numberToSkip+1; j <= lastInRow; j++){

                lastSum +=j;
            }
            System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + lastSum +"\n");
        }

    }
}
