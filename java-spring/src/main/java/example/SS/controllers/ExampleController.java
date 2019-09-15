package example.SS.controllers;

import example.SS.Data.MyObject;
import example.SS.Data.MyObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {
    @Autowired
    private MyObjectRepository repository;

    List<MyObject> objectList;

    @RequestMapping("/welcome")
    public String index(Model model){
        objectList=new ArrayList<>();
        repository.deleteAll();
        repository.save(new MyObject("str","25"));
        repository.save(new MyObject("fire","12"));
        for (MyObject myObject:repository.findAll()){
            if (myObject!=null) {
                objectList.add(myObject);
            }
        }
        model.addAttribute("objects", objectList);
        return "welcome";
    }
}
