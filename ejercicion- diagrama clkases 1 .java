+----------------------+
|       Agencia        |
+----------------------+
+----------------------+

+----------------------+
|       Garaje         |
+----------------------+
+----------------------+

+----------------------+
|      Cliente         |
+----------------------+
| - dni: String        |
| - nombre: String     |
| - direccion: String  |
| - telefono: String   |
| - codigoUnico: String|
+----------------------+
| + reservas: Reserva[]|
| + avaladoPor: Cliente|
+----------------------+

+----------------------+
|       Reserva        |
+----------------------+
| - fechaInicio: Date  |
| - fechaFinal: Date   |
| - precioTotal: float |
| - entregado: boolean |
+----------------------+
| + cliente: Cliente   |
| + coches: Coche[]    |
| + agencia: Agencia   |
+----------------------+

+----------------------+
|        Coche         |
+----------------------+
| - matricula: String  |
| - modelo: String     |
| - color: String      |
| - marca: String      |
+----------------------+
| + garaje: Garaje     |
+----------------------+
