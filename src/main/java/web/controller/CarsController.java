package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.List;

@Controller
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String showAllCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        List<Car> carsList = (List<Car>) CarsService.showCar(count);
        if (count == null || count >= 5) {
            model.addAttribute("carsList", carsService.showAllCars());
        } else {
            model.addAttribute("carsList", carsService.showCar(count));
        }
        return "cars";
    }

}
