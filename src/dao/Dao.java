// Data Acess Object
package dao;

import java.util.List;

// interface CRUD gen�rica
// <T> generics
public interface Dao<T> {

	boolean inserir(T tipo);

	boolean atualizar(T tipo);

	T buscar(long id);

	boolean apagar(long id);

	List<T> listar();

}
