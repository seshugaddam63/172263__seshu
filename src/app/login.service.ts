import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class LoginService{
    private baseUrl = 'http://localhost:1234/employee';
    constructor(private http: HttpClient){

    }
    getAllEmployee(): Observable<Object>{
        return this.http.get(`${this.baseUrl}`+`/all`);
    }
    getEmployee(id: String):Observable<Object>{
        return this.http.get(`${this.baseUrl}/${id}`);
    }
    createEmployee(employee: Object): Observable<Object>{
        return this.http.post(`${this.baseUrl}`+`/add`,employee);
    }
    validateEmployee(employee: Object): Observable<Object>{
        return this.http.post(`${this.baseUrl}`+`/validate`,employee);
    }
    

}