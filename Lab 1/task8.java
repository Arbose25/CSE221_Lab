import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class task8 {
    
    public static class Trains{
        String org_des;
        String names;
        int mins= 0;
        int idx= 0;
    
        
        Trains(String org_des, int idx){
            this.org_des= org_des;
            this.idx= idx;
            String[] splt_des= org_des.split(" ");
            names= splt_des[0];
            String dep_time= splt_des[splt_des.length- 1];
            String[] h_m= dep_time.split(":");
            mins= (Integer.parseInt(h_m[0])*60)+ Integer.parseInt(h_m[1]);

        }
        
    }


    public static void main(String[] args)throws Exception{
        
        BufferedReader BR= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW= new PrintWriter(System.out);
        int N= Integer.parseInt(BR.readLine());
        Trains[] nTrain= new Trains[N];

        for(int i=0; i< N; i++){
            nTrain[i]= new Trains(BR.readLine(), i);

        }
        Arrays.sort(nTrain, new Comparator<Trains>() {
            public int compare(Trains a, Trains b){
                int nmCompare= a.names.compareTo(b.names);
                if(nmCompare!= 0){
                    return nmCompare;
                }
                if(a.mins!= b.mins){
                    return Integer.compare(b.mins, a.mins);
                }
                
                return Integer.compare(a.idx, b.idx);

            }

        });

        
        for(int i=0; i< N; i++){
            PW.println(nTrain[i].org_des);
        
        }

        PW.flush();
    }
}
