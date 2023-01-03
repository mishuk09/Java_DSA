package JAVA_SE_7;

public class java_se7_switch {
    // gadget is a string variable

    String gadget="Mobile";

    switch(gadget)
    {
	case "Mobile":
         System.out.println("Rs.5000 to 50000");
		 break;
	case "iPad": System.out.println("Rs.10000 to 50000");
		break;
	case "Laptop": System.out.println("Rs.20000 to 50000");
		break;
	default: System.out.println("Not available");
}

}
