public class Robot {

    public static class Legs implements Runnable {
        String leg;
        Object monitor;

        /**
         *
         * @param leg  leg
         * @param monitor  monitor
         */
        public Legs(String leg, Object monitor) {
            this.leg = leg;
            this.monitor = monitor;
        }

        @Override
        public void run() {
            try{
                while (true) {
                    synchronized (monitor) {
                        monitor.notify();
                        monitor.wait();
                        System.out.println(leg);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }