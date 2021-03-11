package com.multisoftsystem.multisoftsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class about extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        WebView view = (WebView) findViewById(R.id.textContent);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Itronix Solution is one of the leading Advance Embedded Systems, Information Security, IT solutions &amp; Networking Training providers in India. It’s a beginning of the new Revolution in the Electronics, Cyber Space Security, IT Solutions &amp; Networking. The term ITRONIX is a union of Embedded Systems in Electronics and securing the Information Technology around the world. We feel like that there is something lagging behind our hometown Punjab, so we decided to run an industry of training to provide the solutions in various fields of the Electronics, Information Security , IT Solutions &amp; Networking. We are assuring you to keep the company – customer relationship at our best. So come and join hands with the beginning of new ITRONIX revolution.The revolt for knowledge, the mission for sharing, the promise for accomplishing the dream, and the drive for the passion had come together as ITRONIX. A dream for revolution which was started with Er. Karan Arora &amp; Mr. Varun Nayyar and Mrs. Chetna Nayyar during the college days is finally beginning. This is a revolution and we are the revolutionaries. This is the revolution in the field of the Electronics and the Information Security. During our college days, we saw people memorizing the list of programming languages, configuring hardware’s, and lots of other things. But they forgot the difference between the term learning, understanding and the memorizing. And at the end joined the same rush and got placed, but they didn’t understand and learn the things, so they didn’t survive much in the outer world. So, we all decided to run a firm that will not only help the students but also the corporate persons who work for the knowledge and use their potentials to build up their own path.";
        text+= "</p><p align=\"justify\">With many years of experience working with embedded systems, Linux, Information Security, Web Development and Networking we provide sought-after expertise in these fields. The Professional Development Courses help in honing the basic skills across platforms and methodologies while the Corporate Trainings drive enablement on specific tools and technologies. Itronix Solution has superior infrastructure and highly qualified expertise to training engineers to full fill their tasks &amp; guide them to Embedded and IT related careers. Itronix Solution has world class curriculum listed below and state-of-art Infrastructure and tools required to train the engineers on the Embedded Skills, Information Security and IT Solutions Skills to enable them to independently handle complex projects.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");
        
    }

}
