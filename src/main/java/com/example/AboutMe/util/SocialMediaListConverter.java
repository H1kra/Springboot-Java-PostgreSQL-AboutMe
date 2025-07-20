package com.example.AboutMe.util;
/*
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.example.AboutMe.model.User.SocialMediaEntry; // Import the nested class correctly


@Converter
public class SocialMediaListConverter implements AttributeConverter<List<SocialMediaEntry>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<SocialMediaEntry> socialMediaList) {
        if (socialMediaList == null || socialMediaList.isEmpty()) {
            return null;
        }
        try {
            return objectMapper.writeValueAsString(socialMediaList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting List<SocialMediaEntry> to JSON string", e);
        }
    }

    @Override
    public List<SocialMediaEntry> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return new ArrayList<>();
        }
        try {
            return objectMapper.readValue(dbData, new TypeReference<List<SocialMediaEntry>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Error converting JSON string to List<SocialMediaEntry>", e);
        }
    }
}

public class SocialMediaListConverter {
}
*/