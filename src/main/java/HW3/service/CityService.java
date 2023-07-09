package HW3.service;

import HW3.domain.City;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CityService {

  static final List<City> cityList = new ArrayList<>();
  static {
    cityList.add(new City("London"));
    cityList.add(new City("Berlin"));
    cityList.add(new City("Tokyo"));
    cityList.add(new City("Kiev"));
  }
  public List<City> getAll() {
    return cityList;
  }
  public void addCity(City city) {
    cityList.add(city);
  }

}
