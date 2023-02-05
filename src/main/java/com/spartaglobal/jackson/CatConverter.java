package com.spartaglobal.jackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class CatConverter {

    // serialise from object to JSON string
    public String objectToJson(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(o); // method writeValueAsString loads the object o and writes
        // properties and values to a String that is returned.
    }

    // serialise from object to XML string
    public String objectToXml(Object o) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(o); // same as above for XML.
    }

    // Deserialize from JSON string to an object.
    // You are saying: I want this json string to become a Cat object.
    public Cat jsonToObject(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        // Calls the readValue method (from mapper object) passing the xml string that you want
        // to convert from, and on the second argument the type/class you want the xml to be transformed into.
        Cat cat = mapper.readValue(jsonString, Cat.class);
        return cat;
    }

    // Deserialize from XML string
    public Cat xmlToObject(String xmlString) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        Cat cat = mapper.readValue(xmlString, Cat.class);
        return cat;
    }

}
