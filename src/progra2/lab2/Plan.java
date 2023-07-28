package progra2.lab2;

public abstract class Plan {
  
    private String numerodetelefono;
    private String numerodecliente;

    public Plan(String numerodetelefono, String numerodecliente) {
        this.numerodetelefono = numerodetelefono;
        this.numerodecliente = numerodecliente;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public String getNumerodecliente() {
        return numerodecliente;
    }
    
    abstract double pagoMensual(int mins, int msgs);
    
    public void imprimir(){
        System.out.println("numerodetelefono"+numerodetelefono);
        System.out.println("numerodecliente"+numerodecliente);
    }
      
}