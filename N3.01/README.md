# Nivell 3: Records

## 📌 Enunciat del exercici
Los recuerdos son una funcionalidad moderna de Java pensada para reducir código cuando sólo queremos encapsular datos. Son inmutables por defecto, proporcionan automáticamente getters, toString, equalsy hashCode, y mejoran la legibilidad del código.

Este nivel te servirá para entender cómo crear y utilizar recuerdos, añadir lógica básica, validar valores y compararlos con clases normales. Es una herramienta muy útil para modelos de datos simples y claros.

### Ejercicios:
- Crea un recordllamado Person(String name, int age)y muestra cómo se instancia.
- Añade métodos personalizados dentro de un recuerdo.
- Crear uno recordcon validación en el constructor (ej: edad no puede ser negativa).
- Crea una lista de Persony filtra con lambdas y streams (ej: mostrar sólo los mayores de edad).
- Compara un recuerdo con una clase tradicional y comenta las diferencias en legibilidad y utilidad.

## ✨ Funcionalitats
- records

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- he creado la clase record Person, instanciando los atributos en parentesis
- le he puesto un metodo getName() en el recuerdo
- para validar el constructor he puesto un if directamente en el constructor y validado con un test
- he hecho una clase con la lista poeple y testeado el metodo getMajors().