package samadi.saman.dagger2implementation

import samadi.saman.dagger2implementation.data.local.MainDao
import samadi.saman.dagger2implementation.data.remote.MainApiService
import samadi.saman.dagger2implementation.ui.MainActivity

abstract class ServiceProviders {

    companion object {
        const val TAG = "ServiceProviders"
    }

    abstract fun dao(): MainDao
    abstract fun api(): MainApiService
}