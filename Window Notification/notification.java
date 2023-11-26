import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class notification {

    public static void main(String[] args) throws AWTException {
       
        if (SystemTray.isSupported()) {
          
            notification demo = new notification();
           
            demo.displayNotification("Hello, World", "This is a notification demo", MessageType.INFO);
        } else {
            System.err.println("System tray not supported!");
        }
    }

    public void displayNotification(String title, String message, MessageType type) throws AWTException {
        
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
     
        TrayIcon trayIcon = new TrayIcon(image, title);
       
        trayIcon.setImageAutoSize(true);
   
        trayIcon.setToolTip(title);
       
        tray.add(trayIcon);
       
        trayIcon.displayMessage(title, message, type);
    }
}
