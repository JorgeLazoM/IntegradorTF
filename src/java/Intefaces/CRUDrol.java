
package Intefaces;

import Modelo.Rol;
import java.util.List;

public interface CRUDrol {
    public List listar();
    public Rol list(int id);
    public boolean add(Rol rol);
    public boolean edit(Rol rol);
    public boolean eliminar(int id);
}
