package com.example.session1;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String names) {
        boolean isAllUpperCase = names.equals(names.toUpperCase());
        String[] nameArray = names.split(",");
        int numOfNames = nameArray.length;
        String resultingNames = names;

        if (numOfNames > 1) {
            resultingNames = names.replace(",", ", ");
            int lastCommaIndex = resultingNames.lastIndexOf(",");
            resultingNames = resultingNames.substring(0, lastCommaIndex)
                    + ((numOfNames > 2) ? ", and " : " and ")
                    + nameArray[numOfNames - 1];
        }

        return createGreetingMessage(isAllUpperCase, resultingNames);
    }

    private String createGreetingMessage(boolean isAllUpperCase, String names) {
        if (isAllUpperCase) {
            return "HELLO, " + names.toUpperCase() + "!";
        } else {
            return "Hello, " + names + ".";
        }
    }

}
