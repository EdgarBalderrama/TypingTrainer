package verificador;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Verificador
{
    Pattern patron;
    private String castellano = " ";
    private boolean resultado = false;
    private int contadorConectores = 0;
    private int contadorVerbos = 0;
    
    public boolean verificarIdioma(String cadena)
    {
        retomarValores();
        if (verificarSiEsSoloPalabra(cadena))
        {
            if (verificarLimiteLetras(cadena))
            {
                if(verificarCantidadMinimaLetras(cadena))
                {
                    if(!verificarCantidadVocalesJuntas(cadena))
                    {
                        if(!verificarCantidadConsonantesJuntas(cadena))
                        {
                            contadorDeConectores(cadena);
                            //contadorDeVerbos(cadena);
                            this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
                            resultado = true;
                        }
                    }
                }
            }
        }
        else if(verificarSiEsOracionOTexto(cadena))
        {
            if(!verificarCantidadVocalesJuntas(cadena))
            {
                if(!verificarCantidadConsonantesJuntas(cadena))
                {  
                    contadorDeConectores(cadena);
                    //contadorDeVerbos(cadena);
                    this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
                    resultado = true;
                }
            }
        }
        if(palabraValidaDeUnaLetra(cadena))
        {
            contadorDeConectores(cadena);
            //contadorDeVerbos(cadena);
            this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
            resultado = true;
        }
        if(resultado == false)
        {
            this.castellano = "La palabra o texto NO cumple las reglas del castellano";
        }
        return resultado;
    }
    
    public String verificar(String cadena)
    {
        retomarValores();
        if (verificarSiEsSoloPalabra(cadena))
        {
            if (verificarLimiteLetras(cadena))
            {
                if(verificarCantidadMinimaLetras(cadena))
                {
                    if(!verificarCantidadVocalesJuntas(cadena))
                    {
                        if(!verificarCantidadConsonantesJuntas(cadena))
                        {
                            contadorDeConectores(cadena);
                            //contadorDeVerbos(cadena);
                            this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
                            resultado = true;
                        }
                    }
                }
            }
        }
        else if(verificarSiEsOracionOTexto(cadena))
        {
            if(!verificarCantidadVocalesJuntas(cadena))
            {
                if(!verificarCantidadConsonantesJuntas(cadena))
                {  
                    contadorDeConectores(cadena);
                    //contadorDeVerbos(cadena);
                    this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
                    resultado = true;
                }
            }
        }
        if(palabraValidaDeUnaLetra(cadena))
        {
            contadorDeConectores(cadena);
            //contadorDeVerbos(cadena);
            this.castellano = "Esta en castellano. Tiene " + contadorDePalabras(cadena)+" palabras, "+contadorConectores+" conectores y "+contadorVerbos+" verbos.";
            resultado = true;
        }
        if(resultado == false)
        {
            this.castellano = "La palabra o texto NO cumple las reglas del castellano";
        }
        return this.castellano;
    }

    private boolean verificarSiEsSoloPalabra(String cadena)
    {
        boolean palabra = true;
        char[] arrayChar = cadena.toCharArray();
        for(int i=0; i<arrayChar.length; i++)
        {
            if(arrayChar[i] == ' ')
                palabra = false;
        }
        return palabra;
    }

    private void retomarValores()
    {
        resultado = false;
        this.contadorConectores=0;
        this.contadorVerbos=0;
    }

    private boolean palabraValidaDeUnaLetra(String cadena)
    {
        if(cadena.length()==1)
        {
            patron = Pattern.compile("[aeouyAEOUY]");
            Matcher emparejamiento = patron.matcher(cadena);
            return emparejamiento.find();
        }
        else
            return false;
    }

    private boolean verificarLimiteLetras(String cadena)
    {
        if(cadena.length()>23)
            return false;
        else
            return true;
    }

    private boolean verificarCantidadVocalesJuntas(String cadena)
    {
        patron = Pattern.compile("([aeiouAEIOU][aeiouAEIOU]{3,})");
        Matcher emparejamiento = patron.matcher(cadena);
        return emparejamiento.find();
    }

    private boolean verificarCantidadConsonantesJuntas(String cadena)
    {
        patron = Pattern.compile("([bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ][bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ]{4,})");
        Matcher emparejamiento = patron.matcher(cadena);
        return emparejamiento.find();
    }

    private boolean verificarCantidadMinimaLetras(String cadena)
    {
        if(cadena.length()>=2)
            return true;
        else
            return false;
    }

    private boolean verificarSiEsOracionOTexto(String cadena)
    {
        int contadorLetras=0;
        boolean palabraValida = true;
        boolean resultado = true;
        char[] arrayChar = cadena.toCharArray();
        for(int i=0; i<arrayChar.length; i++)
        {
            if(arrayChar[i] == ' ' ||arrayChar[i] == '.')
            {
                if(contadorLetras>23)
                {
                    palabraValida=false;
                    contadorLetras=0;
                }
                else
                {
                    palabraValida=true;
                    contadorLetras=0;
                } 
            }
            else
            {    
                contadorLetras+=1;    
            }
            if(palabraValida==false)
                resultado=false;
        }
        return resultado;
    }

    public int contadorDePalabras(String cadena)
    {
        int contadorPalabras = 1;
        char[] arrayChar = cadena.toCharArray();
        for(int i=0; i<arrayChar.length; i++)
        {
            if(arrayChar[i] == ' ')
                contadorPalabras+=1;
        }
        return contadorPalabras;
    }

    private void contadorDeConectores(String cadena)
    {
        try {
            int a=0;
            int c=0;
            final BufferedReader reader = new BufferedReader(new FileReader("Conectores.txt"));
            char[] arrayChar = cadena.toCharArray();
            String line = "";
            while((line = reader.readLine())!= null){
                String conector = "";
                for(int i=0; i<arrayChar.length; i++)
                {
                    if(arrayChar[i] == ' ' || arrayChar[i] == '.')
                    {
                        for(a=i-c; a<c; a++)
                        {
                            conector = conector+(arrayChar[a]);
                        }
                        if(line.indexOf(conector)!= -1){
                            this.contadorConectores+=1;
                        }
                        conector="";
                        a=0;
                        c=0;
                    }
                    else
                    {
                        c=c+1;
                    }    
                }

            }reader.close();

        } catch (FileNotFoundException e) {
        } catch (IOException           e) {           
        } catch (IndexOutOfBoundsException           e) {
        }
    }

    private void contadorDeVerbos(String cadena)
    {
        try {
            int a=0;
            int c=0;
            final BufferedReader reader = new BufferedReader(new FileReader("NuevoVerbos.txt"));
            char[] arrayChar = cadena.toCharArray();
            String line = "";
            while((line = reader.readLine())!= null){
                String verbo = "";
                for(int i=0; i<arrayChar.length; i++)
                {
                    if(arrayChar[i] == ' ' || arrayChar[i] == '.')
                    {
                        for(a=i-c; a<c; a++)
                        {
                            verbo = verbo+(arrayChar[a]);
                        }
                        if(line.indexOf(verbo)!= -1){
                            this.contadorVerbos+=1;
                        }
                        verbo="";
                        a=0;
                        c=0;
                    }
                    else
                    {
                        c=c+1;
                    }    
                }

            }reader.close();

        } catch (FileNotFoundException e) {
        } catch (IOException           e) {           
        } catch (IndexOutOfBoundsException           e) {
        }
    }
}

