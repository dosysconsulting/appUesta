/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.List;

/**
 *
 * @author ia
 */
public interface Operaciones<T> {
    public boolean crear(T dto);
    public boolean actualizar(T dto);
    public boolean borrar(Long pk);
    public T consultaPK(Long PK);
    public List<T> consultaTodos();
}
