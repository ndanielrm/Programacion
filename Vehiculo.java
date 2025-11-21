public class Vehiculo {
    
    //Atributos
    String tipo;
    String marca;
    int modelo;
    String patente;

    //Constructor
    public Vehiculo(String tipo, String marca, int modelo, String patente){
        this.tipo = tipo;
        this.marca = marca; 
        this.modelo = modelo;
        this.patente = patente;
    }

    public Vehiculo(){}

    //getters y setters
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public String Patente(){
        return patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    //toString
    @Override
    public String toString(){
        return "Vehiculo: "+tipo+"\n MARCA: "+marca+" MODELO: "+modelo+" PATENTE ["+patente+"]";    
    }

    //equals y hashCode
    @Override
public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Vehiculo otrVehiculo = (Vehiculo) obj;
    return this.tipo.equals(otrVehiculo.tipo) && this.patente.equals(otrVehiculo.patente);
}

@Override
public int hashCode(){
    return tipo.hashCode() + patente.hashCode();
}

}
