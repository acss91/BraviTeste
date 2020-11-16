package com.alex.testerestapi;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CustomTasks extends TimerTask {
private String task;
private Integer hours;
private Long remainTime;


public CustomTasks (String task, Integer hours) {
this.task =task;
this.hours=hours;
this.remainTime=TimeUnit.HOURS.toMinutes(hours);
}
	@Override
	public void run() {
	
		// TODO Auto-generated method stub
		remainTime=remainTime-1;
	}
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Long getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(Long remainTime) {
		this.remainTime = remainTime;
	}
}	