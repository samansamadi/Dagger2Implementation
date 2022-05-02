package samadi.saman.dagger2implementation.datasource.remote

class MainRemoteDataSource : IMainRemoteDataSource {

    companion object {
        const val TAG = "MainRemoteDataSource"
    }

    override fun getData() = "This string is returned from Remote DS"
}