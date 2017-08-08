package edu.mum.tvSeries.repository;

import edu.mum.tvSeries.domain.Cast;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Hatake on 8/7/2017.
 */
@Repository
public class CastRepository {
    private SessionFactory sf;

    public CastRepository(SessionFactory sf) {
        this.sf = sf;
    }

    @Transactional
    public List<Cast> castList() {
        Session session = sf.getCurrentSession();
        return session.createQuery("from Cast ").list();
    }
    @Transactional
    public void newCast(Cast cast){
        try{
            Session session=sf.getCurrentSession();
            session.persist(cast);
        }
       catch (Exception e){
           System.out.println("Exception is:"+e.getMessage());
            e.printStackTrace();
       }
    }
}
