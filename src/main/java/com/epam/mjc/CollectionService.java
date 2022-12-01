package com.epam.mjc;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(l -> l.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return Optional.of(list.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return Optional.of(list.stream().flatMap(l -> l.stream()).mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new));

    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (val1, val2) -> val1 + val2);
    }
}
