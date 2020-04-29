public class Aburrida implements EstadoMascota {

    public void comer(Mascota mascota) {
        if(masDeOchentaMinutosDeMalHumor()){
            mascota.cambiarEstado(new Contenta());
        }
    }

    public boolean masDeOchentaMinutosDeMalHumor(){
        return true;
    }

    public void jugar(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());
    }

    public boolean puedeJugar(Mascota mascota) {
        return true;
    }
}
