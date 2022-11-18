import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int maxCountContainersInTrack = 12;
        final int maxCountBoxesInContainer = 27;
        final int maxCountBoxesInTrack = maxCountBoxesInContainer * maxCountContainersInTrack;
        int tracksCount = 0;
        int containersCount = 0;

        System.out.println("Please enter count of boxes:");
        Scanner scanner = new Scanner(System.in);

        int boxCount = scanner.nextInt();

        if (boxCount == 0) {

        } else if (boxCount < maxCountBoxesInContainer) {
            containersCount++;
            tracksCount++;
            System.out.println("Грузовик: " + tracksCount + System.lineSeparator() +
                    "\tКонтейнер: " + containersCount);
        } else if (boxCount >= maxCountBoxesInContainer) {
            containersCount++;
            tracksCount++;
            System.out.println("Грузовик: " + tracksCount + System.lineSeparator() +
                    "\tКонтейнер: " + containersCount);
        }

        for (int i = 1; i <= boxCount; i++)
        {
            System.out.println("\t\tЯщик: " + i);
            if (i % maxCountBoxesInTrack == 0)
            {
                tracksCount++;
                System.out.println("Грузовик: " + tracksCount);
            }

            if (i % maxCountBoxesInContainer == 0)
            {
                if (i != boxCount)
                {
                    containersCount++;
                    System.out.println("\tКонтейнер: " + containersCount);
                }
            }
        }

        System.out.println("Count of tracks = " + tracksCount);
        System.out.println("Count of containers = " + containersCount);
    }
}