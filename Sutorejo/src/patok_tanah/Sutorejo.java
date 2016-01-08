package patok_tanah;

public class Sutorejo {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });        
    }    
}
