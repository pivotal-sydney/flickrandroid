package io.pivotal.flickrandroid.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.pivotal.flickrandroid.FlickrApplication;
import io.pivotal.flickrandroid.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.cat)
    ImageView cat;

    @Inject
    Picasso picasso;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FlickrApplication.getFlickrApplication().getFlickrComponent().inject(this);
        View view = View.inflate(this, R.layout.activity_main, null);
        setContentView(view);
        ButterKnife.bind(this);
        picasso.load("https://i.ytimg.com/vi/tntOCGkgt98/maxresdefault.jpg").into(cat);
    }
}
