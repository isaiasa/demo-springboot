package br.com.wswork.demospring.controller;

import br.com.wswork.demospring.dto.ExampleDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExampleController {

    // http://localhost:8080/myfirstendpoint/examples
    @RequestMapping(value="/myfirstendpoint/examples", method = GET)
    public List<ExampleDTO> listExamples() {

        List<ExampleDTO> list = new ArrayList<>();

        list.add(new ExampleDTO("Isaias Alves","51888885555","isaias@wswork.com.br"));
        list.add(new ExampleDTO("José inocêncio","559985645","jose@wswork.com.br"));

        list.add(new ExampleDTO("Joseph Climber","9999999999999","joseph@wswork.com.br"));



        return list;
    }

}
