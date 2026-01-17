import java.util.*;

public class pp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pp6 ob = new pp6();
        System.out.println("Enter a sentence in Upper Case only: ");
        String s = sc.nextLine().toUpperCase(), w = "", ns = "";
        StringTokenizer st = new StringTokenizer(s.substring(0, s.length() - 1));
        if ("!.?".indexOf(s.charAt(s.length() - 1)) >= 0 && s.contains("  ") == false) {
            String as[]=new String[st.countTokens()],t="";
            for (int i = 0; st.hasMoreTokens(); i++)
                as[i]=st.nextToken();
            for (int i = 0; i < as.length-1; i++) {
                for (int j = 0; j < as.length-1-i; j++) {
                    if(as[j].length()>as[j+1].length()){
                        t=as[j];
                        as[j]=as[j+1];
                        as[j+1]=t;
                    }
                }
            }
            for (int i = 0; i < as.length-1; i++) {
                for (int j = 0; j < as.length-1-i; j++) {
                    if(as[j].length()==as[j+1].length()&&as[j].compareTo(as[j+1])>0){
                        t=as[j];
                        as[j]=as[j+1];
                        as[j+1]=t;
                    }
                }
            }
            System.out.println("Original sentence: " + s);
            System.out.print("Converted sentence: ");
            for (int i = 0; i < as.length; i++) {
                System.out.print(as[i]+" ");
            }
        }
        else
            System.out.println("InvalidInput!!");
        sc.close();
    }
}
