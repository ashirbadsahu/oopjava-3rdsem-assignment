class Sports {
    void play() {
        System.out.println("Playing a sport.");
    }
  public static void main(String[] args) {
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();
        
        football.play(); 
        basketball.play();  
        rugby.play();       
    }
}

class Football extends Sports {
    @Override
    void play() {
        System.out.println("Playing Football: Kicking the ball into the goal!");
    }
}

class Basketball extends Sports {
    @Override
    void play() {
        System.out.println("Playing Basketball: Dribbling and shooting the ball!");
    }
}

class Rugby extends Sports {
    @Override
    void play() {
        System.out.println("Playing Rugby: Tackling and passing the ball!");
    }
}

