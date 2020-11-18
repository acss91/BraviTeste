import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ApiservicesService } from '../apiservices.service';
import { Activity } from '../model/activity';
import { Conshour } from '../model/conshour';

@Component({
  selector: 'app-time-tasks',
  templateUrl: './time-tasks.component.html',
  styleUrls: ['./time-tasks.component.css']
})
export class TimeTasksComponent implements OnInit {
  id: number;
  numHour:number;
  numMinute:number;
   hourtime: Conshour;
   activity: Activity = new Activity();
   currentAc: Activity = new Activity();
   updateAc: Activity = new Activity();
  submitted = false;
  activities: Observable<Activity[]>;
  public select: FormGroup;
  public select2: FormGroup;
  arrayHours = [1,2,3,4,5,6,7,8,9,10,11,12];
  arrayMinutes = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59];
    constructor(private activityService: ApiservicesService,
      private router: Router,private formBuilder: FormBuilder) {}
  

  ngOnInit(): void {
this.hourtime = new Conshour();
    this.reloadData();
    
    this.select = this.formBuilder.group({
      select : ['']
    });
    this.select2 = this.formBuilder.group({
      select : ['']
    });
  }
  newActivity(): void {
    this.submitted = false;
    this.activity = new Activity();
  }

  save() {
    this.activityService
    .createTask(this.activity).subscribe(data => {
      console.log(data)
      this.activity = new Activity();
      history.go(0);
    }, 
    error => console.log(error));
  }
  showcurrentTask(){
    this.activityService.getCurrentTask()
    .subscribe(data => {
      console.log(data)
      this.currentAc = data;
    }, error => console.log(error));
}
  
  update() {
    this.id = this.updateAc.id;
    this.activityService.updateTask(this.id, this.updateAc)
      .subscribe(data => {
        console.log(data);
        this.updateAc= new Activity();
        history.go(0);
      }, error => console.log(error));
  }
  deleteEmployee(id: number) {
    this.activityService.deleteTask(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
      }
  onSubmit() {
    this.submitted = true;
    this.save(); 
     
  }
  onEditSubmit() {
    this.submitted = true;
    this.update(); 
  }
  gotoList() {
    this.router.navigate(['/timetasks']);
  }
  reloadData() {
    this.activities = this.activityService.getTaskList();
  }
  loadHours(){
  
 this.numHour= this.select.get('select').value;
 this.numMinute=this.select2.get('select').value;
 const n =this.numHour*100 + this.numMinute*1;
 this.activityService.getTimeAction(n)
      .subscribe(data => {
        console.log(data)
       this.hourtime=data; 
      }, error => console.log(error));
 console.log(n);
  }
  deleteTask(id: number) {
    this.activityService.deleteTask(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  updateTask(id: number){
    this.activityService.getTask(id)
    .subscribe(data => {
      console.log(data)
      this.updateAc = data;
    }, error => console.log(error));
}
  }


