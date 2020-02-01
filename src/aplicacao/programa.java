package aplicacao;

import dominio.Pessoa;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class programa {

    public static void main(String[] args){
        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "Carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Carlos da Silva2", "Carlos@gmail.com");
        Pessoa p3 = new Pessoa(null, "Carlos da Silva3", "Carlos@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto!");
    }

}
