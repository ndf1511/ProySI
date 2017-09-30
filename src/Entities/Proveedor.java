
package Entities;

/**
 *
 * @author Nico
 */
public class Proveedor {
    
    String proveedor;
    String telefono; 

    public Proveedor(String proveedor, String telefono) {
        this.proveedor = proveedor;
        this.telefono = telefono;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "proveedor=" + proveedor + ", telefono=" + telefono + '}';
    }
    
}
