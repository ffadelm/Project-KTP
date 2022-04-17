/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.projectKTP.coba;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author MSI
 */
@Controller
public class dummyController {
    DummyJpaController dummyController = new DummyJpaController();
    List<Dummy> data = new ArrayList<>();
    
    @RequestMapping("/create")
    @ResponseBody
    public List<Dummy> getDummy( ){
        try{
            data =  dummyController.findDummyEntities();
        }catch(Exception e){
            e.getMessage();
        }
//        model.addAttribute("goDummy", data);
        return data;
    } 
}
