package refatoração4;

import javax.swing.JOptionPane;

public class Refatoração4 {

    public static void main(String[] args) {
             
        Menu menu = new Menu();
        
        menu.nota();        
        JOptionPane.showMessageDialog(null, "Nota informada: " + menu.getNota());

        menu.salario();
        JOptionPane.showMessageDialog(null, "Salário informado: " + menu.getSalario());

        menu.sexo();
        JOptionPane.showMessageDialog(null, "Sexo informado: " + menu.getSexo());
        
        menu.idade();
        JOptionPane.showMessageDialog(null, "Idade informada: " + menu.getIdade());
    }

}
