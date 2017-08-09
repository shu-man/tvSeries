package edu.mum.tvSeries.Controller;

import edu.mum.tvSeries.domain.Cast;
import edu.mum.tvSeries.service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hatake on 8/7/2017.
 */
@Controller
@RequestMapping("/Cast")
public class CastController {
    @Autowired
    private CastService castService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getCast() {
        return "createCast";
    }

    @RequestMapping(value = "/postCart", method = RequestMethod.POST)
    public String cartNew(Cast cast) {
        castService.createCart(cast);
        System.out.println("Successfully created");
        return "redirect:/Cast/castList";
    }

    @RequestMapping(value = "/castList", method = RequestMethod.GET)
    public String getAllCasts(Model model) {
        List<Cast> castLst = new ArrayList<>();
        castLst = castService.findAll();
        model.addAttribute("castList", castLst);
        return "castList";
    }

    @RequestMapping(value = "/castEdit/{id}", method = RequestMethod.GET)
    public String getCastById(@PathVariable int id, Model model) {
        Cast cast = castService.getCastbyId(id);
        model.addAttribute("cast", cast);
        System.out.println(cast.getCharacterName());
        return "castDetail";
    }

    @RequestMapping(value = "/Edited/{id}", method = RequestMethod.POST)
    public String updateCast(Cast cast, @PathVariable int id) {
        cast.setId(id);
        castService.castUpdate(cast);
        System.out.println(cast.getName());
        return "redirect:/Cast/castList";
    }

  /*  @RequestMapping(value = "/deletedValue", method = RequestMethod.GET)
    public String updatedList() {
        return "redirect:/Cast/castList";
    }*/

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable int id) {
        castService.castDelete(id);
        return "redirect:/Cast/castList";
    }

}
