package dev.ismailtezal.devTest.model.courses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private String question;
    private ArrayList<String> choices;
    private int correctAnswer;

}
