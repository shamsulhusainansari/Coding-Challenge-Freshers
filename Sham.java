import java.util.*;
import java.io.*;
class Sham{
    public static void main(String[] args) throws IOException {
        HashMap<String,String> acc_holders=new HashMap<String,String>();
        HashMap<String,Integer> accounts=new HashMap<String,Integer>();

        while(true){
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            String[] query = bi.readLine().split(" ");
            if(query[0].equals("CREATE")){
                acc_holders.put(query[1], query[2]);
                accounts.put(query[1], 0);
            }else if(query[0].equals("DEPOSIT")){
                accounts.replace(query[1], accounts.get(query[1]) + Integer.parseInt(query[2]));
            }else if(query[0].equals("WITHDRAW")){
                accounts.replace(query[1], accounts.get(query[1]) - Integer.parseInt(query[2]));
            }
            else if(query[0].equals("BALANCE")){
                System.out.println(acc_holders.get(query[1])+" "+accounts.get(query[1]));
            }
            else{
                break;
            }
            
        }
    }
}