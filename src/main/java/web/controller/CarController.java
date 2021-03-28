package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carService = new CarService(count);

        List<Car> cars =  carService.returnCar(carService.getSize()).stream()
                .limit(carService.getSize())
                .collect(Collectors.toList());
        model.addAttribute("carlist", cars);
        return "car";
    }
}
