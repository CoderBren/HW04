public class Book {

        private String title;
        private String genre;


        // Parameterized Constructor

        public Book(String title, String Genre) {
            this.title = title;
            this.genre = genre;
        }


        // Getter for title

        public String getTitle(){
            return title;
        }

        // Getter for genre

        public String getGenre(){
            return genre;
        }

        // Override toString so we can display title only

        public String toString(){
            return title;
        }
}
