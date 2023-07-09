package HW3.controller;

import HW3.domain.City;
import HW3.service.CityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CityController {

  @Autowired
  CityService cityService;

  @GetMapping("/cities")
  public String findAll(Model model){
    List<City> cityList = cityService.getAll();
    model.addAttribute("cityList", cityList);
    return "city";
  }

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String addCityForm(Model model) {
    City city = new City();
    model.addAttribute("city", city);
    return "add";
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public String addCity(Model model, @ModelAttribute("city") City city) {

    String cityName = city.getCity();

    if (cityName != null) {

      City newCity = new City(cityName);
      cityService.addCity(newCity);

      return "redirect:/cities";
    }
    return "add";
  }




}
