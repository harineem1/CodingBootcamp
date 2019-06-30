
public interface Converter {

        public String converterMonth(int monthNumber);

        public String convertDay(int dayNumber);

        public default void thirdM(){
                System.out.println("lll");
        };


}
