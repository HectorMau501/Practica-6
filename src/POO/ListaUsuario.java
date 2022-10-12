
package POO;

//Implementacion de las operaciones de una lista enlazada
//con el Usuario
public class ListaUsuario 
{
    //Apuntador principal de la estructura
    public static Usuario usuarios;

    
    public ListaUsuario() 
    {
        //Inicializar el apuntador
       usuarios = null;
    }

    
    //Operaciones para agregar al final de la lista, un nod 
    public void agregar(String u, String c)
    {
        //Crear e inicializar el nodo con los valores
        Usuario nuevo = new Usuario();
        nuevo.setUsuario(u);
        nuevo.setContraseña(c);
    }
    
    public String recorrerUsuario()
    {
        //Variable que almacene los datos
        String datos = null;
        //Mostrar el contenido de la lista, siempre que no sea vacia
        //Genera un apuntador auxiliar para recorrer la lista
        Usuario aux = usuarios;
        if(usuarios == null)
        {
            datos = "La lista esta vacia";
        }//if
        else
        {
            //Recorrer la lista, mediante el apuntador auxiliar
            while(aux != null)
            {
                datos += "Usuario: "+aux.getUsuario()+"\n";
                datos += "Contraseña:" +aux.getContraseña()+"\n";
                aux = aux.getSiguiente(); //Avanza hacia el siguiente nodo
            }//while
        }//esle
        return datos;
    }//recorrerUruario
    
    //Metodo para conocer si la lista esta vacia o no 
    public boolean estaVacia()
    {
        if(usuarios == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//esta vacia
    
    
     public boolean buscarDato(String u, String c)
    {
        Usuario aux = usuarios;
        int pos =1 ; //Establecer posicion del valor encontrado
        boolean encontrado = false;
        
        if(usuarios == null)
        {
            encontrado = false;
        }
        else{
            while(aux != null) //recorrer lista
            {
                if(u.equals(aux.getUsuario()) && c.equals(aux.getContraseña()))//comparacion
                {
                  
                    encontrado = true;      
                }
               
                aux = aux.getSiguiente(); // Avanzar al siguiente nodo
            }
        }
            
        return encontrado;
        
    } 

}//class
