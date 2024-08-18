/** 
 * <h1>Classe Usuario</h1>
 * Classe criada para utilização da classe smartTv
 * <p>
 * 
 * @author Wallace Goulart
 * @version 1.0
 * @since 18/08/2024
*/

public class Usuario {

    public static void main (String[] adgs) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada ? "TV ligada" : "TV desligada");
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada ? "TV ligada" : "TV desligada");

        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(10);


    }
    
}
