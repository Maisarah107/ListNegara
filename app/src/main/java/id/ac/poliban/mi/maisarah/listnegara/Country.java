package id.ac.poliban.mi.maisarah.listnegara;

public class Country {
    private String flag;
    private String countryName;
    private String countryDesc;

    public Country(String flag, String countryName, String countryDesc) {
        this.flag = flag;
        this.countryName = countryName;
        this.countryDesc = countryDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDesc() {
        return countryDesc;
    }

    public void setCountryDesc(String countryDesc) {
        this.countryDesc = countryDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s",getCountryName(), getCountryDesc());
    }
}
