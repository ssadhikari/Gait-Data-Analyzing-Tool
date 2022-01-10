
//import com.jme3.math.Quaternion;
import com.jme3.math.Quaternion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


public class ReadFile {

    public static ArrayList readingCSVFile(String filename ) {
        ArrayList<Quaternion> out = new ArrayList<>();
        try {
            try (BufferedReader readFile = new BufferedReader(new FileReader(filename))) {
                String readFilerow;
                if ((readFilerow = readFile.readLine()) != null){
                    String[] data = readFilerow.split(",");
                    data= readFile.readLine().split(",");
                    data = readFile.readLine().split(",");
                }
                
                while ((readFilerow = readFile.readLine()) != null) {
                    String[] data = readFilerow.split(",");
                    Quaternion quat;
                    quat = new Quaternion(Float.parseFloat(data[11]),Float.parseFloat(data[12]),Float.parseFloat(data[13]),Float.parseFloat(data[10]));
                    out.add(quat);
                    

                    //System.out.println(quat);                    
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file is not found");
        } catch (IOException e) {
        }
    
        
        //System.out.println(out);
    return out;
}

    static ArrayList<Quaternion> readingCSVFile(ArrayList<Quaternion> upper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
