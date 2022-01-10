
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class FileChooser {

    public static String lHip;
    public static String rHip;
    public static String lKnee;
    public static String rKnee;
    public static String lAnkle;
    public static String rAnkle;
    public static String ref;
    

    public static File[] fileChoose() {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "csv files", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        File[] files = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: ");
            files = chooser.getSelectedFiles();

            System.out.println(files[0].getAbsolutePath());

        }
        return files;
    }

    public static void fileAssign(File[] files) {
        for (File i : files) {
            String name = i.toString();
            if (name.contains("9008")) {
                lHip = i.getAbsolutePath();
            } else if ( name.contains("5F42")) {
                rHip = i.getAbsolutePath();
            }
            else if ( name.contains("41EA")) {
                lKnee = i.getAbsolutePath();
            }
            else if ( name.contains("5FE1")) {
                rKnee = i.getAbsolutePath();
            }
            else if ( name.contains("9048")) {
                lAnkle = i.getAbsolutePath();
            }
            else if ( name.contains("5FC5")) {
                rAnkle = i.getAbsolutePath();
                
            }
            else if ( name.contains("4831")) {
                ref = i.getAbsolutePath();
                
            }
        }
    }

}
