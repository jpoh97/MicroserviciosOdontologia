package udea.odontologia.ServicioAgenda.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import udea.odontologia.ServicioAgenda.rabbitconf.Publicador;

@RestController
public class AgendaController {
    Publicador publicador = new Publicador();

    @RequestMapping(method= RequestMethod.GET,value="/cita/{codigo}")
    public String confirmarCita(@PathVariable String codigo){
        try{
            publicador.publicarMensajeAsnc("udea.odontologia.citasolicitada","confirmacion", codigo);
            return "Cita Confirmada";
        }catch(Exception e){
            return "Cita no confirmada, por favor intente mas tarde";
        }

    }
}
