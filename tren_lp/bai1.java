import java.util.Scanner;

public class bai1 {
    
    public static String chuanHoa ( String s ) {
        String t = "" ; 
        t += Character.toUpperCase(s.charAt(0)) ;
        t += s.substring(1).toLowerCase() ; 
        return t ; 
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String input = sc.nextLine().trim();
        
        String[] arr = input.split("\\s+") ; 
        
        
        
        
        sc.close();
    }
}
