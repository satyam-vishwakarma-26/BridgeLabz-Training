package com.linkedlist.DoublyLinkedList.UndoRedoInTextEditor;

public class TextEditorApp {

	public static void main(String[] args) {

		UndoRedoManager editor = new UndoRedoManager();

		editor.addState("Hello");
		editor.addState("Hello World");
		editor.addState("Hello World!");
		editor.addState("Hello World! Java");

		editor.displayCurrent();

		editor.undo();
		editor.displayCurrent();

		editor.undo();
		editor.displayCurrent();

		editor.redo();
		editor.displayCurrent();

		editor.addState("Hello World! Java Programming");
		editor.displayCurrent();

		editor.redo(); //should not redo
	}
}

