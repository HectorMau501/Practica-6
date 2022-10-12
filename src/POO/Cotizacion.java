
package POO;


public class Cotizacion 
{
    
   private String cantidadDias;
   private String destinoTuristico;
   private String tipoHabitacion;
   private String tipoPago;
   private String subtotal;
   private String IVA;
   private String totalPagar;
   private String mensualidad;
   //Apuntador a la siguiente estructura
   private Cotizacion siguiente;

    public Cotizacion(String cantidadDias, String destinoTuristico, String tipoHabitacion, String tipoPago, String subtotal, String IVA, String totalPagar, String mensualidad, Cotizacion siguiente) {
        this.cantidadDias = cantidadDias;
        this.destinoTuristico = destinoTuristico;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoPago = tipoPago;
        this.subtotal = subtotal;
        this.IVA = IVA;
        this.totalPagar = totalPagar;
        this.mensualidad = mensualidad;
        this.siguiente = siguiente;
    }

   
   
    public Cotizacion() {
        this.cantidadDias = "";
        this.destinoTuristico = "";
        this.tipoPago = "";
        this.subtotal = "";
        this.IVA = "";
        this.totalPagar = "";
        this.mensualidad = "";
        this.siguiente = null;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getDestinoTuristico() {
        return destinoTuristico;
    }

    public void setDestinoTuristico(String destinoTuristico) {
        this.destinoTuristico = destinoTuristico;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(String totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Cotizacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cotizacion siguiente) {
        this.siguiente = siguiente;
    }

        
}
