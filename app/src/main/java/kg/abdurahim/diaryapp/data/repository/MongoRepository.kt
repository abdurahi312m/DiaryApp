package kg.abdurahim.diaryapp.data.repository

import kg.abdurahim.diaryapp.model.Diary
import kg.abdurahim.diaryapp.util.RequestState
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

typealias Diaries = RequestState<Map<LocalDate, List<Diary>>>

interface MongoRepository {

    fun configureTheRealm()

    fun getAllDiaries(): Flow<Diaries>

}