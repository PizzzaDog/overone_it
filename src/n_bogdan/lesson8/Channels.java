package n_bogdan.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Channels {
    public static void main(String[] args) {
        List<Channel> channels = createChannels();
        Map<String, List<Integer>> collect = channels.stream()
                .collect(Collectors.groupingBy(Channel::getInn,
                        Collectors.mapping(Channel::getChannelId, Collectors.toList())));
        System.out.println("Check");

    }

    private static List<Channel> createChannels() {
        List<Channel> channels = Arrays.asList(
                new Channel("123", 1),
                new Channel("123", 2),
                new Channel("123", 3),
                new Channel("124", 1),
                new Channel("124", 2),
                new Channel("000", 3)
        );
        return channels;
    }
}
