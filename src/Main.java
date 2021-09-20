 class Movie{
        private String name;
        public Movie(String name) {
            this.name = name;
        }

        public String plot(){
            return "No plot here";
        }

        public String getName(){
            return this.name;
        }
    }

    class Jaws extends Movie{
        public Jaws(){
            super("Jaws");
        }

        public String plot(){
            return "A shark eats people";
        }
    }

    class IndependenceDay extends Movie{
        public IndependenceDay(){
            super("Independence Day");
        }

        @Override
        public String plot(){
            return super.plot();
        }
    }

    public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Movie movie = randomMovie();
            System.out.println("Random movie is: "+i+" :"+ movie.getName()+"\n"+" Plot: "+ movie.plot());
        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 2) + 1;
        System.out.println("Random number generated was: " + random);

        switch (random) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();
        }
    return null;
    }
}