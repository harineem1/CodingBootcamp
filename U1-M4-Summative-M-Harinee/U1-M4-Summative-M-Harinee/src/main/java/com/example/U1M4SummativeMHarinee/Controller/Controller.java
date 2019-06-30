package com.example.U1M4SummativeMHarinee.Controller;

import com.example.U1M4SummativeMHarinee.Model.Answer;
import com.example.U1M4SummativeMHarinee.Model.Quote;
import com.example.U1M4SummativeMHarinee.Model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
@RestController
public class Controller {



    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)

    public Quote getQuotes() {
        new Quote("Abdul Kalam", "Let us sacrifice our today so that our children can have a better tomorrow.");
        new Quote("Abdul Kalam", "You have to dream before your dreams can come true.");
        new Quote("Swami Vivekananda", "Arise! Awake! and stop not until the goal is reached.");
        new Quote("Swami Vivekananda","Where can we go to find God if we cannot see Him in our own hearts and in every living being.");
        new Quote("Wayne Gretzky", "You miss 100 percent of the shots you never take.");
        new Quote("Ambrose Redmoon", "Courage is not the absence of fear, but rather the judgement that something else is more important than fear.");
        new Quote("Gandhi","You must be the change you wish to see in the world.");
        new Quote("Aristotle", "We are what we repeatedly do, excellence, then, is not an act but a habit.");
        new Quote("Marcel Proust ",  " The real voyage of discovery consists not in seeking new lands but seeing with new eyes. ");
        new Quote("Ellen Parr", " The cure for boredom is curiosity and There is no cure for curiosity.");
        return Quote.getRandomQuote();



    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getDefinitions() {

        Definition d1 = new Definition("Assign","To set the data of a variable (involves the equal sign).");
        Definition d2 = new Definition("Class", "A class describes a particular kind of object. It can contain related methods and data members (variables). A class must have the same name as the file it is contained in.");
        Definition d3 = new Definition("Constructor", "A special type of instance method that creates a new object.");
        Definition d4 = new Definition("Definition ", "Similar to a declaration except that it also reserves storage (for variables) or provides implementations (for methods).");
        Definition d5 = new Definition(" Initialize", " an assignment that sets the starting value of a variable");
        Definition d6 = new Definition(" Instantiate", "To allocate storage for an object in memory (involves the keyword new).");
        Definition d7 = new Definition("Method", "a collection of code found within a class.");
        Definition d8 = new Definition(" Object", " Each object in a program consists of both variables (data) and methods (functionality).");
        Definition d9 = new Definition(" Parameter", " a variable or object passed into a method.");
        Definition d10 = new Definition(" Primitive ", " A variable defined with a primitive data type");


        return Definition.getRandomDefinition();
    }
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)

    public Answer getAnswer(@RequestBody @Valid String question) {

        new Answer("It is certain.");
        new Answer("As I see it, yes");
        new Answer("Without a doubt");
        new Answer("Signs point to yes");
        new Answer("Very doubtful.");
        new Answer("Outlook not so good");
        new Answer("Cannot predict now");
        new Answer("Better not tell you now.");

        return Answer.getRandomAnswer(question);



    }

}
