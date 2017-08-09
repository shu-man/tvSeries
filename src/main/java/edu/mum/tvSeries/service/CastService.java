package edu.mum.tvSeries.service;

import edu.mum.tvSeries.domain.Cast;

import java.util.List;

/**
 * Created by Hatake on 8/7/2017.
 */
public interface CastService {

    public List<Cast> findAll();
    public void createCart(Cast cast);
    public Cast getCastbyId(int castId);
    public void castUpdate(Cast cast);
    public void castDelete(int castId);
}
