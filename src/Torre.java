public class Torre {

    // Función recursiva para resolver la Torre de Hanoi
    public static void torreDeHanoi(int n, char origen, char destino, char auxiliar) {
        // Caso base: si solo hay un disco, se mueve directamente del origen al destino
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        // Mover los n-1 discos del poste origen al poste auxiliar
        torreDeHanoi(n - 1, origen, auxiliar, destino);

        // Mover el disco más grande (n) del origen al destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Mover los n-1 discos del poste auxiliar al poste destino
        torreDeHanoi(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {
        int n = 3; // Número de discos

        // Invocamos la función para mover los n discos del poste A al poste C usando el poste B como auxiliar
        torreDeHanoi(n, 'A', 'C', 'B');
    }
}