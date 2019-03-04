package gt.edu.umg.ingenieria.software.branch.calc;

public interface BasicOperations {
    
    public int sumar(int sumando1, int sumando2);
    
    public long sumar(long sumando1, long sumando2);
    
    public float sumar(float sumando1, float sumando2);
    
    public double sumar(double sumando1, double sumando2);
    
    public int restar(int minuendo, int sustraendo);
    
    public long restar(long minuendo, long sustraendo);
    
    public float restar(float minuendo, float sustraendo);
    
    public double restar(double minuendo, double sustraendo);
    
    public int multiplicar(int multiplicando, int multiplicador);
    
    public long multiplicar(long multiplicando, long multiplicador);
    
    public float multiplicar(float multiplicando, float multiplicador);
    
    public double multiplicar(double multiplicando, double multiplicador);
    
    public int dividir(int dividendo, int divisor) throws Exception;
    
    public long dividir(long dividendo, long divisor) throws Exception;
    
    public float dividir(float dividendo, float divisor) throws Exception;
    
    public double dividir(double dividendo, double divisor) throws Exception;
    
}
