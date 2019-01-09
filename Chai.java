import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public
. */

class Chai{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b= sc.next();
		String order = sc.next();

		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<order.length();i++){
            h.put(order.charAt(i),i);
        }

		System.out.println(helper(a,b,h));
	}

	public static boolean helper(String a,String b,HashMap<Character,Integer> h){
        int i=0;
        int j=0;
        int al = a.length();
        int bl = b.length();
        while(i<al&&j<bl){
            if(h.get(a.charAt(i))>h.get(b.charAt(j))){
            	// System.out.println(i+" "+j);
                return false;
            }
            else if(h.get(a.charAt(i))<h.get(b.charAt(j))){return true;}
            i++;
            j++;
        }
        if(i<al || j<bl){
            if(al>bl){
                return false;
                
            }
        }
        
        return true;             
    }
}