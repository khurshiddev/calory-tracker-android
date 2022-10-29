package uz.khurshiddev.core.util

sealed class UiEvent{
    data class Navigate (val route: String):UiEvent()
    object NavigateUp: UiEvent()
}
