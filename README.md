Carrito
=======

Carrito es un prototipo para un carrito de compras online en la nube.

La aplicación se basa en tres tecnologías:
* Java                http://www.oracle.com/technetwork/java/javase/overview/index.html
* Google App Engine   https://developers.google.com/appengine/
* Vaadin7             https://vaadin.com/home

Construcción
---------

Los fuentes se pueden obtener de https://github.com/Magian1/Carrito.
Para obtenerlos necesitan un cliente de Git (http://git-scm.com/). Intenten con EGit (http://www.eclipse.org/egit/) si usan eclipse, si están en Linux y prefieren usar una consola y comandos generalmente el paquete para su distribución se llamará git (entonces 'app-get install git' o 'yum install git').

Una vez que tengan los fuentes tendrán un directorio con este README.md dentro del mismo, a su lado un archivo pom.xml y un directorio src/.
El archivo pom.xml indica que tienen que usar Maven (http://maven.apache.org/), version 3.0.4 al menos, para construir los paquetes. Para eso necesitan tener instalado Maven y que el subdirectorio de Maven que contiene sus ejecutables este integrado con el shell del sistema operativo que corresponda, para Windows http://geekswithblogs.net/renso/archive/2009/10/21/how-to-set-the-windows-path-in-windows-7.aspx y para Linux http://www.troubleshooters.com/linux/prepostpath.htm.

Maven se va a encargar de gestionar el ciclo de vida del proyecto (compilación, pruebas, pruebas de integración, empaquetación, despliegue, entre otras cosas) basándose en valores por defecto y el descriptor pom.xml que está en la raiz del proyecto. Cuando lo tengan instalado y configurado como se mencionó arriba, solamente tienen que ejecutar esto parado en el mismo directorio donde está el pom.xml:

  mvn clean install

La primera vez que lo ejecuten puede que tarde algunos minutos. Noten que el comando se comunica a repositorios de código remotos y se baja las dependencias del proyecto. ¿Dónde lo baja? Fíjense en su directorio de usuario, ahí van a ver un directorio llamado .m2 y dentro otro llamado repository, ese es su repositorio local de Maven.

Despliegue
-

Sobre la raiz del proyecto:

  mvn jetty:run

Esto ejecuta la aplicación utilizando un servidor web liviano que a su vez se ejecuta en sus propias máquinas, esto alcanza para hacer pruebas sencillas, por ejemplo, una vez que el comando se haya ejecutado exitósamente pueden entrar a una navegador web y navegar a la URL: http://localhost:8080/carrito

Para desplegarlo en Google App Engine hay que realizar otros pasos:
Proximamente

Subir sus cambios
-

Asegúrense de nunca subir cambios que son temporales o que tienen que ver con consecuencias secundarias del proceso de construcción o importación a Maven (este último genera un directorio con el nombre de target/ que nunca debería subirse por ejemplo). Los casos típicos se incluyen en el archivo .gitignore que está en la raiz del proyecto.

Cada grupo tiene su branch: Servicios, Persistencia y Aplicacion/Presentacion. Por el momento suban exclusivamente al branch que corresponde a su grupo y recuerden hacer 'git pull origin master' periódicamente. Para saber qué hace el comando y otros comandos de Git consulten: http://try.github.io/levels/1/challenges/1

Autores
-

Mariano Luis Silva, Miguel Angel Guido, Roberto Macieri, Daniel Icardo, [pongan sus nombres acá]

Soporte
-

cimparato@kennedy.edu.ar
