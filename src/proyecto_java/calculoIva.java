
package proyecto_java;


public class calculoIva {
    
 double precio,porIva,precio2,porIva2;

    public calculoIva() {
    }

    public calculoIva(double precio, double porIva, double precio2, double porIva2) {
        this.precio = precio;
        this.porIva = porIva;
        this.precio2 = precio2;
        this.porIva2 = porIva2;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorIva() {
        return porIva;
    }

    public void setPorIva(double porIva) {
        this.porIva = porIva;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public double getPorIva2() {
        return porIva2;
    }

    public void setPorIva2(double porIva2) {
        this.porIva2 = porIva2;
    }
    
    public double iva(double porIva, double precio){
        double iv;
        iv=(this.porIva*this.precio/100);
        return iv;
    }
    public double calIva ( calculoIva dato){
        double pv,Iv;
        
        Iv=dato.iva(porIva, precio);
        pv=(this.precio+Iv);
        return pv;
    }
    
    public double Iva(double precio2, double porIva2){
        double IV;
        IV=(this.precio2*this.porIva2/100);
        return IV;
    }
    public double sinIva(calculoIva dato){
        double sv,I;
        I=dato.Iva(precio2, porIva2);
        
        sv=(this.precio2-I);
        return sv;
    }
}

