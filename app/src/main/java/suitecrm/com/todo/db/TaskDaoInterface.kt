package suitecrm.com.todo.db

import androidx.room.*

@Dao
interface TaskDaoInterface {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

    @Query("SELECT * FROM task WHERE name == :id")
    fun getTaskById(id: String): List<Task>

    @Query("SELECT * FROM task WHERE `isChecked` = 0 AND `isDeleted`= 0")
    fun getNonSuccessTask(): List<Task>

    @Query("SELECT * FROM task WHERE `isChecked` = 1 AND `isDeleted`= 0")
    fun getSuccessTask(): List<Task>

    @Query("SELECT * FROM task WHERE `isDeleted`= 0" )
    fun getDeletedTask(): List<Task>
}