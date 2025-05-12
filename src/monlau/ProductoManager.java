
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO producto =new ProductoDAOImpl();
        
        //agregar nuevo producto (Create)
        producto.insert(new Producto(200,"Pollo",10.0));
        
        //obtener el producto con el ID = 100 (Read)
        Producto p = producto.read(200);
        System.out.println(p);
        
            // Actualizar producto (Update)
        p.setNombre("Pollo Asado");
        p.setPrecio(12.5);
        producto.update(p);
        System.out.println("Producto actualizado: " + producto.read(200));

        // Eliminar producto (Delete)
        producto.delete(p);
        System.out.println("Producto eliminado. Resultado de búsqueda: " + producto.read(200));
        
    }
}
