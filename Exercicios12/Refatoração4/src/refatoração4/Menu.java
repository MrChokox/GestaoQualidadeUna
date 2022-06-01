package refatoração4;

import javax.swing.JOptionPane;

public class Menu {

    private double nota = 0, salario = 0;
    boolean repetir = true;
    String resp = null, sexo = "";
    int idade = 0;

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

    public void idade() {
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

    public double getNota() {
        return nota;
    }

    public double getSalario() {
        return salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void sendMenu(String dialog, char tipo) {
        do {
            resp = JOptionPane.showInputDialog(dialog, 6);
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
                System.exit(1);
            }
            switch (tipo) {
                case 'i':
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
                case 's':
                    
            }

        } while (repetir == true);
    }
}
