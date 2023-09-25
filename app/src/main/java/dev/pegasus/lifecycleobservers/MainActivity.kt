package dev.pegasus.lifecycleobservers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.pegasus.lifecycleobservers.databinding.ActivityMainBinding
import dev.pegasus.lifecycleobservers.defaults.ActivityDefaultLifeCycleObserver
import dev.pegasus.lifecycleobservers.lifecycle.ActivityLifecycleOwner
import dev.pegasus.lifecycleobservers.lifecycleEvent.ActivityLifecycleEventObserver

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.mbLifecycleObserver.setOnClickListener { startActivity(Intent(this, ActivityLifecycleOwner::class.java)) }
        binding.mbDefaultObserver.setOnClickListener { startActivity(Intent(this, ActivityDefaultLifeCycleObserver::class.java)) }
        binding.mbLifecycleEventObserver.setOnClickListener { startActivity(Intent(this, ActivityLifecycleEventObserver::class.java)) }
    }
}