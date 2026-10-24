import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class calculator {
    public static void main(String[] args)throws Exception{
        BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter Pw =new PrintWriter(System.out);
        int T =Integer.parseInt(Br.readLine());

        for(int i=0; i<T; i++){
            String str= Br.readLine();
            String[] inp_str = str.trim().split(" ");
            long f_d= Long.parseLong(inp_str[1]);
            long e_d= Long.parseLong(inp_str[3]);
            String sign = inp_str[2];
            


            if(sign.equals("+")){
                Pw.println(f_d+e_d);
            }
            
            else if(sign.equals("-")){
                Pw.println(f_d-e_d);
            }
            else if(sign.equals("*")){
                Pw.println(f_d*e_d);
            }
            else if(sign.equals("/")){
                Pw.printf("%.10f%n",(double)f_d/e_d);
            }
            else if(sign.equals("%")){
                Pw.println(f_d%e_d);
            }
            else if(sign.equals("&")){
                Pw.println(f_d&e_d);
            }
            else if(sign.equals("|")){
                Pw.println(f_d|e_d);
            }
            else if(sign.equals("^")){
                Pw.println(f_d^e_d);
            }
            else if(sign.equals("<<")){
                Pw.println(f_d<<e_d);
            }
            else if(sign.equals(">>")){
                Pw.println(f_d>>e_d);
            }
            
        }
        Pw.close();

    }
}
