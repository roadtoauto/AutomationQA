package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Jackson {

    public static void parseObjectToJSON(BoardOfDirectorsModel model, String pathToFile) {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(pathToFile);
        try {
            mapper.writeValue(file, model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BoardOfDirectorsModel parseJSONToObject(String pathToFile) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        File file = new File(pathToFile);
        BoardOfDirectorsModel model = null;
        try {
            String jsonValue = FileUtils.readFileToString(file, Charset.defaultCharset());
            model = mapper.readValue(jsonValue, BoardOfDirectorsModel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
}
