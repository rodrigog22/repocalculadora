package gt.edu.umg.ingenieria.software.branch.calc;

public interface AdvancedOperations {
    
    public long factorial(int n);
    
    public int mod(int dividendo, int divisor) throws Exception;
    
    public long mod(long dividendo, long divisor) throws Exception;
    
    public long sqr(int base);
    
    /**
     * Retorna la base elevada a la potencia 2
     * @param base
     * @return x^2
     */
    public long sqr(long base);
    
    public long pow(long base, int exponent);
    
    public long sqrt(int a);
    
    public long abs(int a);
    
    /**
     * Retorna el valor de la constante Pi
     * @return El valor de pi con al menos 15 decimales
     */
    public double pi();
}
