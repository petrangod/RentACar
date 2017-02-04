package main.com.controller;

import main.com.entity.IVehicle;
import main.com.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/list")
    public String listCars(Model model) {
        List<IVehicle> theCars = carService.getCars();
        model.addAttribute("cars", theCars);
        return "car-list";
    }


}
