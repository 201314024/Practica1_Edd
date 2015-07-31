

package practica1_edd;


public class Lista {
    
    public Nodo Inicio;
    public Nodo Fin;
    public int cont;
    public Lista()
    {
        Inicio=new Nodo();
        Fin=new Nodo();
        cont=0;
    }
    
    public void Insertar(Objeto o)
    {
        Nodo nuevo=new Nodo();
        Nodo aux=Inicio;
        nuevo.o=o;
        while(aux != null)
        {
            if(aux.next==null)
            {
                  cont++;
                  aux.next=nuevo;
                  nuevo.back=aux;
                  Fin=nuevo;
                  aux=null;  
     
            }
            else
            {
                aux=aux.next;
            }
                 
        
        }
    }
    public void Eliminar(Objeto o)
    {
        Nodo aux=Inicio;
        Nodo aux2=Inicio;
        
        while(aux != null)
        {
            
            if(aux.next.o==o)
            {
               if(aux.next==Fin)
               {
                   aux.next.back=null;
                   aux.next=null;
               }
               else
               {
                   aux2=aux.next.next;
                   aux2.back=aux;
                   aux.next.back=null;
                   aux.next.next=null;
                   aux.next=aux2;
               }
                aux=null;
            }
            else
            {
                aux=aux.next;
            }
                 
        
        }
    }
    public void mostrar()
    {
        Nodo aux=Inicio;
        while(aux != null)
        {
            System.out.println(aux.o.nombre);
            aux=aux.next;
        }
        aux=Fin;
        while(aux != null)
        {
            System.out.println(aux.o.nombre);
            aux=aux.back;
        }
        
    }
    
}
