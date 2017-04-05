package fi.puv.e1401159.adsl.controller;

/*import java.io.FileReader;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import fi.puv.e1401159.adsl.model.Wifi;
import fi.puv.e1401159.adsl.repository.WifiRepository;


@RestController
public class WifiController {
	@Autowired
	private WifiRepository repository;
	private static final Logger log = LoggerFactory.getLogger(WifiController.class);

    @RequestMapping(value = "/wifi" , method = RequestMethod.POST)
    public @ResponseBody Wifi addWifi(@RequestBody Wifi jsonWifi) {
    	repository.save(jsonWifi);

    	
    	
        return jsonWifi;
    }  	
	
     
}
