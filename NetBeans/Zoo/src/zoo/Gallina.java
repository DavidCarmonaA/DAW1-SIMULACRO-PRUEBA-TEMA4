package zoo;

/**
 * Clase encargada de gestionar el objeto gallina.
 * @author David
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor vacío.
     */
    public Gallina () {}
    
    /**
     * Constructor parametrizado.
     * @param habitat ENUM que define el hábitat de la gallina.
     * @param comida Cadena que define lo que come.
     * @param longevidad Entero que define lo que vive la gallina.
     * @param periodoIncubacion Entero que define lo que tarda en nacer la gallina.
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Setter de la cadena cacareo.
     * @param cacareo Cadena que pasamos para que la setee.
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Getter de cacareo.
     * @return Devuelve la cadena.
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Método que imprime por pantalla el cacareo.
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * Método que imprime que la gallina come la comida definida en el constructor.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método que imprime cómo vuela la gallina.
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
