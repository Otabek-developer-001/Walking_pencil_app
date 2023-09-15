package uz.developer.walkingpencilapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.developer.walkingpencilapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            startBtn.setOnClickListener {
                lottieAnim.playAnimation()
            }
            stopBtn.setOnClickListener {
                lottieAnim.pauseAnimation()
            }
        }
    }
}