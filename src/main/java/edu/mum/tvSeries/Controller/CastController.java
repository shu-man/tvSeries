package edu.mum.tvSeries.Controller;

import edu.mum.tvSeries.domain.Cast;
import edu.mum.tvSeries.service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hatake on 8/7/2017.
 */
@Controller
@RequestMapping("/Cast")
public class CastController {
    @Autowired
    private CastService castService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCast() {
        return "createCast";
    }
    @RequestMapping(value = "/postCart", method = RequestMethod.POST)
    public String cartNew (Cast cast) {
        castService.createCart(cast);
        System.out.println("Successfully created");
        return "createCast";
    }
}
