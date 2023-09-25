package dev.pegasus.lifecycleobservers.dummy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import dev.pegasus.lifecycleobservers.R
import dev.pegasus.lifecycleobservers.databinding.ActivityDummyBinding

class ActivityDummy : AppCompatActivity() {

    private val binding by lazy { ActivityDummyBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        val materialButton = MaterialButton(this).apply {
            text = context.getString(R.string.go_back)
            setOnClickListener { finish() }
        }
        binding.root.addView(materialButton)
    }
}