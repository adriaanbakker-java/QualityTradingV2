package nl.qualitytrading.frontend.controller;

import nl.qualitytrading.backend.service.backend.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/frontendservice")
public class FrontendController {

    @Autowired
    private BackendService backendService;

    @GetMapping("/geefdatabasenaam")
    public String geefDatabaseName() {
        return "databasenaam is " + backendService.geefDatabasenaam();
    }


}
