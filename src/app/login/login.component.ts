import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Employee } from '../employee';


@Component({
  selector: 'app-register',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb: FormBuilder, private route: Router, private loginService:LoginService) { }
  regForm: FormGroup;
  submitted: boolean = false;
  response: any;
  employee:Employee=new Employee();
  
  ngOnInit() {
    this.regForm = this.fb.group({
      username: ['', [Validators.required ]],
      password:['',[ Validators.required] ],
    });
  }
  login(){
    this.submitted=false;
    this.employee=new Employee();
  }
  onLogin(){
    this.submitted=true;
    this.loginService.validateEmployee(this.employee)
      .subscribe((response) =>
            console.log(response),error=>console.error(error));
            this.employee=new Employee();
      
  }

}

