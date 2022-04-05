/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.projectKTP;

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
public class dataController {
    
    DataJpaController dataCtrl  = new DataJpaController();
    List<Data> newdata = new ArrayList<>();
    
    @RequestMapping("/data")
    //@ResponseBody
    public String getDataKTP(Model model ){
        int record = dataCtrl.getDataCount();
        String result = "";
        try{
            newdata = dataCtrl.findDataEntities().subList(0, record);  
        }catch(Exception e){
            result = e.getMessage();
        }
        
        model.addAttribute("goData", newdata);
        return "database";
    } 
}
