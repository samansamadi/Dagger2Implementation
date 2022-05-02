package samadi.saman.dagger2implementation.modules

import dagger.Component
import dagger.Module
import dagger.Provides
import samadi.saman.dagger2implementation.datasource.local.IMainLocalDataSource
import samadi.saman.dagger2implementation.datasource.local.MainLocalDataSource
import samadi.saman.dagger2implementation.datasource.remote.IMainRemoteDataSource
import samadi.saman.dagger2implementation.datasource.remote.MainRemoteDataSource

@Module
class DataSourceModule {

    companion object {
        const val TAG = "DataSourceModule"
    }

    @Provides
    fun provideLocalDataSource(): IMainLocalDataSource {
        return MainLocalDataSource()
    }

    @Provides
    fun provideRemoteDataSource(): IMainRemoteDataSource {
        return MainRemoteDataSource()
    }
}