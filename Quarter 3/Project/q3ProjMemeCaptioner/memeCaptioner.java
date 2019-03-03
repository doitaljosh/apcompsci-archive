import java.io.*;
import java.util.*;

public class memeCaptioner
{
	public static void main(String[] args) {
        String fileName= "captions.csv";
        File file= new File(fileName);

        List<List<String>> captions = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                captions.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int captionId = 0;
        for(List<String> line: captions) {
            int memeId = 0;
            for (String value: line) {
                System.out.println("Meme " + memeId + " Caption " + captionId + ": " + value);
                memeId++;
            }
            captionId++;
        }
    }
}