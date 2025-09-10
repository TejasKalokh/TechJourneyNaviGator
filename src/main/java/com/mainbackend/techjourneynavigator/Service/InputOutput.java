package com.mainbackend.techjourneynavigator.Service;

import com.mainbackend.techjourneynavigator.Model.InputParameters;
import com.mainbackend.techjourneynavigator.Repo.InputParamatersRepo;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class InputOutput {
    @Autowired
    InputParamatersRepo inputParamatersRepo;

    private final String API_KEY = "";
    private final String API_URL = "https://api.cohere.ai/v1/chat";
    public ResponseEntity<String> sendparameters(InputParameters inputParameters) {
        inputParamatersRepo.save(inputParameters);
        return TripItinerary(inputParameters);
    }

    public ResponseEntity<String> TripItinerary(InputParameters inputParameters) {
        int NumberOfDays = inputParameters.getNumberOfDays();
        Date startdate = inputParameters.getStartDate();
        Date enddate = inputParameters.getEndDate();
        String Intrests = inputParameters.getIntrests();
        String Travellingwith  = inputParameters.getTravellingwith();
        int Budget = inputParameters.getBudget();
        String country = inputParameters.getCountry();
        String PreferedModeOfTransport = inputParameters.getPreferedModeOfTransport();
        String TravelPace = inputParameters.getTravelPace();
        String MustSeeAttraction = inputParameters.getMustSeeAttraction();
        String TingsToAvoid = inputParameters.getTingsToAvoid();
        String AnySpecialInstructions = inputParameters.getAnySpecialInstructions();

        RestTemplate restTemplate = new RestTemplate();

        String prompt = "String prompt = \"You are an expert travel planner AI.\\n\\nUsing the following user preferences...\"\n" +
                "    + \"\\n- Country Of Travel : " + country + "\"\n" +
                "    + \"\\n- Prefferd Mode Of Transport : " + PreferedModeOfTransport + "\"\n" +
                "    + \"\\n- Trip Duration: " + NumberOfDays +"\"\n" +
                "    + \"\\n- Travel Start Date: " + startdate + "\"\n" +
                "    + \"\\n- Travel End Date: " + enddate + "\"\n" +
                "    + \"\\n- Interests: " + Intrests +"\"\n" +
                "    + \"\\n- Traveling With: " + Travellingwith +"\"\n" +
                "    + \"\\n- Budget : " + Budget + "\"\n" +
                "    + \"\\n- Preferred Travel Pace: " + TravelPace + "\"\n" +
                "    + \"\\n- Must-See Attractions: " + MustSeeAttraction + "\"\n" +
                "    + \"\\n- Things to Avoid: " + TingsToAvoid + "\"\n" +
                "    + \"\\n- Special Instructions: " + AnySpecialInstructions + "\"\n" +
                "    + \"\\n\\nReturn a day-by-day itinerary in structured JSON format.\";\n";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(API_KEY);

        Map<String, Object> body = Map.of(
                "model", "command-r-plus",
                "message", prompt
        );

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);

        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.POST, entity, String.class);

        return ResponseEntity.ok(response.getBody());
    }
}
