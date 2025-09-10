package com.mainbackend.techjourneynavigator.Controller;

import com.mainbackend.techjourneynavigator.Model.InputParameters;
import com.mainbackend.techjourneynavigator.Service.InputOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/plantrip")
public class RouteController {
    @Autowired
    InputOutput inputOutput;

    @PostMapping("/sendReq")
    public ResponseEntity<String> sendParameter(@RequestBody InputParameters inputParameters) {
        return inputOutput.sendparameters(inputParameters);
    }
}
