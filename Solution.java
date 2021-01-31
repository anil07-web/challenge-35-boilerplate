import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        SinglyLinkedList list = new SinglyLinkedList();

        BufferedReader br = null;
        try{
            FileReader fr = new FileReader("data//daffodils.txt");
            br = new BufferedReader(fr);

            String line = br.readLine();
            
            while(line != null){
                String[] words = line.split("[, :;/-/.]");
                
                System.out.println(words.length);
                for(String word: words){
                    list.insert(new Word(word));
                }

                line = br.readLine();
            }
            System.out.println();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            br.close();
        }

        list.showWordList();
    }
    
}
