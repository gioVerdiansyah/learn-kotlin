package Collection

sealed class Fetching(){
    sealed class Success (val data: Any): Fetching()
    data class Error(val message: String): Fetching()
    object Loading: Fetching()
}

fun main(){
    val fetchingData: Fetching = Fetching.Error("Something wrong")

    when(fetchingData){
        is Fetching.Error -> println("Error while fetching:\n${fetchingData.message}")
        is Fetching.Loading -> println("Loading...")
        is Fetching.Success -> println("Success: ${fetchingData.data}")
    }
}