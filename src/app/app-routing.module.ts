import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TimeTasksComponent } from './time-tasks/time-tasks.component';

const routes: Routes = [{ path: '', redirectTo: 'timetasks', pathMatch: 'full' },
{ path: 'timetasks', component: TimeTasksComponent },];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
