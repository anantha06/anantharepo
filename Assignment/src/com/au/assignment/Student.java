package com.au.assignment;

@interface Student{  
int roll_no() default 1;  
String name() default "abc";  
String subject() default "xyz";  
} 
/*
@Student(roll_no=10,name="Arun Kumar",subject="ComputerScience")
*/
