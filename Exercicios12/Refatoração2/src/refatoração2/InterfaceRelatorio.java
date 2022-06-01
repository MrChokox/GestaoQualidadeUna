
package refatoração2;
import java.util.ArrayList;

public interface InterfaceRelatorio {
    public abstract double somatoria(ArrayList<Produto> produtos, boolean vip);
    public abstract void setDesconto(boolean vip);
    public abstract void setTaxaEntrega();
}
