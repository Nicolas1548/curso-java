package app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter cliente data:");
		IO.print("Name: ");
		String nameClient = sc.nextLine();
		IO.print("Email: ");
		String emailClient = sc.nextLine();
		IO.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);

		Client client = new Client(nameClient, emailClient, birthDate);

		System.out.println("Enter order data:");
		IO.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		Date moment = new Date();

		Order order = new Order(moment, status);

		IO.print("How many items to this order?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			IO.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			
			IO.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			sc.nextLine();
			IO.print("Quantity: ");
			Integer quantityProduct = sc.nextInt();
			Product product = new Product(nameProduct, priceProduct);
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct);
			orderItem.setProduct(product);
			order.addItem(orderItem);
		}

		System.out.println("");
		IO.println("ORDER SUMMARY: ");
		IO.println("Order moment: " + sdf.format(moment));
		IO.println("Order status: " + status);
		IO.println(client);
		IO.println("Order items: ");
		for (OrderItem x : order.getItems()) {
			IO.println(x);
		}

		IO.println("Total price: " + String.format("$%.2f", order.total()));

		sc.close();
	}

}
