# Este proyecto consiste en una aplicación movil sencilla, utilizando Android Studio y programacion concurrente.
- La aplicacion consta de 3 hilos (Threads) que se van alternando entre ellos para pintar una serie de botones ordenadamente.
- **Hilo 1**: Procesa los botones con `id` entre 1 y 8.
- **Hilo 2**: Procesa los botones con `id` entre 9 y 16.
- **Hilo 3**: Procesa los botones con `id` entre 17 y 24. <br><br>
Aqui 2 imagenes de la aplicacion mientras se esta ejecutando y una vez finalizada:
 <div>
 <img src="https://github.com/RaulParamio/Android-con-Hilos/blob/master/images/Captura_HilosAndroid.JPG" style="height: 20%; width:30%;"/> &nbsp;&nbsp;&nbsp;&nbsp;
 <img src="https://github.com/RaulParamio/Android-con-Hilos/blob/master/images/Captura_HilosAndroidFin.JPG" style="height: 20%; width:30%;"/>
 </div>
 <br>
 
 ## El proyecto esta estructurado en 3 clases:
 ### 1. MainActivity:
 Dentro del metodo OnCreate es donde se encuentra toda la logica de creacion de los botones. Ya que queremos mostrarlos nada mas se ejecute la aplicacion. <br>
 Tambien esta el metodo onClickEmpezar el cual es el que esta conectado con el onClick del boton "Empezar" y que sirve para lanzar los hilos.
 ### 2. Almacen:
 En esta clase gestionamos el coloreado de botones que van a realizar los hilos, esto se hace manejando los hilos con un metodo synchronized 
 llamado colorea que nos va a permitir que no se pierdan iteracciones del hilo y con la variable turnos para manejar cuando tiene que entrar y esperar cada uno.
 ### 3. RHiloDefinitivo:
 Esta clase sirve para manejar lo que tienen que hacer los hilos cuando son ejecutados a traves de sobreescribir su metodo "run()".
 Dentro del metodo, utilizamos 2 variables de rango para controlar hasta donde debe pintar cada hilo y ejecutamos el metodo colorea de Almacen.
