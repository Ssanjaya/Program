import java.io.*;
public class FileCount {
    public static void main(String[] args) throws IOException {
       BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\purus\\IdeaProjects\\HackerRank\\src\\FileCount.java"));
        int linecount = 0; String line ;
        int wordCount=0;
        int charCount=0;
        file.read();
        file.readLine();
        while((line = file.readLine()) != null){
            linecount++;
            String [] words = line.split(" ");
            wordCount += words.length;
            for (String word : words){
                charCount += word.length();
            }
        }
        System.out.println("Number of Lines in file is :"+linecount);
        System.out.println("Number of words in file is : "+wordCount);
        System.out.println("Number of character in file is : "+charCount);
        file.close();
    }
}
