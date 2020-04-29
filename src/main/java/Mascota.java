public class Mascota {

    int nivelDeFelicidad;
    EstadoMascota estado;

    public Mascota() {
        this.nivelDeFelicidad = 10;
        this.estado = new Contenta();
    }

    public void comer() {
       this.estado.comer(this);
    }

    public void jugar() {
       this.estado.jugar(this);
    }

    public boolean puedeJugar() {
       return this.estado.puedeJugar(this);
    }

    public int getNivelDeFelicidad() {
        System.out.println("Mi nivel de felicidad es " + nivelDeFelicidad);
       return this.nivelDeFelicidad;
    }

    public void cambiarEstado(EstadoMascota nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void aumentarNivelDeFelicidad(int cantidad) {
        this.nivelDeFelicidad += cantidad;
    }

    public void mostarEstado(){
        String nombre = this.estado.getClass().getSimpleName();
        System.out.println("Mi estado es " + nombre);
    }


}
