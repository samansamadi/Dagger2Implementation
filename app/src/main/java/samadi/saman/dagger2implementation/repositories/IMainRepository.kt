package samadi.saman.dagger2implementation.repositories

interface IMainRepository {

    fun getData(fromLocal: Boolean): String
}