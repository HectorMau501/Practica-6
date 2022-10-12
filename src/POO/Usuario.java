
package POO;

//LISTA ENLAZADA
public class Usuario
{
    private String usuario;
    private String contraseña;
    //Apuntador a la siguiente estructura
    private Usuario siguiente;

    public Usuario() 
    {
        this.usuario = "";
        this.contraseña = "";
        this.siguiente = null;
    }

    public Usuario(String usuario, String contraseña, Usuario siguiente)
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.siguiente = siguiente;
    }
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }

    
}
