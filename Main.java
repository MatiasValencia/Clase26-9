interface SeComunica {
    void seComunica();
}

class Animal implements SeComunica{
    private String nombre;
    private String color;
    private int edad;
    private int extremidades;

    public Animal(){};
    public Animal(String nombre, String color, int edad, int extremidades) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.extremidades = extremidades;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getColor() {
        return this.color;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getExtremidades() {
        return this.extremidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public void seComunica() {
        System.out.println("Soy un animal");
    };
}

class Mamifero extends Animal {
    // true -> terrestre | else -> acuatico
    boolean tipoHabitat;
    public Mamifero(boolean tipoHabitat) {
        super();
        this.tipoHabitat = tipoHabitat;
    }
    public Mamifero(String nombre, String color, int edad, int extremidades, boolean tipoHabitat) {
        super(nombre, color, edad, extremidades);
        this.tipoHabitat = tipoHabitat;
    }
    public boolean getTipoHabitat() {
        return this.tipoHabitat;
    }
    public void seComunica() {
        if(tipoHabitat = false) {
            System.out.println("Se comunica por ondas");
            return;
        }
        System.out.println("Se comunica por aire");
    }
}

class Reptil extends Animal {
    public Reptil() {
        super();
    }
    public Reptil(String nombre, String color, int edad, int extremidades) {
        super(nombre, color, edad, extremidades);
    }
    public void seComunica() {
        System.out.println("Se comunica por aire, pero soy reptil");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal []listaAnimales = new Animal[10];
        String entrada = "mamifero";
        if (entrada == "mamifero") {
            listaAnimales[0] = new Mamifero(false);
        }
    }
}