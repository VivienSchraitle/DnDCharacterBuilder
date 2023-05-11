
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7396550157036270675L;
	// create labels, text fields, and buttons
    private JLabel nameLabel = new JLabel("Name:");
    private JTextField nameField = new JTextField(14);
    private JLabel classLabel = new JLabel("Class:");
    private JComboBox<String> classBox = new JComboBox<>(new String[]{"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"});
    private JLabel raceLabel = new JLabel("Race:");
    private JComboBox<String> raceBox = new JComboBox<>(new String[]{"Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"});
    private JLabel levelLabel = new JLabel("Level:");
    private JTextField levelField = new JTextField(2);
    private JLabel alignmentLabel = new JLabel("Alignment:");
    private JComboBox<String> alignmentBox = new JComboBox<>(new String[]{"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"});
    private JButton saveButton = new JButton("Save");
    private JButton resetButton = new JButton("Reset");

    public GUI() {
        super("D&D Character Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setResizable(false);

        // create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 0, 5, 0);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(nameLabel, c);
        c.gridx = 1;
        c.gridy = 0;

        panel.add(nameField, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(classLabel, c);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(classBox, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(raceLabel, c);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(raceBox, c);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(levelLabel, c);
        c.gridx = 1;
        c.gridy = 3;

        panel.add(levelField, c);
        c.gridx = 0;
        c.gridy = 4;
        panel.add(alignmentLabel, c);
        c.gridx = 1;
        c.gridy = 4;
        panel.add(alignmentBox, c);
        c.gridx = 0;
        c.gridy = 5;
        panel.add(saveButton, c);
        c.gridx = 1;
        c.gridy = 5;
        panel.add(resetButton, c);
        
        // add panel to frame
        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
    
}
// tried to connect to the 5etools api forgot it was a, questionable thing to connect too lmao
/*    public String[] url() {

String url = "https://5e.tools/races.html";

try {
    // Read the page HTML
    URLConnection conn = new URL(url).openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String inputLine;
    StringBuilder html = new StringBuilder();
    while ((inputLine = in.readLine()) != null) {
        html.append(inputLine);
    }
    in.close();

    // Extract the race names
    int start = html.indexOf("class=\"link-index\"");
    List<String> races = new ArrayList<String>();
    while (start >= 0) {
        start = html.indexOf(">", start) + 1;
        int end = html.indexOf("</a>", start);
        String race = html.substring(start, end);
        races.add(race);
        start = html.indexOf("class=\"link-index\"", end);
    }

} catch (IOException e) {
    e.printStackTrace();
}
return null;
}
*/
