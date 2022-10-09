public class MyClassAlgo {
    public static void main(String args[]) {

      System.out.println("Number of pairs = " + count(4));
    }
    

     static int count(int n){
        int results = 0;

        for (int i = 0; i <=n -1 ; i++) {
            System.out.println(" i: "+ (i+1));
            for (int j = i + 1; j < n; j++) {
                System.out.println("       j: "+ (j+1));
                
                results++;
            }
        }
    
        return results;
    }
}