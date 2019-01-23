
/* 
Хорошего много не бывает
*/



import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
String str = reader.readLine();
int numb = Integer.parseInt(reader.readLine());
        
int count = 0;        
        while (numb > 0 ){
            System.out.println(str);
            numb --;
        }
        
        
    }
}
