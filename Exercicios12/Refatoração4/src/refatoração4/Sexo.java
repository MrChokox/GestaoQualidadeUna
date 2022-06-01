package refatoração4;

import javax.swing.JOptionPane;

public class Sexo {
        
   boolean repetir = true;
   String resp = null, sexo = "";
      
    public void sexo() {
    do {
            sexo = JOptionPane.showInputDialog("Infome o sexo");
            if (sexo == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

                System.exit(1);
            }
            if (sexo.equalsIgnoreCase("f") == true || sexo.equalsIgnoreCase("m") == true) {
                repetir = false;
            } else {
                repetir = true;
            }
        } while (repetir == true);
}
    
    public String getSexo() {
        return sexo;
    }
}