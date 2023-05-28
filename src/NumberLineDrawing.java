import javax.swing.*;
import java.awt.*;
import java.util.*;

public class NumberLineDrawing extends JPanel {
    private int start;
    private int end;
    private ArrayList<Integer> sequence;

    public NumberLineDrawing(int start, int end, ArrayList<Integer> sequence) {
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
            // int x = i * tickInterval;
            // int number = i + start;

            
            // g2d.drawString(String.valueOf(number), x - 5, height / 2 + 25);
        }

        // Draw zero line
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(0, height / 2, width, height / 2);

        g2d.drawLine(0, 0, 500, 100);
        g2d.fillOval(495, 95, 10, 10);
        g2d.drawLine(500, 100, 200, 300);
        g2d.fillOval(200-5, 300-5, 10, 10);
        g2d.drawLine(200, 300, 90, 60);

        // Plot the sequence on the number line
        int sequenceSize = sequence.size();
        int sequenceMarkerSize = 8;

        for (int i = 0; i < sequenceSize; i++) {
            int number = sequence.get(i);

            int x = (number - start) * tickInterval;
            x = x + 10;
            g2d.drawLine(x, height / 2 - 10, x, height / 2 + 10); // ticks
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
        int[] array = {20, 30, 15, 90, 60, 50, 10, 15, 199};
        for(int i = 0; i < array.length; i++){
            sequence.add(array[i]);
        }
        
        

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Number Line Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 200);
            frame.setLocationRelativeTo(null);

            NumberLineDrawing numberLineDrawing = new NumberLineDrawing(start, end, sequence);
            frame.add(numberLineDrawing);

            frame.setVisible(true);
        });

        scanner.close();
    }
}
