package ventanas;

import java.util.ArrayList;

public class Frases {
    protected String frase=""; 
    protected int dificultad;
    protected ArrayList<String> listaFrasesFaciles = new ArrayList<>();
    protected ArrayList<String> listaFrasesMedias = new ArrayList<>();
    protected ArrayList<String> listaFrasesDificiles = new ArrayList<>();
    
    public Frases(){
    }
    
    public void setFraseFacil(String frase){
            listaFrasesFaciles.add(frase);
    }
    
    public void setFraseMedia(String frase){
            listaFrasesMedias.add(frase);
    }
    
    public void setFraseDificil(String frase){
            listaFrasesDificiles.add(frase);
    }
    
    public void setDificultad(int dificultad){
        this.dificultad=dificultad;
    }
    
    public int getDificultad(){
        return dificultad;
    }
    
    public String getFrase(){
        return frase;
    }
    
    public String mostrarFrasesFaciles(int n){
        return listaFrasesFaciles.get(n);
    }
    
    public String mostrarFrasesMedias(int n){
        return listaFrasesMedias.get(n);
    }
    
    public String mostrarFrasesDificiles(int n){
        return listaFrasesDificiles.get(n);
    }
    
    public int cantidadFrasesFaciles(){
        return listaFrasesFaciles.size();
    }
    
    public int cantidadFrasesMedias(){
        return listaFrasesMedias.size();
    }
    
    public int cantidadFrasesDificiles(){
        return listaFrasesDificiles.size();
    }
    
    public void llenarListaFrasesFaciles(){
        listaFrasesFaciles.add("hola don pepito");
        listaFrasesFaciles.add("la taza es grande");
        listaFrasesFaciles.add("el cuaderno es rojo");
        listaFrasesFaciles.add("el cargador es blanco");
        listaFrasesFaciles.add("el cereal es nutritivo");
        listaFrasesFaciles.add("el agua es transparente");
        listaFrasesFaciles.add("la silla esta mal puesta");
        listaFrasesFaciles.add("la hoja de papel esta rota");
        listaFrasesFaciles.add("las fabulas son muy educativas");
        listaFrasesFaciles.add("las rosas del jardin son coloridas");
    }
    
    public void llenarListaFrasesMedias(){
        listaFrasesMedias.add("¿Podrás seguir con esto?");
        listaFrasesMedias.add("El éxito es satisfactorio.");
        listaFrasesMedias.add("El libro tiene 13 capítulos.");
        listaFrasesMedias.add("Detrás del ropero está Narnia.");
        listaFrasesMedias.add("¡Si caíste simplemente levántate y sigue!");
        listaFrasesMedias.add("Es rojo, blanco y azul.");
        listaFrasesMedias.add("Compró pan, mortadela y mermelada.");
        listaFrasesMedias.add("Contiene lápices, 1 borrador y 2 tajadores.");
        listaFrasesMedias.add("El refresco vendrá en 2 sabores: Uva y pera.");
        listaFrasesMedias.add("El 1, 2 y 3 son los primeros números naturales. ¡Increible!");
    }
    
    public void llenarListaFrasesDificiles(){
        listaFrasesDificiles.add("Haz lo que puedas, con lo que tengas, donde estés.");
        listaFrasesDificiles.add("El mejor modo de predecir el futuro es inventándolo.");
        listaFrasesDificiles.add("La confianza en sí mismo es el primer secreto del éxito.");
        listaFrasesDificiles.add("Ponte de frente al sol y las sombras quedarán detrás de ti.");
        listaFrasesDificiles.add("¡Hay que seguir la lucha con lo que podamos hasta que podamos!");
        listaFrasesDificiles.add("¿En serio crees que si no cambias tus hábitos cambiarás tu vida?");
        listaFrasesDificiles.add("El hombre bien preparado para la lucha ya ha conseguido medio triunfo.");
        listaFrasesDificiles.add("La fuerza no viene de la capacidad corporal, sino de la voluntad del alma.");
        listaFrasesDificiles.add("Tanto si crees que puedes hacerlo, como si no, en los dos casos tienes razón. ¡Solo un poco más!");
        listaFrasesDificiles.add("Solo aquellos que se atreven a tener grandes fracasos terminan consiguiendo grandes éxitos. ¡Lo lograste!");
    }
            
}
