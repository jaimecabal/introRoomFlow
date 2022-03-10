package com.example.busschedule.viewmodels

import Schedule
import androidx.lifecycle.ViewModel
import com.example.busschedule.database.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {
    fun fullSchedule(): List<Schedule> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): List<Schedule> = scheduleDao.getByStopName(name)
}