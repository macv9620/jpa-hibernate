package macv.hibernate.tienda.prueba;

import macv.hibernate.tienda.modelo.Producto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class RegistroDeProducto {
    public static void main(String[] args) {
        Producto celular = new Producto();
        celular.setNombre("Galaxy");
        celular.setDescripcion("Usado");
        celular.setPrecio(new BigDecimal("4500"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tienda");

        EntityManager em = factory.createEntityManager();

        em.persist(celular);
    }
}
