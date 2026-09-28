# Nivel 2: Fechas y horas

## 📌 Enunciat del exercici
Trabajar con fechas y horas es fundamental en muchos proyectos. Java ofrece la API java.timedesde la versión 8 para hacerlo de forma robusta y clara, evitando los problemas del viejo Date.

Aprenderás a representar el tiempo con precisión ( LocalDate, LocalTime, LocalDateTime), hacer cálculos temporales, comparar fechas, formatearlas y trabajar con agendas o planificaciones. Es una herramienta clave para desarrollar aplicaciones que dependen del calendario.

### Ejercicios:
- Muestra la fecha y hora actual con LocalDate, LocalTimey LocalDateTime.
- Calcula la diferencia entre dos fechas (con Periodo Duration).
- Añade o resta días, meses u horas a una fecha.
- Formata una fecha con DateTimeFormatter(en varios formatos).
- Crea una función que diga si una fecha pasada como parámetro es anterior a hoy.
- Crea una agenda con citas guardadas como y LocalDateTimemuestra las próximas.

## ✨ Funcionalitats
- Fechas y horas

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- con LocalDate.now() y LocalTime y LocalDateTime se pueden imprimir
- creando dos fechas con LocalDate.of() y creando un objeto Period, se puede llamar la diferencia entre años,meses,dias
- con plus/minusDays/Months/minutes/years etc etc se pueden añadir o restar cifras.
- 