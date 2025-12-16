package com.deloitte.demo.day2.oop.abstr;

public interface SampleInterface {

}

interface IntOne {

}

interface IntTwo {

}

interface IntThree {

}

class ClassOne {

}

//class ClassTwo implements IntOne, IntTwo, IntThree {
//
//}

class ClassTwo extends ClassOne implements IntOne, IntTwo, IntThree {

}