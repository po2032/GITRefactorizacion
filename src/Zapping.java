public class Zapping {
    public int canales(int canalOrigen, int canalDestino) {

        int salida = Math.abs(canalOrigen - canalDestino);
        if (salida > 49) {
            salida = 99 - salida;
        }
        return salida;
    }
}
