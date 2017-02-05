package me.weyye.todaynews.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.weyye.todaynews.R;
import me.weyye.todaynews.base.BaseMvpFragment;
import me.weyye.todaynews.presenter.VideoPresenter;
import me.weyye.todaynews.view.IVideoView;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class VideoFragment extends BaseMvpFragment<VideoPresenter> implements IVideoView {
    @Override
    protected VideoPresenter createPresenter() {
        return new VideoPresenter(this);
    }

    @Override
    protected View loadViewLayout(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.layout_recyclerview, null);
    }

    @Override
    protected void bindViews(View view) {

    }

    @Override
    protected void processLogic() {

    }

    @Override
    protected void setListener() {

    }
}
