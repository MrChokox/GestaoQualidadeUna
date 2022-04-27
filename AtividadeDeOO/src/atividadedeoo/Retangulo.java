package atividadedeoo;

public class Retangulo {

    private float altura, largura;

    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    public float getAltura() {
        return (altura);
    }

    public void setAltura(float alt) {
        altura = alt;
    }

    public float getLargura() {
        return (largura);
    }

    public void setLargura(float larg) {
        largura = larg;
    }

    public float calculaArea() {
        return altura * largura;
    }    
    
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }
    
    /**Metodo utilizado para exibir informações do retangulo
     * @return <h3 style="color: red">String de informações do triangulo<h3>
     */      
    public String exibe() {
        String retorno = "Altura: " + getAltura() + "\n";
        retorno += "Largura: " + getLargura() + "\n";
        retorno += "Área: " + calculaArea() + "\n";
        retorno += "Perimetro: " + calculaPerimetro() + "\n";
        return retorno;
    }

}
