# MicroserviciosOdontologia

##### Eureka Server user:password

https://micro-eureka.herokuapp.com/

https://micro-agenda.herokuapp.com/

https://micro-costos.herokuapp.com/

https://micro-factura.herokuapp.com/

https://micro-sistemabi.herokuapp.com/

---

##### Confimación de citas 

Para confirmar una cita se expuso el servicio https://micro-agenda.herokuapp.com/cita/{codigo} en este se confima la cita con código {codigo} para así continuar con la transacción de generar la factura
---

##### Cloud AMQP details

* Server	spider.rmq.cloudamqp.com
* User & Vhost	ktratqdk
* Password	qnA-nAc10I2xRisZ2i_34Psu7_5qOKBe
* AMQP URL	amqp://ktratqdk:qnA-nAc10I2xRisZ2i_34Psu7_5qOKBe@spider.rmq.cloudamqp.com/ktratqdk

---

##### Exchanges

* udea.odontologia.citasolicitada

---

##### Queues

* udea.odontologia.agenda.citaconfirmada
* udea.odontologia.centrocostos.centrocostosasignado
* udea.odontologia.cita.citasolicitada
* udea.odontologia.factura.facturacreada

---

##### Routing Keys

* confirmacion -> udea.odontologia.agenda.citaconfirmada
* centrocostos -> udea.odontologia.centrocostos.centrocostosasignado
* solicitud -> udea.odontologia.cita.citasolicitada
* facturacion -> udea.odontologia.factura.facturacreada
* confirmacion,centrocostos,solicitud,facturacion -> udea.odontologia.sistemabi

---

### Integrantes

* William Hincapié Medina
* Juan Pablo Ospina Herrera
* Luis Fernando Orozco Orozco
