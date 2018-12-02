package com.hibicode.workweb.beerstore.resource;

import com.hibicode.workweb.beerstore.model.Beer;
import com.hibicode.workweb.beerstore.repository.Beers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerResource {

    @Autowired
    private Beers beers;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Beer save(@RequestBody Beer beer) {
        return beers.save(beer);
    }

    @GetMapping
    public List<Beer> list() {
        return beers.findAll();
    }

}
