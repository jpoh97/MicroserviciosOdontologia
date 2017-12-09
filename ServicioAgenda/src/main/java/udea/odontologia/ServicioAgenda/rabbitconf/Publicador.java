package udea.odontologia.ServicioAgenda.rabbitconf;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class Publicador {

    ApplicationContext cxt = new AnnotationConfigApplicationContext(RabbitConf.class);
    RabbitTemplate rbt = cxt.getBean(RabbitTemplate.class);

    public void publicarMensajeAsnc(String exchange, String routingK, String mensaje){
        CompletableFuture.runAsync(()-> rbt.convertAndSend(exchange, routingK, mensaje));
    }
}
