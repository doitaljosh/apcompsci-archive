import java.io.*;
import java.util.*;

public class captionDb
{
	public static void main(String[] args) {
   
        String fileName= "captions.csv";
        File file= new File(fileName);

        List<List<String>> captions = new ArrayList<>();
        Scanner inputStream;
        
        int totalNumOfMemes = 10;
        ArrayList[][] captionArray = new ArrayList[totalNumOfMemes][3];

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

        int captionIdx = 0;
        for(List<String> line: captions) {
            int captionId = 0;
            //captions.add(new ArrayList<String>(line));
            for (String value: line) {
                //captions.get(line).add(new String());
                captionId++;
            }
            captionIdx++;
        }
        
        //Scanner meme = new Scanner(userInput0);
        //captions.get(meme)
             
    }
    
    public int location(int row, int col) {
    }
    
    public static location getCaptionLocation(String match, String[][] location) {
    
      Scanner queryInput = new Scanner(System.in);
      for (int row = 0 ; row < captionDb.length ; row++) {
      
         for (int col = 0 ; col < captionDb[0].length ; col++) {
         
            if (captionDb[row][col] == queryInput) {
            
               return new location(row, col);
            
            }
         
         }
      
      }
    
    }
}