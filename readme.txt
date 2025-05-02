Instrucciones para completar el ejercicio GestorDeFrases.java

Objetivo:
Completar el programa agregando el código necesario para realizar operaciones con objetos de tipo String y StringBuilder, usando los métodos estudiados en "7. Gestión de Cadenas.pdf".

Indicaciones:

1. Rellenar los System.out.println(...) existentes, agregando al final de cada uno la expresión necesaria para mostrar los resultados correctos. Cada bloque incluye un comentario indicando el método que debes usar.

2. Puedes declarar variables adicionales si lo consideras necesario para almacenar resultados intermedios o facilitar la lectura del código.

3. Puedes agregar líneas de código nuevas en cualquier parte del programa, especialmente en la segunda parte (uso de StringBuilder), donde deberás construir y modificar cadenas dinámicamente. Sin embargo, no se deben añadir nuevos System.out.println( ), solo modificar el final de los existentes, ya que el código será revisado con pruebas automatizadas.

4. No elimines los comentarios ni los System.out.println(...) originales, simplemente completa el código donde haga falta.

5. Verifica que tu programa compile y se ejecute correctamente, mostrando todos los resultados esperados de forma clara.


Sugerencias útiles:
- Usa condicionales cuando sea necesario (por ejemplo, para verificar si la frase tiene al menos 10 caracteres antes de extraer una subcadena).
- Para el StringBuilder, recuerda que puedes usar múltiples métodos encadenados o hacer las modificaciones paso a paso.

Este ejercicio cubre los principales métodos de manejo de cadenas en Java:
- String: length(), charAt(), substring(), replace(), trim(), equals(), compareTo(), startsWith(), endsWith(), indexOf(), toCharArray(), toUpperCase(), toLowerCase()
- StringBuilder: append(), insert(), delete(), reverse(), replace(), capacity(), length(), setLength()


Algunas frases de prueba (para frase1 y frase2):
- frase1: " Hola mundo, esto es Java "
- frase2: "hola mundo, esto es java"

- frase1: "Cadena aleatoria para practicar Java"
- frase2: "Otra cadena con palabras aleatorias"

- frase1: "La programación es arte"
- frase2: "Los gatos caminan en silencio"