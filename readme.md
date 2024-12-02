https://github.com/PabloGrzz/ServicioProgramado.git

Este proyecto en Java proporciona un servicio de recordatorio que avisa a los usuarios cuando es hora de tomar un descanso. Los usuarios pueden configurar el intervalo de tiempo entre recordatorios, la duración del descanso y el número máximo de recordatorios que desean recibir.

Requisitos
Antes de ejecutar el programa, asegúrate de tener instalado lo siguiente:

Java Development Kit (JDK): Necesitas tener Java instalado en tu máquina. Puedes descargarlo desde
la página oficial de Oracle
o usar un gestor de paquetes como
SDKMAN
o
Homebrew
en macOS.
Un IDE: Es recomendable usar un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o NetBeans para facilitar la edición y ejecución del código.
Instalación en Windows
Instalar JDK:

Descarga el instalador del JDK desde la
página oficial de Oracle
.
Sigue las instrucciones del instalador para completar la instalación.
Configurar la variable de entorno:

Abre el Panel de Control y busca "Variables de entorno".
En "Variables del sistema", busca la variable Path y edítala.
Agrega el path a la carpeta bin del JDK instalado (por ejemplo, C:\Program Files\Java\jdk-11.0.x\bin).
Guardar el código:

Copia el código proporcionado en un archivo llamado ServicioProgramado.java.
Compilar el programa:

Abre una ventana de terminal (CMD) y navega hasta la carpeta donde guardaste ServicioProgramado.java.
Ejecuta el siguiente comando para compilar el archivo:
 
javac ServicioProgramado.java
Ejecutar el programa:

Una vez compilado, ejecuta el siguiente comando:
 
java ServicioProgramado
Uso
Ejecutar el programa: Al iniciar el programa, se te pedirá que ingreses tres valores:

Intervalo en minutos: Cada cuántos minutos quieres recibir un recordatorio.
Tiempo de descanso en minutos: Cuántos minutos quieres descansar cada vez que recibas un recordatorio.
Máximo de recordatorios: Cuántos recordatorios deseas recibir en total.
Recibir recordatorios: Una vez configurado, el programa empezará a programar recordatorios. Recibirás un mensaje emergente y un mensaje en la consola cada vez que sea hora de descansar.

Ejemplo de uso
Si ingresas 30 para el intervalo, 5 para el descanso y 10 para el máximo de recordatorios, recibirás un recordatorio cada 30 minutos para descansar durante 5 minutos, hasta un máximo de 10 recordatorios.
