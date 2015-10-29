package com.learninghorizon.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class is a static factory for frequently used Collections.
 * */
public class CollectionsFactory {

	public static <E> Stack<E> newStack() {
		return new Stack<E>();
	}

	public static <E> HashSet<E> newHashSet() {
		return new HashSet<E>();
	}

	public static <E> HashSet<E> newHashSet(Set<E> set) {
		return new HashSet<E>(set);
	}

	public static <E> LinkedHashSet<E> newLinkedHashSet() {
		return new LinkedHashSet<E>();
	}

	public static <E> LinkedHashSet<E> newLinkedHashSet(Set<E> set) {
		return new LinkedHashSet<E>(set);
	}
	
	public static <E> ArrayList<E> newArrayList() {
		return new ArrayList<E>();
	}
	
	public static <E> ArrayList<E> newArrayList(Collection<? extends E> collection) {
		return new ArrayList<E>(collection);
	}

	public static <K, V> HashMap<K, V> newHashMap() {
		return new HashMap<>();
	}

	public static <K, V> HashMap<K, V> newHashMap(Map<K, V> map) {
		return new HashMap<>(map);
	}

	public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap() {
		return new ConcurrentHashMap<>();
	}

	public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(Map<K, V> map) {
		return new ConcurrentHashMap<>(map);
	}

	public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
		return new LinkedHashMap<>();
	}

	public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<K, V> map) {
		return new LinkedHashMap<>(map);
	}
}