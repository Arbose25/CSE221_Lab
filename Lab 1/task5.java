import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class task5 {
    public static boolean helper(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
            
        }
        return true;
    }


    public static void main(String[] args)throws Exception{
        BufferedReader BR= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW= new PrintWriter(System.out);
        int N= Integer.parseInt(BR.readLine());
        int[] A= new int[N];
        String str= BR.readLine();
        String[] nums= str.split(" ");

        for(int i=0; i<N; i++){
            A[i]= Integer.parseInt(nums[i]);
        }

        ArrayList<String> changes= new ArrayList<>();
        for(int i=0; i<A.length; i++){
            for(int j=2; j<A.length; j+=2){
                if(A[j]<A[j-2]){
                    int tmp= A[j];
                    A[j]= A[j-2];
                    A[j-2]= tmp;
                    changes.add((j-1)+ " " + (j+1));
                }
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=3; j<A.length; j+=2){
                if(A[j]<A[j-2]){
                    int tmp= A[j];
                    A[j]= A[j-2];
                    A[j-2]= tmp;
                    changes.add((j-1)+ " " + (j+1));
                }
            }
        }

        if(helper(A)){
            PW.println("YES");
            PW.println(changes.size());
            for(int i= 0; i<changes.size(); i++){
                PW.println(changes.get(i));
            }
        }
        else{
            PW.println("NO");
        }

        PW.close();

    }
}