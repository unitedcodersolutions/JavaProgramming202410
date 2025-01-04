package com.unitedcoder.classtutorial;

public class ImmutableClassDemo {
        private int id;
        private String name;
        private java.util.Date dateCreated;
        public ImmutableClassDemo(int ssn, String newName) {
            id = ssn;
            name = newName;
            dateCreated = new java.util.Date();
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public java.util.Date getDateCreated() {
            return dateCreated;
        }

    }

