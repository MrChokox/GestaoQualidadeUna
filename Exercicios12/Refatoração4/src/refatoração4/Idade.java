package refatoração4;

import javax.swing.JOptionPane;

public class Idade {
    
    boolean repetir = true;
    String resp = null;
    int idade = 0;
    
    public void idade(){
        do {
            resp = JOptionPane.showInputDialog("Infome a idade", 6);
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
                System.exit(1);
            }
            try {
                idade = Integer.parseInt(resp);
                if (idade >= 6 && idade <= 150) {
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
    
    public double getIdade() {
        return idade;
    }
}
