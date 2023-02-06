package com.spartaglobal.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// {"name":"Archie","dob":"2018-08-15","priority":2}
//<Cat><name>Fred</name><dob>2023-01-15</dob><priority>0</priority></Cat>


public class CatDriver {
    public static void main(String[] args) {
        Cat angel = new Cat("Angel", LocalDate.of(2015,3,5),0);
        System.out.println(angel);

        CatConverter conv = new CatConverter();

        try{
            System.out.println(conv.objectToJson(angel));
            System.out.println(conv.objectToXml(angel));
            Cat archie = conv.jsonToObject("{\"name\":\"Archie\",\"dob\":\"2018-08-15\",\"priority\":2}");
            System.out.println(archie);
            Cat fred = conv.xmlToObject("<Cat><name>Fred</name><dob>2023-01-15</dob><priority>0</priority></Cat>");
            System.out.println(fred);

            List<Cat> cats = new ArrayList<>();
            cats.add(archie);
            cats.add(angel);
            cats.add(fred);
            var result= conv.objectToJson(cats);
            System.out.println(result);
            System.out.println(result);

            // writeValue Saves to file
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("src/main/resources/cats.json"), cats);
            XmlMapper xmlmapper = new XmlMapper();
            xmlmapper.writeValue(new File("src/main/resources/cats.xml"), cats);


        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

}
