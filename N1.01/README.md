# Nivel 1: Enumbres

## 📌 Enunciat del exercici
Los enumbres (enumeraciones) permiten definir un conjunto de valores constantes, dando nombres significativos y mejorando la seguridad del código. Son muy útiles para representar opciones cerradas como días de la semana, niveles de prioridad o estados de una entidad. A diferencia de los Stringo int, los enumos evitan errores por valores incorrectos y pueden incluir comportamiento (métodos).

En este nivel trabajaremos la creación de enumbres, el uso en condiciones y clases, y cómo extraer información útil a partir de ellos.

#### Ejercicios:
- Crea un nombre llamadoDay con los días de la semana. Haz una función que reciba uno Daye imprima si es laborable o fin de semana.
- Crea un enumLevel con valores LOW, MEDIUMy HIGH. Crea una clase Taskcon una propiedad Levely muestra cómo cambia el comportamiento en función del nivel.
- Añade métodos dentro del alumno y comprueba que pueden tener lógica (ej: getColor()por cada nivel de Level).
-  Convierte un Stringenum (con valueOf) y gestiona errores si el valor no es válido.

## ✨ Funcionalitats
- Enums

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- he creado la clase Enums Days con los dias de la semana
- he usado un metodo checkDays que con un switch pueda decir si es weekday or weekend.
- lo he llamado desde el main pasando un day.
- he creado la clase Tasks dandole como atributos un String task un Level level
- la clase enum Levels solo lleva los tres niveles LOW, MEDIUM, HIGH
- he creado un metodo toString en la clase Levels para poder imprimir el tipo de nivel del task.
- ### he testeado el primer paso con un AssertJ y quitado del main
- ### igual con el segundo paso, he quitado el Main y ajustado Task con TaskTest
- he copiado la clase alumndo del otro ejercicio
- he añadido el atributo Level y con un test he comprovado que por cada nivel sale un color diferente
- he creado un metodo en Alumns getEnum que pasa un String y devuelve el Level
- en testing he comprobado que si se pasa algo que no sea HIGH MEDIUM LOW el metodo lanza una excepcion