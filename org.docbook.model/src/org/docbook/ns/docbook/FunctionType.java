/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getFunctionType()
 * @model extendedMetaData="name='function_._type'"
 * @generated
 */
@ProviderType
public enum FunctionType implements Enumerator {
	/**
	 * The '<em><b>Alt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(0, "alt", "alt"),

	/**
	 * The '<em><b>Backspace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	BACKSPACE(1, "backspace", "backspace"),

	/**
	 * The '<em><b>Command</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND(2, "command", "command"),

	/**
	 * The '<em><b>Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL(3, "control", "control"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(4, "delete", "delete"),

	/**
	 * The '<em><b>Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(5, "down", "down"),

	/**
	 * The '<em><b>End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(6, "end", "end"),

	/**
	 * The '<em><b>Enter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER(7, "enter", "enter"),

	/**
	 * The '<em><b>Escape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	ESCAPE(8, "escape", "escape"),

	/**
	 * The '<em><b>Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(9, "home", "home"),

	/**
	 * The '<em><b>Insert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(10, "insert", "insert"),

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(11, "left", "left"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(12, "meta", "meta"),

	/**
	 * The '<em><b>Option</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTION_VALUE
	 * @generated
	 * @ordered
	 */
	OPTION(13, "option", "option"),

	/**
	 * The '<em><b>Pagedown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGEDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PAGEDOWN(14, "pagedown", "pagedown"),

	/**
	 * The '<em><b>Pageup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGEUP_VALUE
	 * @generated
	 * @ordered
	 */
	PAGEUP(15, "pageup", "pageup"),

	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(16, "right", "right"),

	/**
	 * The '<em><b>Shift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	SHIFT(17, "shift", "shift"),

	/**
	 * The '<em><b>Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	SPACE(18, "space", "space"),

	/**
	 * The '<em><b>Tab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(19, "tab", "tab"),

	/**
	 * The '<em><b>Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(20, "up", "up"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(21, "other", "other");

	/**
	 * The '<em><b>Alt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model name="alt"
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 0;

	/**
	 * The '<em><b>Backspace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKSPACE
	 * @model name="backspace"
	 * @generated
	 * @ordered
	 */
	public static final int BACKSPACE_VALUE = 1;

	/**
	 * The '<em><b>Command</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND
	 * @model name="command"
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_VALUE = 2;

	/**
	 * The '<em><b>Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL
	 * @model name="control"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_VALUE = 3;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 4;

	/**
	 * The '<em><b>Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model name="down"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 5;

	/**
	 * The '<em><b>End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model name="end"
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 6;

	/**
	 * The '<em><b>Enter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER
	 * @model name="enter"
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_VALUE = 7;

	/**
	 * The '<em><b>Escape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE
	 * @model name="escape"
	 * @generated
	 * @ordered
	 */
	public static final int ESCAPE_VALUE = 8;

	/**
	 * The '<em><b>Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model name="home"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 9;

	/**
	 * The '<em><b>Insert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model name="insert"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 10;

	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model name="left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 11;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META
	 * @model name="meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 12;

	/**
	 * The '<em><b>Option</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTION
	 * @model name="option"
	 * @generated
	 * @ordered
	 */
	public static final int OPTION_VALUE = 13;

	/**
	 * The '<em><b>Pagedown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGEDOWN
	 * @model name="pagedown"
	 * @generated
	 * @ordered
	 */
	public static final int PAGEDOWN_VALUE = 14;

	/**
	 * The '<em><b>Pageup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGEUP
	 * @model name="pageup"
	 * @generated
	 * @ordered
	 */
	public static final int PAGEUP_VALUE = 15;

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model name="right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 16;

	/**
	 * The '<em><b>Shift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIFT
	 * @model name="shift"
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_VALUE = 17;

	/**
	 * The '<em><b>Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE
	 * @model name="space"
	 * @generated
	 * @ordered
	 */
	public static final int SPACE_VALUE = 18;

	/**
	 * The '<em><b>Tab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model name="tab"
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 19;

	/**
	 * The '<em><b>Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model name="up"
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 20;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 21;

	/**
	 * An array of all the '<em><b>Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FunctionType[] VALUES_ARRAY =
		new FunctionType[] {
			ALT,
			BACKSPACE,
			COMMAND,
			CONTROL,
			DELETE,
			DOWN,
			END,
			ENTER,
			ESCAPE,
			HOME,
			INSERT,
			LEFT,
			META,
			OPTION,
			PAGEDOWN,
			PAGEUP,
			RIGHT,
			SHIFT,
			SPACE,
			TAB,
			UP,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FunctionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType get(int value) {
		switch (value) {
			case ALT_VALUE: return ALT;
			case BACKSPACE_VALUE: return BACKSPACE;
			case COMMAND_VALUE: return COMMAND;
			case CONTROL_VALUE: return CONTROL;
			case DELETE_VALUE: return DELETE;
			case DOWN_VALUE: return DOWN;
			case END_VALUE: return END;
			case ENTER_VALUE: return ENTER;
			case ESCAPE_VALUE: return ESCAPE;
			case HOME_VALUE: return HOME;
			case INSERT_VALUE: return INSERT;
			case LEFT_VALUE: return LEFT;
			case META_VALUE: return META;
			case OPTION_VALUE: return OPTION;
			case PAGEDOWN_VALUE: return PAGEDOWN;
			case PAGEUP_VALUE: return PAGEUP;
			case RIGHT_VALUE: return RIGHT;
			case SHIFT_VALUE: return SHIFT;
			case SPACE_VALUE: return SPACE;
			case TAB_VALUE: return TAB;
			case UP_VALUE: return UP;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FunctionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FunctionType
