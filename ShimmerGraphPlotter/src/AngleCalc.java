
import com.jme3.math.Quaternion;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class AngleCalc {

    public static ArrayList angle(String upper, String lower) {
        ArrayList<Quaternion> upper1 = ReadFile.readingCSVFile(upper);
        ArrayList<Quaternion> lower1 = ReadFile.readingCSVFile(lower);
        int loopLen = Math.min(upper1.size(), lower1.size()) - 100;
        ArrayList<float[]> angleSet = new ArrayList<>();
        for (int i = 100; i <= loopLen; i++) {
            Quaternion q = QuaternionOperations.relativeQuat(upper1.get(i), lower1.get(i));
            if ( QuaternionOperations.errorReduce(q)){
                angleSet.add(QuaternionOperations.toEular(q));
            
            }
            
        }
        return angleSet;

    }
    

}
