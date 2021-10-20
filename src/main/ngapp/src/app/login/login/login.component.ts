import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'jlb-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm = new FormGroup({
    login : new FormControl('', {validators: [Validators.required, Validators.minLength(5)], updateOn: 'blur'}),
    password : new FormControl('')
  });

  constructor() { }

  ngOnInit() {
    
  }

  onLogin() {
    this.loginForm.get('login').valueChanges.subscribe(value => console.log(value))
  }

  isLoginValid() : boolean {
    return this.loginForm.get('login').valid || this.loginForm.get('login').pristine;
  }
}
