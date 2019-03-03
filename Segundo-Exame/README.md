# ejercicio de examen
## Problema
Se tiene un sistema de streaming el cual manda una cancion (x) a los servicios de streaming correspondientes, siempre y cuando el o los servicios hayan pagado por la cancion, tendran acceso a ella y poder hacer uso lucrativo

## ¿Que patron?

# Patron de diseño OBSERVER
## ¿Como?
Pues al momento de observar los cambios que se produzcan en los servicios de streaming (Es decir que se notifique a la disquera que se produjo un cambio en uno o varios de estos) va a atender a los cambios producidos en los objetos observables y puede que ejecute algun metodo de envio de cancion a los servicios de streaming.

Yo propongo el siguiente diagrama que resolveria el problema

![Esquema](https://github.com/jayyei/Segundo-Exame/blob/master/Untitled%20Diagram%20(3).jpg)

considero que se podria notificar cuando surga algun cambio de lo que el observador quiera ver del observable, por ejemplo si quiero observar algun cambio de alguna variable en el objeto (Un booleano) que me indique sencillamente si ya pago o no, entonces el observador puede actuar de forma especifica, en este caso enviar la cancion a uno o varios servicios de musica.

Tambien podria aplicar el caso cuando los servicios de streaming tengan que notificar a otras disqueras que ya se hizo el pago para poder acceder a las canciones de otras disqueras. Esto con el fin de añadir mas disqueras al sistema.

