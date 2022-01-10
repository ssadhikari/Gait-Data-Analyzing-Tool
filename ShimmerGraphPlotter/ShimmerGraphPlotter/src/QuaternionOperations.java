/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static com.jme3.math.FastMath.asin;
import static com.jme3.math.FastMath.atan;
import com.jme3.math.Quaternion;
import static java.lang.Math.PI;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class QuaternionOperations {
    public static float[] toEular(Quaternion quat1){
        float q0 = quat1.getW();
        float q1 = quat1.getX();
        float q2 = quat1.getY();
        float q3 = quat1.getZ();
        
        float x1=2*((q0*q1)+(q2*q3));
        float y1=(1-2*((q1*q1)+(q2*q2)));
        float x2=2*((q0*q2)-(q3*q1));
        float x3=2*((q0*q3)+(q1*q2));
        float y3=1-2*((q2*q2)+(q3*q3));
        
        
        float roll = (float) Math.toDegrees(atan(x1/y1)); //x axis
        float pitch =  (float) Math.toDegrees(asin(x2)); // y axis
        float yaw  =  (float) Math.toDegrees(atan(x3/y3)); // z axis
        //System.out.println(pitch+" "+yaw+" "+roll);
        float[] eular = {roll,pitch,yaw};
        //System.out.println(quat1);
        //System.out.println(roll+" "+pitch+" "+yaw); // print roll pitch yaw
        //System.out.println(Arrays.toString(eular));
        
       
        return eular;
    }
    public static Quaternion relativeQuat(Quaternion qUpper , Quaternion qLower){
        Quaternion relative = qUpper.mult(new Quaternion(0.0f,0.0f,0.0f,1.0f).inverse()).inverse().mult(qLower.mult(new Quaternion(0.0f,0.0f,0.0f,1.0f).inverse()));
        return relative;
    
    }
    public static boolean errorReduce(Quaternion q1){
        boolean status = false ;
        float x = q1.getX();
        float y = q1.getY();
        float z = q1.getZ();
        float w = q1.getW();
        if (x*x + y*y + z*z + w*w <= 1){
            status = true;
        }
    return status;
    }
}
