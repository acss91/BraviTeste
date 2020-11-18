import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiservicesService {
  private baseUrl = 'http://localhost:8081/constime';
  constructor(private http: HttpClient) { }
  getTimeAction(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  getTask(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/task/${id}`);
  }
  getCurrentTask(): Observable<any> {
    return this.http.get(`${this.baseUrl}/currenttask`);
  }
  createTask(activity: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`,activity);
  }
  getTaskList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  updateTask(hour: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${hour}`, value);
  }

  deleteTask(hour: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${hour}`, { responseType: 'text' });
}
}
