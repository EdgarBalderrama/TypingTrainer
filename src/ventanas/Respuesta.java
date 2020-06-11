
package ventanas;

import java.util.Random;

public class Respuesta {
    private String respuesta;
    private String tecla;
    public void setRespuesta(String respuesta){
        this.respuesta=respuesta;
    }
    public void setTecla(String tecla){
    this.tecla=tecla;
    }
    public Respuesta(String respuesta,String tecla){
    this.respuesta=respuesta;
    this.tecla=tecla;
    }
    public String getRespuesta(){
    return respuesta;
    }
    public String getTecla(){
    return tecla;
    }
}

