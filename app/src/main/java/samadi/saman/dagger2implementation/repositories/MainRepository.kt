package samadi.saman.dagger2implementation.repositories

import samadi.saman.dagger2implementation.datasource.local.IMainLocalDataSource
import samadi.saman.dagger2implementation.datasource.remote.IMainRemoteDataSource
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val remote: IMainRemoteDataSource,
    private val local: IMainLocalDataSource
) : IMainRepository {

    companion object {
        const val TAG = "MainRepository"
    }

    override fun getData(fromLocal: Boolean): String =
        if (fromLocal)
            local.getData()
        else
            remote.getData()

}