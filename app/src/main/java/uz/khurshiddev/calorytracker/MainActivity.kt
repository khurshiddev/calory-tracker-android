package uz.khurshiddev.calorytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import uz.khurshiddev.calorytracker.ui.theme.CaloryTrackerTheme
import uz.khurshiddev.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CaloryTrackerTheme {
                WelcomeScreen()

            }

        }
    }
}