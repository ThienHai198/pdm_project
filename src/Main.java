import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static JFrame frame;
    private static JPanel table;
    private static GridLayout gridLayout;

    public static void main(String[] args) throws SQLException {

        frame = new JFrame("Railway System");
        frame.setSize(1280, 720);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.decode("#92f9b9"));
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(20, 20));
        panel.setBackground(null);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JLabel title = new JLabel("Railway System");
        title.setForeground(Color.decode("#012030"));
        title.setFont(new Font(null, Font.BOLD, 35));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title, BorderLayout.NORTH);

        gridLayout = new GridLayout(6,1);
        table = new JPanel(gridLayout);
        table.setBackground(Color.decode("#92f9b9"));

        JScrollPane sp = new JScrollPane(table);
        panel.add(sp, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5));
        JButton Trains = new JButton("Trains");
        JButton Track = new JButton("Tracks");
        JButton Stations = new JButton("Stations");
        JButton SequenceStation = new JButton("Sequence Station");
        JButton Schedules = new JButton("Schedules");


        Trains.setBackground(Color.decode("#45C4B0"));
        Trains.setForeground(Color.white);
        Trains.setFont(new Font(null, Font.BOLD, 20));

        Track.setBackground(Color.decode("#45C4B0"));
        Track.setForeground(Color.white);
        Track.setFont(new Font(null, Font.BOLD, 20));

        Stations.setBackground(Color.decode("#45C4B0"));
        Stations.setForeground(Color.white);
        Stations.setFont(new Font(null, Font.BOLD, 20));

        SequenceStation.setBackground(Color.decode("#45C4B0"));
        SequenceStation.setForeground(Color.white);
        SequenceStation.setFont(new Font(null, Font.BOLD, 20));

        Schedules.setBackground(Color.decode("#45C4B0"));
        Schedules.setForeground(Color.white);
        Schedules.setFont(new Font(null, Font.BOLD, 20));
//
        Trains.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new window for Trains
                JFrame trainsFrame = new JFrame("Trains Information");
                trainsFrame.setSize(800, 600);
                trainsFrame.setBackground(Color.decode("#45C4B0"));
                trainsFrame.setLocationRelativeTo(null);
                trainsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Data for the JTable (dummy data)
                String[][] trainData = {
                        {"101", "Express Train"},
                        {"102", "Local Train"},
                        {"103", "Freight Train"},
                        {"104", "Passenger Train"},
                        {"105", "Metro"}
                };

                // Column names
                String[] columnNames = {"Train ID", "Train Name"};

                // Create JTable
                JTable trainTable = new JTable(trainData, columnNames);

                // Add table to a JScrollPane for scrolling
                JScrollPane tableScrollPane = new JScrollPane(trainTable);

                // Add the table to the frame
                trainsFrame.add(tableScrollPane, BorderLayout.CENTER);
                trainsFrame.setVisible(true);
                }
        });

        Stations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new window for Trains
                JFrame stationsFrame = new JFrame("Stations Information");
                stationsFrame.setSize(800, 600);
                stationsFrame.setBackground(Color.decode("#45C4B0"));
                stationsFrame.setLocationRelativeTo(null);
                stationsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Data for the JTable (dummy data)
                String[][] stationData = {

                };

                // Column names
                String[] columnNames = {"Station ID", "Station Name"};

                // Create JTable
                JTable stationTable = new JTable(stationData, columnNames);

                // Add table to a JScrollPane for scrolling
                JScrollPane tableScrollPane = new JScrollPane(stationTable);

                // Add the table to the frame
                stationsFrame.add(tableScrollPane, BorderLayout.CENTER);
                stationsFrame.setVisible(true);
            }
        });

        Track.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new window for Trains
                JFrame trackFrame = new JFrame("Track Information");
                trackFrame.setSize(800, 600);
                trackFrame.setBackground(Color.decode("#45C4B0"));
                trackFrame.setLocationRelativeTo(null);
                trackFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Data for the JTable (dummy data)
                String[][] trackData = {

                };

                // Column names
                String[] columnNames = {"Track ID", "Start Station ID","End Station ID"};

                // Create JTable
                JTable trackTable = new JTable(trackData, columnNames);

                // Add table to a JScrollPane for scrolling
                JScrollPane tableScrollPane = new JScrollPane(trackTable);

                // Add the table to the frame
                trackFrame.add(tableScrollPane, BorderLayout.CENTER);
                trackFrame.setVisible(true);
            }
        });

        SequenceStation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new window for Trains
                JFrame sequenceStationFrame = new JFrame("Sequence Station Information");
                sequenceStationFrame.setSize(800, 600);
                sequenceStationFrame.setBackground(Color.decode("#45C4B0"));
                sequenceStationFrame.setLocationRelativeTo(null);
                sequenceStationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Data for the JTable (dummy data)
                String[][] SequenceStationData = {

                };

                // Column names
                String[] columnNames = {"Sequence number","Route ID", "Schedule ID","Station ID", "Arrival Time","Departure Time"};

                // Create JTable
                JTable sequenceStationTable = new JTable(SequenceStationData, columnNames);

                // Add table to a JScrollPane for scrolling
                JScrollPane tableScrollPane = new JScrollPane(sequenceStationTable);

                // Add the table to the frame
                sequenceStationFrame.add(tableScrollPane, BorderLayout.CENTER);
                sequenceStationFrame.setVisible(true);
            }
        });

        Schedules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new window for Trains
                JFrame schedulesFrame = new JFrame("Stations Information");
                schedulesFrame.setSize(800, 600);
                schedulesFrame.setBackground(Color.decode("#45C4B0"));
                schedulesFrame.setLocationRelativeTo(null);
                schedulesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Data for the JTable (dummy data)
                String[][] schedulesData = {

                };

                // Column names
                String[] columnNames = {"Schedule ID", "Train ID","Start Station ID","End Station ID","Arrival Time","Departure Time"};

                // Create JTable
                JTable schedulesTable = new JTable(schedulesData, columnNames);

                // Add table to a JScrollPane for scrolling
                JScrollPane tableScrollPane = new JScrollPane(schedulesTable);

                // Add the table to the frame
                schedulesFrame.add(tableScrollPane, BorderLayout.CENTER);
                schedulesFrame.setVisible(true);
            }
        });

        buttonPanel.add(Trains);
        buttonPanel.add(Stations);
        buttonPanel.add(SequenceStation);
        buttonPanel.add(Schedules);
        buttonPanel.add(Track);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel,BorderLayout.SOUTH );
        frame.setVisible(true);
    }

}