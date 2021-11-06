package suitecrm.com.todo.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "task")
data class Task(
        @PrimaryKey(autoGenerate = true)
        var id: Int,
        var externalId: String,
        var name: String,
        var categoryId: String,
        var categoryName: String,
        var isChecked: Int,
        var isDeleted: Int,
        var isNeedSync: Int,
        val dateCreate: Date,
)
