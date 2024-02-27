package com.praveen;


    import org.springframework.beans.factory.annotation.Required;
    import org.springframework.context.annotation.Scope;
    import org.springframework.stereotype.Component;

    @Component("id1")
    public class ExampleBean {
        private String requiredProperty;


        private int rollNo;

        public int getRollNo() {
            return rollNo;
        }


        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getRequiredProperty() {
            return requiredProperty;
        }

        @Required
        public void setRequiredProperty(String requiredProperty) {
            this.requiredProperty = requiredProperty;
        }

        @Override
        public String toString() {
            return "ExampleBean{" +
                    "requiredProperty='" + requiredProperty + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }
    }


