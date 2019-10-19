package com.example.todosampleapp.detail;

import com.example.todosampleapp.base.BasePresenterImpl;
import com.example.todosampleapp.logic.Repository;
import com.example.todosampleapp.logic.RepositoryImpl;

public class DetailPresenter
        extends BasePresenterImpl<DetailContract.View>
        implements DetailContract.Presenter {

    Repository repository;

    DetailPresenter() {
        repository = new RepositoryImpl();
        repository.setPresenter(this);
    }

    // Item 가져오기
    @Override
    public void fetchItem(int no) {

    }
}
