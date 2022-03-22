public class StringBuilderString{
    /*
    *  EXPERIMENTAL ANALYSIS
    */
    public static StringBuilder repeat(String c, int n){
        long startTime = System.currentTimeMillis();
        StringBuilder answer = new StringBuilder();
        for(int j =0; j < n;j++){
            answer.append(c);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+" milsec");
        return answer;
    }

    public static void main(String... args){
        //minimun of 3.2 gigs needed
        StringBuilderString.repeat("*", 200000000);
    }
}