public class Player extends Human {
    class Backpack {
        private String content = "";

        void put(String thing) {
            content += thing + ",";
        }

        public String toString() {
            if (content.equals("")) {
                return "the backpack is empty";
            }
            return content.substring(0, content.length() - 1) + " in the backpack";
        }
    }

    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String thing) {
        backpack.put(thing);
    }

}
