package refatoração4;

import javax.swing.JOptionPane;

public class Nota {
    
    private double nota = 0;
    boolean repetir = true;
    String resp = null;
    
    
    public void nota() {
        do {
            resp = JOptionPane.showInputDialog("Infome a nota [0, 10]", 0);
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
                System.exit(1);
            }
            try {
                nota = Double.parseDouble(resp);
                if (getNota() >= 0 && getNota() <= 10) {
                    repetir = false;
                } else {
                    repetir = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir == true);
    }
    
    public double getNota() {
        return nota;
    }
}
