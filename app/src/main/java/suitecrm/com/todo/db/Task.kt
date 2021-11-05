package suitecrm.com.todo.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var externalId: String,
    var name: String,
    var isChecker: Int,
    val dateCreate: Date,
)
