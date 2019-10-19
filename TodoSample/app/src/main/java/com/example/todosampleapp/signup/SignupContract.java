package com.example.todosampleapp.signup;

import android.content.ClipData;

import com.example.todosampleapp.base.BasePresenter;
import com.example.todosampleapp.base.BaseView;
import com.example.todosampleapp.model.Item;

public class SignupContract {

    public interface View extends BaseView {
        // 작성완료 ( <= Presenter)
        void saveDone();
    }

    public interface Presenter
            extends BasePresenter<View> {
        // 저장
        void save(Item item);
        // 작성완료 ( <= Repository)
        void saveDone();
    }
}
