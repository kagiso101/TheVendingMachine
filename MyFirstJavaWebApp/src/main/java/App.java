import spark.ModelAndView;
import spark.Request;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class App {


    String name;
    String lang;

        public static void main(String[] args) {

            staticFiles.location("/static routes");

            get("/greet", (req, res) -> {

                Map<String, Object> map = new HashMap<>();
                return new ModelAndView(map, "hello.handlebars");
            }, new HandlebarsTemplateEngine());


            post("/greet", (req, res) -> {
                // create the greeting message
                String greeting = "Hello, " + req.queryParams("username");
                return greeting;
            });

//            get("/greeted", (req, res) -> {
//return "";
//
//            }, new HandlebarsTemplateEngine());
//
////
////
//            get("/greeted/:username", (req, res) -> {
//
//            }, new HandlebarsTemplateEngine());


        }


}
