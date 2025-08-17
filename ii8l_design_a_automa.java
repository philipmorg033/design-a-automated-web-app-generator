import java.util.Scanner;

public class ii8l_design_a_automa {
    public static void main(String[] args) {
        System.out.println("Automated Web App Generator");
        System.out.print("Enter App Name: ");
        Scanner scanner = new Scanner(System.in);
        String appName = scanner.nextLine();
        System.out.print("Enter Number of Pages: ");
        int numPages = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        // generate app structure
        System.out.println("Generating App Structure...");
        String appStructure = "public class " + appName + " {\n";
        appStructure += "    public static void main(String[] args) {\n";
        appStructure += "        // TO DO: implement app logic\n";
        appStructure += "    }\n";
        appStructure += "}";

        // generate pages
        System.out.println("Generating Pages...");
        String pages = "";
        for (int i = 0; i < numPages; i++) {
            pages += "public class Page" + (i + 1) + " {\n";
            pages += "    public static void main(String[] args) {\n";
            pages += "        // TO DO: implement page logic\n";
            pages += "    }\n";
            pages += "}\n";
        }

        // generate HTML file
        System.out.println("Generating HTML File...");
        String html = "<html>\n";
        html += "  <head>\n";
        html += "    <title>" + appName + "</title>\n";
        html += "  </head>\n";
        html += "  <body>\n";
        html += "    <h1>" + appName + "</h1>\n";
        html += "    <ul>\n";
        for (int i = 0; i < numPages; i++) {
            html += "      <li><a href=\"Page" + (i + 1) + ".java\">Page " + (i + 1) + "</a></li>\n";
        }
        html += "    </ul>\n";
        html += "  </body>\n";
        html += "</html>\n";

        System.out.println("Generated Files:");
        System.out.println(appStructure);
        System.out.println(pages);
        System.out.println(html);
    }
}