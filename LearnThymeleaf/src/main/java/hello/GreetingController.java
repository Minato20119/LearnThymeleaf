package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class GreetingController {

//    @GetMapping("/greeting1")
//    public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        
//        List<String> lists = new ArrayList<>();
//        lists.add("1");
//        lists.add("2");
//        lists.add("3");
//        lists.add("Long");
//        
//        HashMap<Integer, Object> object = new HashMap<>();
//        
//        Person person = new Person();
//        person.setId(1);
//        person.setName("Name Person");
//        
//        Animal animal = new Animal();
//        animal.setIdAnimal(1);
//        animal.setNameAnimal("Dog");
//        
//        object.put(1, person);
//        object.put(2, animal);
//        
//       // model.addAttribute("lists", lists);
//        ModelAndView modelAndView = new ModelAndView();
//        
//        modelAndView.setViewName("greeting");
//        modelAndView.addObject("lists", lists);
//        
//        modelAndView.setViewName("greeting");
//        modelAndView.addObject("ob", object);
//        
//        System.out.println(object.get(1));
//        
//        return modelAndView;
//    }

}