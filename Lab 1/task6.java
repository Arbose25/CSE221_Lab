import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class task6 {
    public static void main(String[] args)throws Exception{
        BufferedReader BR= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW= new PrintWriter(System.out);
        int length0= Integer.parseInt(BR.readLine());
        String str= BR.readLine();
        String[] arr_str= str.split(" ");
        int[] A= new int[length0];

        for(int i=0; i<length0; i++){
            A[i]= Integer.parseInt(arr_str[i]);
        }

        for(int i=0; i<A.length; i++){
            for(int j= 0; j<A.length-i-1; j++){
                if(A[j]%2== A[j+1]%2 && A[j]> A[j+1]){
                    int tmp= A[j];
                    A[j]= A[j+1];
                    A[j+1]= tmp;
                }
            }
        }
        for(int i=0; i<A.length; i++){
            PW.print(A[i]+ " ");
        }

        PW.println();
        PW.close();
    }
}
