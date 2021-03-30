package com.curso;
/*
Ejemplos de uso: El patrón Observer es bastante habitual en el código Java, sobre todo en los componentes GUI. 
Proporciona una forma de reaccionar a los eventos que suceden en otros objetos, sin acoplarse a sus clases.

Aquí tienes algunos ejemplos del patrón en las principales bibliotecas Java:
java.util.Observer/java.util.Observable
Todas las implementaciones de java.util.EventListener (prácticamente por todos los componentes Swing)
javax.servlet.http.HttpSessionBindingListener
javax.servlet.http.HttpSessionAttributeListener
javax.faces.event.PhaseListener
Identificación: El patrón puede reconocerse por los métodos de subscripción, que almacenan objetos en una lista, y por las llamadas al método de actualización 
emitidas a todos los objetos de esa lista.

Suscripción a eventos
En este ejemplo, el patrón Observer establece una colaboración indirecta entre objetos de un editor de texto. 
Cada vez que el objeto Editor cambia, lo notifica a sus suscriptores. 
EmailNotificationListener y LogOpenListener reaccionan a esas notificaciones ejecutando sus principales comportamientos.

Las clases suscriptoras no están acopladas a la clase editora y pueden reutilizarse en otras aplicaciones si fuera necesario. 
La clase Editor depende únicamente de la interfaz suscriptora abstracta. Esto permite añadir nuevos tipos de suscriptor sin cambiar el código del editor.
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("c://file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("fer@fer.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
