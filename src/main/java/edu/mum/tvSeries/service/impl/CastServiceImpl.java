package edu.mum.tvSeries.service.impl;

import edu.mum.tvSeries.domain.Cast;
import edu.mum.tvSeries.repository.CastRepository;
import edu.mum.tvSeries.service.CastService;

import java.util.List;

/**
 * Created by Hatake on 8/7/2017.
 */
public class CastServiceImpl implements CastService {
    private CastRepository castRepository;

    public CastServiceImpl(CastRepository castRepository) {
        this.castRepository = castRepository;
    }

    @Override
    public List<Cast> findAll() {
        return castRepository.castList();
    }

    @Override
    public void createCart(Cast cast) {
    castRepository.newCast(cast);
    }
}
