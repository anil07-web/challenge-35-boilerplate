import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Word {
    int noofoccur = 0;
    String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public Word[] ReadWords() throws Exception {

        int count = countWords();
        Word[] word = new Word[count];
        try {

            BufferedReader br = new BufferedReader(new FileReader("daffodils.txt"));

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                for (String string : temp) {
                    string = string.replaceAll(",$", "");
                    string = string.replaceAll(";$", "");
                    string = string.replaceAll(":$", "");
                    word[i] = new Word(string);
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return word;
    }

    public int countWords() throws Exception {

        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("daffodils.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                for (String string : temp) {
                    count += 1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }

    public void printWords(Word[] word) {

        for (Word word2 : word) {
            System.out.println(word2.word + "  ");
        }
    }
}
