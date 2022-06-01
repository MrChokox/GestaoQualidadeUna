package refatoração4;

import javax.swing.JOptionPane;

public class Salario {
    
    private double nota = 0, salario = 0;
    boolean repetir = true;
    String resp = null;
    
    
    public void salario() {
        do {
            resp = JOptionPane.showInputDialog("Infome o salário", 0);

            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

                System.exit(1);
            }
            try {
                salario = Double.parseDouble(resp);
                if (salario > 0) {
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
    
    public double getSalario() {
        return salario;
    }
}
