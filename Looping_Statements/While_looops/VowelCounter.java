import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Text: "+s);
        String s1=s.toLowerCase();
        int vowels=0;
        int i=0;
        do{
            char ch=s1.replace("//s","").charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }
            i++;
        }while(i<s.length());
        System.out.println("Vowel Count:"+vowels);
        sc.close();
    }
}
