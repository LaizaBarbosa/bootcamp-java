public class Imovel implements Builder{
    private TipoImovel tipo;
    private int metrosQuadrados;
    private int numAndares;
    private String Comodos;
    private int numBanheiros;
    private TipoPiso piso;

    String temGaragem = "";
    String temVaranda = "";


    @Override
    public boolean setGaragem(boolean garagem) {
        if (garagem) {
            temGaragem = "possui Garagem";
        }
        return garagem;
    }

    @Override
    public void setMetrosQuadrados(int metros) {
        this.metrosQuadrados = metros;
    }

    @Override
    public void setNumAndares(int andares) {
        this.numAndares = andares;
    }

    @Override
    public void setNumBanheiros(int banheiros) {
        this.numBanheiros = banheiros;
    }

    @Override
    public void setComodos(String comodos) {
        this.Comodos = comodos;
    }

    @Override
    public void setPiso(TipoPiso piso) {
        this.piso = piso;   
    }

    @Override
    public void setTipo(TipoImovel tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean setVaranda(boolean varanda) {
        if (varanda) {
            temVaranda = "possui varanda";
        }
        return varanda;
    }

    public String infos(){
        return "Tipo do imovel: " + tipo + "\n" + "Tamanho: " + metrosQuadrados + "m2" + "\n" +
        "Andares: " + numAndares + "\n" + Comodos + "\n" + numBanheiros + " banheiros" + "\n" + "Piso: " + piso + "\n" + temGaragem + "\n" + temVaranda;
    }
}
