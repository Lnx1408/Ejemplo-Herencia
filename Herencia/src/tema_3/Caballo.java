package tema_3;

public class Caballo extends Animal{
private int numeroCompetencia;
private String nombreJinete;

// --------- Getter & Setter ------- 
    public void setNumeroCompetencia(int numeroCompetencia){
        this.numeroCompetencia = numeroCompetencia;
    }
    
    public void setNombreJinete(String nombreJinete){
        this.nombreJinete = nombreJinete;
    }
    
    public String getNombreJinete(){
        return this.nombreJinete;
    }
    
    public int getNumeroCompetencia(){
        return this.numeroCompetencia;
    }
// -----------------------------------------
    
// ---------- Constructor ----------
public Caballo(String Nombre, int numeroCompetencia, String nombreJinete){
    super(Nombre);
    this.numeroCompetencia = numeroCompetencia;
    this.nombreJinete = nombreJinete;
}

@Override
public void alimentar(){
    System.out.println("Alimentando animal antes de la competencia");
}

public void correr(){
    System.out.println("Caballo corre en carrera");
}
}