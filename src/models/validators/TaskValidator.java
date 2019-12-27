package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List <String> validate(Task task) {
        List<String> errors = new ArrayList<String>();

        String task_error = _validateTask(task.getContent());
        if(!task_error.equals("")) {
            errors.add(task_error);
        }
        return errors;
    }


    private static String _validateTask(String content) {
        if(content == null || content.equals("")) {
            return "タスクを入力してください";
        }

        return "";
    }
}


