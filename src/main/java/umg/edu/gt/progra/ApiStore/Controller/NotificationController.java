/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.edu.gt.progra.ApiStore.Service.NotificationService;

/**
 *
 * @author J MAX
 */
@RestController 
public class NotificationController {
    
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    @GetMapping("/sendNotification")
    public String sendNotification() {
        notificationService.sendNotification("Hola este es mi mensaje, debe verse en el log tambien");
        return "Mensaje enviado";
    }    
}