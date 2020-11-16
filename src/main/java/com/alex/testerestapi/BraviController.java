package com.alex.testerestapi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/constime" })
public class BraviController {
	private List<Activity> list = new ArrayList<Activity>();
	ConsHour consHour = new ConsHour();
	Activity activity = new Activity();
    private CustomTasks customTasks;
	@GetMapping
	public List<Activity> listTasks() {
		if (list.size() == 0) {
			activity = new Activity();
			activity.setId(1L);
			activity.setActivity("Lavar");
			activity.setDay_month(1);
			activity.setHour_day(12);
			activity.setTime_activity(2);
			Activity activity2 = new Activity();
			activity2.setId(2L);
			activity2.setActivity("Limpar");
			activity2.setDay_month(2);
			activity2.setHour_day(8);
			activity2.setTime_activity(3);
			list.add(activity);
			list.add(activity2);
		}
		return list;

	}

	@GetMapping(path = { "/{hour}" })
	public ConsHour descHour(@PathVariable Integer hour) {

		String informHour = null;
		String informMinute = null;
		int time = hour / 100;
		System.out.println(hour);
		switch (time) {
		case 1:
			informHour = "one";
			break;
		case 2:
			informHour = "two";
			break;
		case 3:
			informHour = "three";
			break;
		case 4:
			informHour = "four";
			break;
		case 5:
			informHour = "five";
			break;
		case 6:
			informHour = "six";
			break;
		case 7:
			informHour = "seven";
			break;
		case 8:
			informHour = "eight";
			break;
		case 9:
			informHour = "nine";
			break;
		case 10:
			informHour = "ten";
			break;
		case 11:
			informHour = "eleven";
			break;
		case 12:
			informHour = "twelve";
			break;
		default:
			System.out.println("Invalid Number");
		}
		int minute = hour % 100;
		switch (minute) {
		case 1:
			informMinute = "one minute past";
			break;
		case 2:
			informMinute = "two minutes past";
			break;
		case 3:
			informMinute = "three minutes past";
			break;
		case 4:
			informMinute = "four minutes past";
			break;
		case 5:
			informMinute = "five minutes past";
			break;
		case 6:
			informMinute = "six minutes past";
			break;
		case 7:
			informMinute = "seven minutes past";
			break;
		case 8:
			informMinute = "eight minutes past";
			break;
		case 9:
			informMinute = "nine minutes past";
			break;
		case 10:
			informMinute = "ten minutes past";
			break;
		case 11:
			informMinute = "eleven minutes past";
			break;
		case 12:
			informMinute = "twelve minutes past";
			break;
		case 13:
			informMinute = "thirteen minutes past";
			break;
		case 14:
			informMinute = "forteen minutes past";
			break;
		case 15:
			informMinute = "quarter past";
			break;
		case 16:
			informMinute = "sixteen minutes past";
			break;
		case 17:
			informMinute = "seventeen minutes past";
			break;
		case 18:
			informMinute = "eighteen minutes past";
			break;
		case 19:
			informMinute = "nineteen minutes past";
			break;
		case 20:
			informMinute = "twenty minutes past";
			break;
		case 21:
			informMinute = "twenty one minutes past";
			break;
		case 22:
			informMinute = "twenty two minutes past";
			break;

		case 23:
			informMinute = "twenty three minutes past";
			break;

		case 24:
			informMinute = "twenty four minutes past";
			break;

		case 25:
			informMinute = "twenty five minutes past";
			break;
		case 26:
			informMinute = "twenty six minutes past";
			break;
		case 27:
			informMinute = "twenty seven minutes past";
			break;
		case 28:
			informMinute = "twenty eight minutes past";
			break;
		case 29:
			informMinute = "twenty nine minutes past";
			break;
		case 30:
			informMinute = "half past";
			break;
		case 31:
			informMinute = "twenty nine minutes to";
			break;
		case 32:
			informMinute = "twenty eight minutes to";
			break;

		case 33:
			informMinute = "twenty seven minutes to";
			break;

		case 34:
			informMinute = "twenty six minutes to";
			break;

		case 35:
			informMinute = "twenty five minutes to";
			break;
		case 36:
			informMinute = "twenty four minutes to";
			break;
		case 37:
			informMinute = "twenty three minutes to";
			break;
		case 38:
			informMinute = "twenty two minutes to";
			break;
		case 39:
			informMinute = "twenty one minutes to";
			break;

		case 40:
			informMinute = "twenty  minutes to";
			break;
		case 41:
			informMinute = "nineteen minutes to";
			break;
		case 42:
			informMinute = "eighteen minutes to";
			break;
		case 43:
			informMinute = "seventeen minutes to";
			break;

		case 44:
			informMinute = "sixteen minutes to";
			break;

		case 45:
			informMinute = "quarter to";
			break;
		case 46:
			informMinute = "forteen minutes to";
			break;
		case 47:
			informMinute = "thirteen minutes to";
			break;
		case 48:
			informMinute = "twelve minutes to";
			break;
		case 49:
			informMinute = "eleven minutes to";
			break;
		case 50:
			informMinute = "ten minutes to";
			break;
		case 51:
			informMinute = "nine minutes to";
			break;
		case 52:
			informMinute = "eight minutes to";
			break;
		case 53:
			informMinute = "seven minutes to";
			break;

		case 54:
			informMinute = "six minutes to";
			break;

		case 55:
			informMinute = "five minutes to";
			break;
		case 56:
			informMinute = "four minutes to";
			break;
		case 57:
			informMinute = "three minutes to";
			break;
		case 58:
			informMinute = "two minutes to";
			break;
		case 59:
			informMinute = "one minute to";
			break;
		case 0:
			informMinute = "o´clock";
			break;
		default:
			System.out.println("Number Invalid");
		}
		if (minute == 0) {
			consHour.setHour(informHour + " " + informMinute);
		} else {
			consHour.setHour(informMinute + " " + informHour);

		}
		return consHour;
	}

	@PostMapping
	public String startTask(@RequestBody Activity act) throws InterruptedException {

		list.add(act);
		for(int t=0;t<list.size();t++){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, list.get(t).getDay_month());
		calendar.set(Calendar.HOUR_OF_DAY, list.get(t).getHour_day());

		Timer time = new Timer(); // Instantiate Timer Object

		// Start running the task on Monday at 15:40:00, period is set to 8
		// hours
		// if you want to run the task immediately, set the 2nd parameter to 0
		time.schedule(customTasks =new CustomTasks(list.get(t).getActivity(),8), calendar.getTime(), TimeUnit.HOURS.toMillis(list.get(t).getDay_month()));
	
		}
		
		return "";
	}
	@GetMapping(path = { "/currenttask" })
	public Activity getCurrentTask(){
		activity.setActivity(customTasks.getTask());
		activity.setHour_day(Integer.parseInt(customTasks.getRemainTime().toString()));
		return activity;
		}
	@GetMapping(path = { "/task/{id}" })
	public Activity getTask(@PathVariable Long id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				activity = list.get(i);
				break;
			}
		}
		return activity;
	}

	@PutMapping("/{id}")
	public void updateTask(@PathVariable(value = "id") Long id, @RequestBody Activity act) {
		for (int s = 0; s < list.size(); s++) {
			if (list.get(s).getId() == id) {
				list.get(s).setActivity(act.getActivity());
				list.get(s).setDay_month(act.getDay_month());
				list.get(s).setHour_day(act.getHour_day());
				list.get(s).setTime_activity(act.getTime_activity());
				break;
			}
		}

	}

	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable(value = "id") Long id) {
		System.out.print("testa delete");
		for (int d = 0; d < list.size(); d++) {
			if (list.get(d).getId() == id) {
				list.remove(d);
				break;
			}
		}

	}

}