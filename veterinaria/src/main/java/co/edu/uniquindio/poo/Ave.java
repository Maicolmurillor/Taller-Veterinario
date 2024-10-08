package co.edu.uniquindio.poo;

public class Ave {
    private int envergadura;

    public Ave(int envergadura) {
        this.envergadura = envergadura;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    @Override
    public String toString() {
        return "El ave tiene una envergadura de: " + envergadura;
    }

    public void add(Ave aves) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
