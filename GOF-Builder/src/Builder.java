/**
 * DESIGN PATTERN BUILDER -> 
 * útil para implementar diferentes objetos complexos que podem depender
 * de outros objetos ou não
 **/

public interface Builder{
    void setTipo(TipoImovel tipo);
    void setMetrosQuadrados(int metros);
    void setNumAndares(int andares);
    void setComodos(String comodos);
    void setNumBanheiros(int banheiros);
    void setPiso(TipoPiso piso);
    boolean setVaranda(boolean varanda);
    boolean setGaragem(boolean garamgem); 
}