package samadi.saman.dagger2implementation.modules

import dagger.Module
import dagger.Provides
import samadi.saman.dagger2implementation.datasource.local.IMainLocalDataSource
import samadi.saman.dagger2implementation.datasource.remote.IMainRemoteDataSource
import samadi.saman.dagger2implementation.repositories.IMainRepository
import samadi.saman.dagger2implementation.repositories.MainRepository
import javax.inject.Inject

@Module
class RepositoryModule {

    companion object {
        const val TAG = "RepositoryModule"
    }

    @Provides
    fun provideMainRepository(
        remote: IMainRemoteDataSource,
        local: IMainLocalDataSource
    ): IMainRepository {
        return MainRepository(remote, local)
    }
}