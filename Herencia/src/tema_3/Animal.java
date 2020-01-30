package tema_3;

public abstract class Animal {
    private String Nombre;  
// -------------- getter & setter -----------------
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return this.Nombre;
    }
// ----------------- Constructor -------------------
    public Animal(String Nombre){
        this.Nombre = Nombre;
    }
// ------------------ Metodos ---------------------
    public abstract void alimentar();
}
