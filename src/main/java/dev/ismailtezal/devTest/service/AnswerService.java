package dev.ismailtezal.devTest.service;

import dev.ismailtezal.devTest.model.courses.Answer;
import dev.ismailtezal.devTest.repository.AnswerRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
    @SneakyThrows
    public void executePythonScript() {
        try {
            String scriptPath = "predict.py";
            String command = "python " + scriptPath;
            String currentDirectory = System.getProperty("user.dir");
            File scriptDirectory = new File(currentDirectory + "/src/python-scripts");

            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.directory(scriptDirectory);
            Process process = processBuilder.start();

            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                System.err.println(errorLine);
            }

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Predict.py Çalıştı!");
            } else {
                System.out.println("Hatayla Karşılaşıldı. Hata kodu : " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void saveAnswer(Answer answer){
        answerRepository.deleteAll();
        answerRepository.save(answer);
    }

    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }

}