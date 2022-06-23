package com.zonadeportivaplus.ninjalapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zonadeportivaplus.ninjalapp.R;

public class CategoriaFragment extends Fragment {

    LinearLayout chi,btv,channel24,rtv,news24,independent, jamona;

    private  String url_channel_chi = "https://rhridoy136.shortcm.li/channeli.m3u8";
    private  String url_channel_btv = "https://rhridoy136.shortcm.li/btvworld.m3u8";
    private  String url_channel_channel24 = "https://rhridoy136.shortcm.li/channel24.m3u8";
    private  String url_channel_rtv = "https://rhridoy136.shortcm.li/rtv.m3u8";
    private  String url_channel_news24 = "https://vidcdn.vidgyor.com/news24-origin/liveabr/news24-origin/live1/playlist.m3u8";
    private  String url_channel_independent = "https://rhridoy136.shortcm.li/independenttv.m3u8";
    private  String url_channel_jamona = "https://rhridoy136.shortcm.li/jamunatv.m3u8";

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


        return view;
    }
}