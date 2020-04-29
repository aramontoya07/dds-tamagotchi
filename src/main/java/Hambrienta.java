public class Hambrienta implements EstadoMascota {

    public void comer(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());
    }

    public void jugar(Mascota mascota) {

    }

    public boolean puedeJugar(Mascota mascota) {
        return false;
    }
}
