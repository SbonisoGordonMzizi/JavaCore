public class ConcatenationString{
    /*
    *  EXPERIMENTAL ANALYSIS
    */

    public static String repeat(String c,int n){
    long startTime = System.currentTimeMillis();
    String answer = "";
    for(int i =0; i<n;i++){
        answer+= c;
    }
    long endTime = System.currentTimeMillis();
    System.out.println((endTime - startTime)+" milsec");
    return answer;
    }

    public static void main(String[] args){
        //minimun of 3.2 gigs needed
        ConcatenationString.repeat("*", 200000000);
    }
}