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

        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println(p);
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }

}
