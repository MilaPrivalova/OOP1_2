public class Wardrobe {
    enum State {
        Open,
        Close
    }

    private State state;




     public void door() {
         if (this.state == State.Open) {
             this.doorClose();
             this.state = State.Close;
         }
         else {
             this.doorOpen(new Wardrobe);
             this.state = State.Open;
         }
         System.out.println();
     }


    public void getDoor(Person name) {
        if (this.state == State.Open) {
            this.doorClose(name);
            this.state = State.Close;
        }
        else {
            this.doorOpen(name);
            this.state = State.Open;
        }
        System.out.println();
    }

    public void doorClose(Person name) {
        System.out.println(name.getName() + " закрывает дверцы шкафа");
    }

    public void doorOpen(Person name) {
        System.out.println(name.getName() + " открывает дверцы шкафа");
    }

}


