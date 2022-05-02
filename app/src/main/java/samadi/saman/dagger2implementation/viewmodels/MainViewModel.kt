package samadi.saman.dagger2implementation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import dagger.Component
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import samadi.saman.dagger2implementation.modules.DataSourceModule
import samadi.saman.dagger2implementation.modules.RepositoryModule
import samadi.saman.dagger2implementation.repositories.IMainRepository
import samadi.saman.dagger2implementation.ui.MainActivity
import java.lang.IllegalArgumentException
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: IMainRepository) : ViewModel() {

    companion object {
        const val TAG = "MainViewModel"
    }

    fun getData() = liveData(Dispatchers.IO) {
        emit(repository.getData(true))
        delay(5000)
        emit(repository.getData(false))
    }
}

@Component(modules = [DataSourceModule::class, RepositoryModule::class])
interface MainViewModelFactory {
    fun viewModel(): MainViewModel
    fun inject(activity: MainActivity): MainActivity
}