void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");

    if (input.hasNextInt()) {
        int num = input.nextInt();
        String result = (num % 3 == 0 && num % 5 == 0) ? "fizzbuzz" :
                (num % 3 == 0) ? "fizz" : (num % 5 == 0) ? "buzz" : "none";
        System.out.println(result);
    } else {
        System.out.println("Your input is invalid!, good bye!");
    }
}