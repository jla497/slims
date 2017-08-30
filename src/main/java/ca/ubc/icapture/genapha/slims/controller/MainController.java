package ca.ubc.icapture.genapha.slims.controller;

//import com.fasterxml.jackson.databind.ObjectMapper;
import ca.ubc.icapture.genapha.slims.json.UserPostJson;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import ca.ubc.icapture.genapha.slims.service.SimsUsersSearchService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController{
    
    @Autowired
    SimsUsersSearchService userSearchSvc;
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView index()
    {
      return new ModelAndView("/resources/index.html");
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public @ResponseBody String Authenticate(@RequestBody UserPostJson params ) throws JsonProcessingException{
    
        Tblsimsusers user = userSearchSvc.findUser(params);
        ObjectMapper objectMapper = new ObjectMapper();
        if(user != null){
            UserPostJson finalUser = new UserPostJson();
            finalUser.setUsername(user.getLogin());
            return  objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(finalUser); 
        }else{
        
            return null;
        }
    } 
}