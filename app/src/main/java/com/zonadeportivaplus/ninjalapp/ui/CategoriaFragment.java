package com.zonadeportivaplus.ninjalapp.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.zonadeportivaplus.ninjalapp.R;

public class CategoriaFragment extends Fragment implements View.OnClickListener {

    LinearLayout chi, btv, channel24, rtv, news24, independent, jamona;

    private AdView adView;

    private String url_channel_chi = "https://www.youtube.com/watch?v=v139qinZX2E&ab_channel=SOMOYTV";
    private String url_channel_btv = "https://www.youtube.com/watch?v=vw2m7BEaApk&ab_channel=RtvLive";
    private String url_channel_channel24 = "https://www.youtube.com/watch?v=9R7G3hf6j1g&ab_channel=ChanneliTv";
    private String url_channel_rtv = "https://vidcdn.vidgyor.com/news24-origin/liveabr/news24-origin/live1/playlist.m3u8";
    private String url_channel_news24 = "https://vidcdn.vidgyor.com/news24-origin/liveabr/news24-origin/live1/playlist.m3u8";
    private String url_channel_independent = "https://vidcdn.vidgyor.com/news24-origin/liveabr/news24-origin/live1/playlist.m3u8";
    private String url_channel_jamona = "https://www.youtube.com/watch?v=KedHi6fqx5w&ab_channel=JamunaTV";

    public CategoriaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categoria, container, false);

        chi = view.findViewById(R.id.chi);
        jamona = view.findViewById(R.id.jamunatv);
        btv = view.findViewById(R.id.btv);
        channel24 = view.findViewById(R.id.channel24);
        rtv = view.findViewById(R.id.rtv);
        news24 = view.findViewById(R.id.news24);

        chi.setOnClickListener(this);
        jamona.setOnClickListener(this);
        btv.setOnClickListener(this);
        channel24.setOnClickListener(this);
        rtv.setOnClickListener(this);
        news24.setOnClickListener(this);

        adView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.chi) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_chi));
            startActivity(intent);
        } else if (v.getId() == R.id.btv) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_btv));
            startActivity(intent);
        } else if (v.getId() == R.id.channel24) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_channel24));
            startActivity(intent);
        } else if (v.getId() == R.id.rtv) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_rtv));
            startActivity(intent);
        } else if (v.getId() == R.id.news24) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_news24));
            startActivity(intent);
        } else if (v.getId() == R.id.jamunatv) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_jamona));
            startActivity(intent);
        }

    }
}