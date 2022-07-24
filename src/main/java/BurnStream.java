public interface BurnStream {
    int getNextBurn(DescentEvent status);

    public static void main(String[] args) {
      Simulation game = new Simulation(new Vehicle(Simulation.randomaltitude()));
        BurnStream burnSource = new BurnInputStream();
        game.runSimulation(burnSource);
    }
}
