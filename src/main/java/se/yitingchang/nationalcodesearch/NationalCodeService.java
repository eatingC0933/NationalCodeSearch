package se.yitingchang.nationalcodesearch;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NationalCodeService {
    private final Map<String,String> countryCodes=new HashMap<>();

    public NationalCodeService() {
        countryCodes.put("US","United States");
        countryCodes.put("CA","Canada");
        countryCodes.put("GB","United Kingdom");
        countryCodes.put("AU","Australia");
        countryCodes.put("DE","Germany");
        countryCodes.put("IN","India");
        countryCodes.put("JP","Japan");
        countryCodes.put("CN","China");
        countryCodes.put("KR","Korea");
        countryCodes.put("PL","Poland");
        countryCodes.put("RU","Russia");
        countryCodes.put("SE","Sweden");

    }

    public String getCountryCode(String country) {
        return countryCodes.entrySet().stream().filter(entry -> entry.getValue().equalsIgnoreCase(country)).map(Map.Entry::getKey).findFirst().orElse("Unknown code");
    }


}
