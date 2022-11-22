import bd.conexionBD;
import dto.Cliente;
import logica.Apuesta;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ia
 */
public class ClienteTest {
    
    private logica.Apuesta apuesta;
    
    public ClienteTest() {

        apuesta = new Apuesta();
    }
    @Test
    public void pruebaBD() throws ClassNotFoundException{
     
    }
    //@Test
    //public void registrarNull(){
    //    boolean rta = apuesta.RegistroCliente(null);
    //    assertFalse(rta);
    //}
    
    //@Test
    //public void registarClienteSinContrasena(){
    //    boolean rta = true;
    //    Cliente cliente = new Cliente();
    //    cliente.setUsuario("pepe");
    //    //cliente.setContrasena("XXXXX");
   //     cliente.setCorreo("pepe@gmail.com");
   //     cliente.setCelular("3208528838");
   //     cliente.setCuenta("0009899");
    //    cliente.setTipoPerfil("C");
    //    if (cliente.getContrasena() == null) {
    //        rta = false;
    //    }    
    //    assertEquals(rta,false);
    //}
}
