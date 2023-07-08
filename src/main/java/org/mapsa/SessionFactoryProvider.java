package org.mapsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.Practice24Part1.Author;
import org.mapsa.Practice24Part1.Author_Detail;
import org.mapsa.Practice24Part1.Category;
import org.mapsa.Practice24Part1.Post;
import org.mapsa.Practice24Part2.Album;
import org.mapsa.Practice24Part2.Artist;
import org.mapsa.Practice24Part2.Artist_Detail;
import org.mapsa.Practice24Part2.Song;
import org.mapsa.entities.*;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            //cfg.addAnnotatedClass(User.class);
           // cfg.addAnnotatedClass(Credential.class);
           // cfg.addAnnotatedClass(Address.class) ;
           // cfg.addAnnotatedClass(Permission.class);
            //cfg.addAnnotatedClass(Role.class);
           // cfg.addAnnotatedClass(Song.class);
           // cfg.addAnnotatedClass(Artist.class);
           // cfg.addAnnotatedClass(Artist_Detail.class);
           // cfg.addAnnotatedClass(Album.class);
            cfg.addAnnotatedClass(Author.class);
            cfg.addAnnotatedClass(Post.class);
            cfg.addAnnotatedClass(Author_Detail.class);
            cfg.addAnnotatedClass(Category.class);
            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
