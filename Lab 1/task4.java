import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class task4 {
    public static boolean helper(int[] arr, int len){
        for(int i=1; i<len; i++){
            if(arr[i]<arr[i-1]){
                return false;

            }
        }
        return true;
    }


    
    public static void main(String[] args) throws Exception{
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW = new PrintWriter(System.out);
        int T= Integer.parseInt(BR.readLine().trim());

        for(int i=0; i<T; i++){
            int srtd_len= Integer.parseInt(BR.readLine());
            String str= BR.readLine();
            String[] trmd_str= str.trim().split(" ");
            int[] nw_arr= new int[srtd_len];


            for(int j=0; j<srtd_len; j++){
                nw_arr[j]= Integer.parseInt(trmd_str[j]);
            }
            

            boolean isTrue = helper(nw_arr, srtd_len);
            if(isTrue== true){
                PW.println("YES");
            }
            else{
                PW.println("NO");
            }

        }
        
        PW.close();
    }
}
