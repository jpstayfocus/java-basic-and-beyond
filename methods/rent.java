public class Main {
            /*
            When building method:
            - Access modifiers
            - Optional static
            - Return type
            - Name
            - Optional parameters
            - Method Body
            - Optional return value
            */

            public static void main(String[] args) {
                double yield = calculatePropertyYield(
                        1_300, 250_000
                );
                System.out.println(yield);
            }

            private static double calculatePropertyYield(
                    double rent, double propertyPrice
            ){
                double yearlyRent = rent * 12;
                double yield = (yearlyRent / propertyPrice) * 100;
                return (yearlyRent / propertyPrice);
                //return yield;
            }
            
}
