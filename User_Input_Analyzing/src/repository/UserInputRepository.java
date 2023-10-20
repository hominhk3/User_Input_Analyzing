package repository;

import data_access.UserInputDao;
import model.InputData;

public class UserInputRepository implements IUserInputRepository {

    @Override
    public void getNumber(String s, InputData data) {
        UserInputDao.Instance().getNumber(s, data);
    }

    @Override
    public void getCharacter(String s, InputData data) {
        UserInputDao.Instance().getCharacter(s, data);
    }
}
