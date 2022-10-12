
package POO;


public class ListaCotizacion 
{
    private Cotizacion cotizaciones;
    
    public ListaCotizacion()
    {
        //apuntador principal
        cotizaciones = null;
    }
    
    public void agregar(String dias, String destino, String habitacion, 
            String pago, String subtotal, String iva, String total, String mensualidad)
    {
        //Creamos e inicializamos el nodo con los valores
        Cotizacion nuevo = new Cotizacion();
        nuevo.setCantidadDias(dias);
        nuevo.setDestinoTuristico(destino);
        nuevo.setTipoHabitacion(habitacion);
        nuevo.setTipoPago(pago);
        nuevo.setSubtotal(subtotal);
        nuevo.setIVA(iva);
        nuevo.setTotalPagar(total);
        nuevo.setMensualidad(mensualidad);
        
        if(cotizaciones == null)
        {
            //Se agrega el nodo a la lista
            cotizaciones = nuevo;
        }
        else    //hay mas nodos y se agrega al final de la lista
        {
            //Se genera el apuntador auxiliar para recorrer la lista
            Cotizacion aux = cotizaciones;
            //Recorrer la lista, mediante el apuntador auxiliar
            while(aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            //Referencia el nuevo al ultimo nodo
            aux.setSiguiente(nuevo);
        }
             
    }//agregar
    
    public String recorrerDatos()
    {
        //Variable para que almacene los datos
        String datos = null;
        
        //Mostrar el contenido de la lista, siempre que no sea vacia
        //Genere un apuntador auxliar para recorrer la lista 
        
        Cotizacion aux = cotizaciones;
        
        if(cotizaciones == null)
        {
            datos = "La lista esta vacia";
        }
        else
        {
            //Recorrer la lista, mediante el apuntador auxiliar
            while(aux != null)
            {
                datos += "Cantidad de dias: "+aux.getCantidadDias()+"\n";
                datos += "Destino turistico:  "+aux.getDestinoTuristico()+"\n";
                datos += "Tipo de habitacion: "+aux.getTipoHabitacion()+"\n";
                datos += "Tipo de pago: "+ aux.getSubtotal()+"\n";
                datos += "SubTotal: "+aux.getSubtotal()+"\n";
                datos += "IVA:  "+aux.getIVA()+"\n";
                datos += " Total a pagar: "+aux.getTotalPagar()+"\n";
                datos += "Mensualidad: "+aux.getMensualidad()+"\n";
                aux = aux.getSiguiente();
            }
        }
        
        return datos;
    }
    
        //Metodo para conocer si la lista esta vacia o no
    public boolean estaVacia()
    {
        if(cotizaciones == null)
        {
            return true;
        }//if
        else 
        {
            return false;
        }//else
    
    }
    
}
