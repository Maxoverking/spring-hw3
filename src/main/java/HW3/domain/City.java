package HW3.domain;

public class City {
  private String city;

  public City() {

  }
  public City(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = String.valueOf(city);
  }

  @Override
  public String toString() {
    return city + "";
  }
}
