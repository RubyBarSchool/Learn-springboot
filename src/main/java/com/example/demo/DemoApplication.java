package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		List<Person> personList = List.of(
				new Person("truong",Gender.MALE),
				new Person("ngoc",Gender.MALE),
				new Person("A",Gender.FEMALE),
				new Person("b",Gender.FEMALE),
				new Person("c",Gender.MALE),
				new Person("d",Gender.FEMALE),
				new Person("e",Gender.MALE)
		);
		System.out.println("Imperative Approach");
		// Imperative Approach
		List<Person> personListFemale = new ArrayList<>();
		for(Person person : personList){
			if(person.gender.equals(Gender.FEMALE)){
				personListFemale.add(person);
			}
		}

		for(Person person : personListFemale){
			System.out.println(person.toString());
		}

		System.out.println("Declarative Approach");
		Predicate<Person> personPredicate = person -> (person.gender.equals(Gender.FEMALE));
		//Declarative Approach
		personList.stream()
				.filter(person -> (person.gender.equals(Gender.FEMALE)))
				.collect(Collectors.toList())
				.forEach(System.out::println);

		List<Person> personListFemalex = personList.stream()
				.filter(personPredicate)
				.collect(Collectors.toList());

		//Function
		System.out.println("Declarative Approach");
		Function<Integer,Integer> add = integer -> ++integer ;
		System.out.println(add.apply(1));
	}
	static  class Person{
		private String name;
		private Gender gender;

		public Person() {
		}

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", gender=" + gender +
					'}';
		}
	}
	enum Gender{
		MALE,FEMALE
	}
}
