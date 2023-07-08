package org.mapsa.Practice24Part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArtistService {
    SessionFactory sessionFactory;
    public void create(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(artist);
        session.getTransaction().commit();
        session.close();
    }
    public void update(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(artist);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(artist);
        session.getTransaction().commit();
        session.close();
    }
    public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Artist artist = session.get(Artist.class , id);
        session.close();
        System.out.println(artist);
    }
}
