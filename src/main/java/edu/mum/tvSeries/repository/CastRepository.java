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
       /* Query query = session.createQuery("from Cast");
        return query.list();
*/
        List<Cast> casts = (List<Cast>) session.createQuery("from Cast").list();
        for (Cast cast : casts) {
            System.out.println(cast.getName());
        }
        return casts;
    }

    @Transactional
    public void newCast(Cast cast) {
        try {
            Session session = sf.getCurrentSession();
            session.persist(cast);
        } catch (Exception e) {
            System.out.println("Exception is:" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Transactional
    public Cast getCastbyId(int castId) {
        Session session = sf.getCurrentSession();
        Cast cast = (Cast) session.get(Cast.class, castId);
        return cast;
    }

    @Transactional
    public void castUpdate(Cast cast) {
        Session session = sf.getCurrentSession();
        session.update(cast);
    }

    @Transactional
    public void castDelete(int castId) {
        Session session = sf.getCurrentSession();
        Cast cast = (Cast) session.get(Cast.class, castId);
        if (cast != null) {
            session.delete(cast);
        }
    }
}
