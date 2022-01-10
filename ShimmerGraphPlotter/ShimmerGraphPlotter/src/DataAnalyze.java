
import java.io.IOException;
import java.util.ArrayList;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XYChart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DataAnalyze {
    public static void graphPlotter(String upper , String lower ,String name) throws IOException{
        ArrayList<float[]> angles = AngleCalc.angle(upper,lower);
        double[] xData = new double[angles.size()];
        double[] yData = new double[angles.size()];
        for (int i = 0; i < angles.size(); i++) {
            yData[i] = angles.get(i)[0];
            xData[i] = i;

        }
        XYChart chart = QuickChart.getChart(name+" roll", "data points", "degrees", "y(x)", xData, yData);// Show it
        //chart.getStyler().set
        BitmapEncoder.saveBitmapWithDPI(chart, "C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\ShimmerGraphPlotter\\src\\graphs\\"+name+"_roll.png", BitmapFormat.PNG, 300);
        

        double[] y1Data = new double[angles.size()];
        for (int i = 0; i < angles.size(); i++) {
            y1Data[i] = angles.get(i)[1];
            xData[i] = i;

        }
        XYChart chart1 = QuickChart.getChart(name+" pitch", "data points", "degrees", "y(x)", xData, y1Data);// Show it
        BitmapEncoder.saveBitmapWithDPI(chart1, "C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\ShimmerGraphPlotter\\src\\graphs\\"+name+"_pitch.png", BitmapFormat.PNG, 300);
        
        double[] y2Data = new double[angles.size()];
        for (int i = 0; i < angles.size(); i++) {
            y2Data[i] = angles.get(i)[2];
            xData[i] = i;

        }
        XYChart chart2 = QuickChart.getChart(name+" yaw", "data points", "degrees", "y(x)", xData, y2Data);// Show it
        BitmapEncoder.saveBitmapWithDPI(chart2, "C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\ShimmerGraphPlotter\\src\\graphs\\"+name+"_yaw.png", BitmapFormat.PNG, 300);
        
    
    
    }
    
}
