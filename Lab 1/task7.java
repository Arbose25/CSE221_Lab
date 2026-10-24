import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class task7 {
    public static class Student{
        int id= 0;
        int mrk= 0;

    }
    public static void main(String[] args)throws Exception{
        BufferedReader BR= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW= new PrintWriter(System.out);
        int T= Integer.parseInt(BR.readLine());

        for(int x=0; x<T; x++){
            int N= Integer.parseInt(BR.readLine());
            Student [] stnds= new Student[N];
            String ids= BR.readLine();
            String marks= BR.readLine();
            String[] s1= marks.split(" ");
            String[] s2= ids.split(" ");

            for(int i=0; i<N; i++){
                stnds[i]= new Student();
                stnds[i].mrk= Integer.parseInt(s1[i]);

            }
            for(int j=0; j<N; j++){
                stnds[j].id= Integer.parseInt(s2[j]);

            }
            int count= 0;
            
            for(int i=0; i<N; i++){
                int maxIdx= i;
                for(int j=i+1; j<N; j++){
                    
                    if(stnds[j].mrk>stnds[maxIdx].mrk){
                        maxIdx= j;
                
                    }
                    else if(stnds[j].mrk== stnds[maxIdx].mrk && stnds[j].id< stnds[maxIdx].id){
                        maxIdx= j;
                
                    }
                }
                if(maxIdx!= i){
                    Student tmp= stnds[i];
                    stnds[i]= stnds[maxIdx];
                    stnds[maxIdx]= tmp;
                    count++;
                
                }
                
            }
            PW.println("Minimum swaps: "+ count);
            for(int i=0; i<N; i++){
                PW.println("ID: "+ stnds[i].id+ " Mark: "+ stnds[i].mrk);
            }

        }

        PW.close();
    }
}
