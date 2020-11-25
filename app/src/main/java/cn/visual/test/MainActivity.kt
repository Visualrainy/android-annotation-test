package cn.visual.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.visual.annotatioinn.MyAnnotation

@MyAnnotation("123123")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}