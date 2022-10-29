package uz.khurshiddev.calorytracker.navigation

import androidx.navigation.NavController
import uz.khurshiddev.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)

}
