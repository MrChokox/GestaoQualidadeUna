
package refatoração2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio implements InterfaceRelatorio{
    private double total;
    
    // Aplica desconto:
    @Override
    public void setDesconto(boolean vip) {
         if (vip) {
            total *= 0.90;
        } else {
            total *= 0.95;
        }
    }

    // Adiciona taxa de entrega:
    @Override
    public void setTaxaEntrega() {
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            total += 10.00;
        } else {
            total += 5.00;
        }
    }
    
    // Calcula o somatório dos preços:
    @Override
    public double somatoria(ArrayList<Produto> produtos, boolean vip) {
        produtos.forEach((produto) -> {
            total += produto.getPreco() * produto.getQuantidade();
        });
        setDesconto(vip);
        setTaxaEntrega();
       return total;
    }
    
}
