import javax.swing.*;
import java.awt.*;
import java.util.*;

public class NumberLineDrawing2 extends JPanel {
    private int start;
    private int end;
    private ArrayList<Integer> sequence;

    public NumberLineDrawing2(int start, int end, ArrayList<Integer> sequence) {
        this.start = start;
        this.end = end;
        this.sequence = sequence;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        // Set up drawing properties
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));

        // Calculate the length and tick interval
        int length = Math.abs(start) + Math.abs(end) + 1;
        int tickInterval = width / length;

        // Draw tick marks and labels
        for (int i = 0; i < length; i++) {
            int x = i * tickInterval;
            int number = i + start;

            g2d.drawLine(x, height / 2 - 10, x, height / 2 + 10);
            g2d.drawString(String.valueOf(number), x - 5, height / 2 + 25);
        }

        // Draw zero line
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(0, height / 2, width, height / 2);

        // Plot the sequence on the number line
        int sequenceSize = sequence.size();
        int sequenceMarkerSize = 6;

        for (int i = 0; i < sequenceSize; i++) {
            int number = sequence.get(i);

            int x = (number - start) * tickInterval;

            // Adjust y position to avoid overlapping with tick marks
            int y = height / 2 - 10 - sequenceMarkerSize;

            g2d.setColor(Color.RED);
            g2d.fillOval(x - sequenceMarkerSize / 2, y, sequenceMarkerSize, sequenceMarkerSize);
            g2d.setColor(Color.BLACK);
            g2d.drawString(String.valueOf(number), x - 5, y - 5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the start value: ");
        int start = 0;

        // System.out.print("Enter the end value: ");
        int end = 199;

        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(82);
        sequence.add(170);
        sequence.add(43);
        sequence.add(140);
        sequence.add(24);
        sequence.add(16);
        sequence.add(190);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Number Line Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);

            NumberLineDrawing2 numberLineDrawing = new NumberLineDrawing2(start, end, sequence);
            JScrollPane scrollPane = new JScrollPane(numberLineDrawing);
            frame.add(scrollPane);

            frame.setVisible(true);
        });

        scanner.close();
    }
}
