package RegistroMusicaSwing;

public class CalculoMusica 
{
    public String clasificacion(String tipo)
    {
        String clasificacion = "";
        if (tipo.equalsIgnoreCase("heavy")) 
        {
            clasificacion = "Musica tipica de EU y UK";
        }
        else
            if (tipo.equalsIgnoreCase("pop")) 
            {
                clasificacion = "Musica tipica de EU";
            }
            else
                if (tipo.equalsIgnoreCase("salsa")) 
                {
                    clasificacion = "Musica tipica de Cuba";
                }
                else
                    if (tipo.equalsIgnoreCase("samba")) 
                    {
                        clasificacion = "Musica tipica de Brasil";
                    }
                    else
                        clasificacion = "RP Pendiente";
        
        return clasificacion;
    }
    
    public double precioenvio(double precio)
    {
        double total, impuesto, ganancia;
        impuesto = precio * 0.15;
        ganancia = precio * 0.21;
        total = precio + impuesto + ganancia;
        return total;
    }
}
