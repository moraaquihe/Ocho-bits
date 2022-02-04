/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;
    import java.awt.Dimension;
import java.sql.Date;
import java.text.SimpleDateFormat;
    import javax.swing.JDesktopPane;
    import javax.swing.JInternalFrame;
/**
 *
 * @author SailorSakura
 */
public class UtilitariosFrame {
    public UtilitariosFrame(){
    }
    public static void centrarInternalFrame(JDesktopPane escritorio, JInternalFrame frameInterno){
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frameInterno.getSize();
        frameInterno.setLocation((desktopSize.width - FrameSize.width)/2,
        (desktopSize.height - FrameSize.height)/2);
        frameInterno.show();
    }
    

}
