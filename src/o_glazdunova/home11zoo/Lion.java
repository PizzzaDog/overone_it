package o_glazdunova.home11zoo;

import java.util.ArrayList;

    public class Lion {
        private String name;
        private int age;
        private String colour;

        public Lion(String name, int age, String colour) {
            this.name = name;
            this.age = age;
            this.colour = colour;
        }

        public void setColour(String colour) {this.colour = colour;
        }

        public String toString() {
            return "name = " + name + ", age = " + age + ", colour = " + colour;
        }
    }

