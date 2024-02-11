@FunctionalInterface
interface Promotional {

    boolean applyDiscount(double percentage);

    default boolean apply15PercentDiscount() {
        return applyDiscount(0.15);
    };

    default boolean apply10PercentDiscount(){
        return applyDiscount(0.1);
    }
}