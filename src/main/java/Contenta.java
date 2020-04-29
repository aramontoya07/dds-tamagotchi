public class Contenta implements EstadoMascota {

    int vecesQueJugo = 0;

    public void comer(Mascota mascota) {
        mascota.aumentarNivelDeFelicidad(1);
    }

    public void jugar(Mascota mascota) {
        this.vecesQueJugo++;
        mascota.aumentarNivelDeFelicidad(2);

        if(this.vecesQueJugo > 5){
            mascota.cambiarEstado(new Hambrienta());
        }
    }

    public boolean puedeJugar(Mascota mascota) {
        return true;
    }
}
