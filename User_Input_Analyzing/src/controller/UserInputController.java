package controller;

import common.Validation;
import model.InputData;
import repository.UserInputRepository;

public class UserInputController {

    Validation valid;
    UserInputRepository repo;
    InputData data;

    public UserInputController() {
        valid = new Validation();
        repo = new UserInputRepository();
        data = new InputData();
    }

    public void run() {
        System.out.println("===== Analysis String program ====");
        String s = valid.inputString("Input String");
        System.out.println("-----Result Analysis------");
        repo.getNumber(s, data);
        repo.getCharacter(s, data);
    }
}
