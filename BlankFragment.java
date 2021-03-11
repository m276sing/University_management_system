package com.multisoftsystem.multisoftsystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class BlankFragment extends Fragment {


    String url;
     public WebView mWebView;


     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         View v=inflater.inflate(R.layout.fragment_blank, container, false);
         mWebView = (WebView) v.findViewById(R.id.web);
         url=getArguments().getString("url").toString();
         mWebView.loadUrl(url);
                                                                                                                                                                                    // Enable Javascript
         WebSettings webSettings = mWebView.getSettings();
         webSettings.setJavaScriptEnabled(true);

         // Force links and redirects to open in the WebView instead of in a browser
         mWebView.setWebViewClient(new WebViewClient());

         return v;
     }

     public void onViewCreated(View view, Bundle savedInstanceState)
     {
         super.onViewCreated(view, savedInstanceState);

     }


 }

