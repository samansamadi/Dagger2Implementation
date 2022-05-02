package samadi.saman.dagger2implementation.datasource.local

import samadi.saman.dagger2implementation.data.local.MainDao
import javax.inject.Inject

class MainLocalDataSource : IMainLocalDataSource {

    companion object {
        const val TAG = "MainLocalDataSource"
    }

    override fun getData() = "This string is returned from Local DS"
}