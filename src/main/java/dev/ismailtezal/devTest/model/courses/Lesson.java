package dev.ismailtezal.devTest.model.courses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    private String lessonName;
    private String lessonDuration;
    private List<Question> questions;

    // Getter ve Setter metotları
}

