package repository;

import model.InputData;

public interface IUserInputRepository {

    void getCharacter(String s, InputData data);

    void getNumber(String s, InputData data);

}
