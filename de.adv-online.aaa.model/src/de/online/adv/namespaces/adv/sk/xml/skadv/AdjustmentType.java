/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Adjustment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Der Aufzählungtyp Adjustment liefert Optionen für den Ausgleich von Linienmustern entlang der Geomentrie.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdjustmentType()
 * @model extendedMetaData="name='AdjustmentType'"
 * @generated
 */
@ProviderType
public enum AdjustmentType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es findet kein Musterausgleich statt.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Whole Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es findet ein Musterausgleich statt, so dass am Ende der Linie, genau vor Erreichen der nachlaufenden Lücke, ein Exemplar des Musters endet. 
	 * 
	 * Der Ausgleich wird erreicht durch gleichmäßige Verkürzung oder Verlängerung aller Musterbestandteile mit der Ausnahme von Texten. Letztere dürfen nur verlängert werden.
	 * 
	 * Das Verfahren für den Musterausgleich soll folgender Skizze genügen:
	 * 
	 * LS = Gesamtlänge der Striche (SolidSections) im Muster
	 * LG = Gesamtlänge der Lücken (Gaps) im Muster
	 * LT = Gesamtlänge der Texte (TextSection) im Muster
	 * LPRE = Länge der Vorlauflücke (PreGap)
	 * LPST = Länge  der Nachlauflücke (PostGap)
	 * LGEO = Gesamtlänge der Geometrie
	 * LGEOEFF = LGEO - LPRE - LPST [= effektiv zu bemusternde Länge]
	 * QIDEAL = LGEOEFF / (LS+LG+LT) [= ideale Anzahl, bei der das Muster in der Länge "aufgeht"]
	 * NLO = floor(QIDEAL) [= nächst kleinere ganzzahlige Approximation von QIDEAL]
	 * NHI = ceil(QIDEAL)  [= nächst größere ganzzahlige Aproximation von QIDEAL]
	 * Wenn NLO==NHI dann
	 *  N = NLO 
	 *  FSG = FT = 1.0
	 * Ansonsten
	 *  DLO = 1 - NLO*(LS+LG+LT)/LGEOEFF [= relativer Fehler beim Strecken des Musters]
	 *  DHI = NHI*(LS+LG)/(LGEOEFF-NHI*LT) - 1 [= relativer Fehler beim Stauchen des Musters]
	 *  Wenn DLO <= DHI dann
	 *    N = NLO
	 *    FSG = FT = LGEOEFF / (NLO*(LS+LG+LT))
	 *  Ansonsten
	 *    N = NHI
	 *    FSG = (LGEOEFF-NHI*LT) / (NHI*(LS+LG))
	 *    FT = 1.0
	 *  Ende
	 * Ende  
	 * 
	 * Die Ergebnisse sind:
	 * N = die Zahl der Musterwiederholungen
	 * FSG = der Faktor, der auf Lücken und Striche anzuwenden ist
	 * FT = der entsprechende Faktor für Textabschnitte.
	 * 
	 * Wenn keine Texte vorhanden sind (also PT==0), so entspricht das Verfahren der im bisherigen ATKIS-SK vorhandenen Positionierungsregel 111. Textabschnitte müssen anders behandelt werden, da sie nur gedehnt, aber nicht gestaucht werden können. 
	 * 
	 * Hinweis: Um das Verfahren als Programm einsetzen zu können, sind noch eine Reihe von Grenzfällen zu behandeln, die im Verfahren weggelassen wurden, um das Verständnis nicht durch Ausnahmebetrachtungen zu behindern. Z.B. muss sinnvoll auf das Ergebnis NLO==0 eingegangen werden.
	 * 
	 * Texte, deren Längen aus der Grafik selbst ermittelt werden, stellen ein besonderes Problem dar, denn typischerweise verändern sich diese Längen bei verschobener Platzierung. Hier muss die Software korrigierende Maßnahmen ergreifen, so dass trotzdem ein Ausgleich möglich ist. Es bietet sich z.B. ein iteratives Vorgehen an.
	 * <!-- end-model-doc -->
	 * @see #WHOLE_PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLE_PATTERN(1, "wholePattern", "wholePattern");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es findet kein Musterausgleich statt.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Whole Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es findet ein Musterausgleich statt, so dass am Ende der Linie, genau vor Erreichen der nachlaufenden Lücke, ein Exemplar des Musters endet. 
	 * 
	 * Der Ausgleich wird erreicht durch gleichmäßige Verkürzung oder Verlängerung aller Musterbestandteile mit der Ausnahme von Texten. Letztere dürfen nur verlängert werden.
	 * 
	 * Das Verfahren für den Musterausgleich soll folgender Skizze genügen:
	 * 
	 * LS = Gesamtlänge der Striche (SolidSections) im Muster
	 * LG = Gesamtlänge der Lücken (Gaps) im Muster
	 * LT = Gesamtlänge der Texte (TextSection) im Muster
	 * LPRE = Länge der Vorlauflücke (PreGap)
	 * LPST = Länge  der Nachlauflücke (PostGap)
	 * LGEO = Gesamtlänge der Geometrie
	 * LGEOEFF = LGEO - LPRE - LPST [= effektiv zu bemusternde Länge]
	 * QIDEAL = LGEOEFF / (LS+LG+LT) [= ideale Anzahl, bei der das Muster in der Länge "aufgeht"]
	 * NLO = floor(QIDEAL) [= nächst kleinere ganzzahlige Approximation von QIDEAL]
	 * NHI = ceil(QIDEAL)  [= nächst größere ganzzahlige Aproximation von QIDEAL]
	 * Wenn NLO==NHI dann
	 *  N = NLO 
	 *  FSG = FT = 1.0
	 * Ansonsten
	 *  DLO = 1 - NLO*(LS+LG+LT)/LGEOEFF [= relativer Fehler beim Strecken des Musters]
	 *  DHI = NHI*(LS+LG)/(LGEOEFF-NHI*LT) - 1 [= relativer Fehler beim Stauchen des Musters]
	 *  Wenn DLO <= DHI dann
	 *    N = NLO
	 *    FSG = FT = LGEOEFF / (NLO*(LS+LG+LT))
	 *  Ansonsten
	 *    N = NHI
	 *    FSG = (LGEOEFF-NHI*LT) / (NHI*(LS+LG))
	 *    FT = 1.0
	 *  Ende
	 * Ende  
	 * 
	 * Die Ergebnisse sind:
	 * N = die Zahl der Musterwiederholungen
	 * FSG = der Faktor, der auf Lücken und Striche anzuwenden ist
	 * FT = der entsprechende Faktor für Textabschnitte.
	 * 
	 * Wenn keine Texte vorhanden sind (also PT==0), so entspricht das Verfahren der im bisherigen ATKIS-SK vorhandenen Positionierungsregel 111. Textabschnitte müssen anders behandelt werden, da sie nur gedehnt, aber nicht gestaucht werden können. 
	 * 
	 * Hinweis: Um das Verfahren als Programm einsetzen zu können, sind noch eine Reihe von Grenzfällen zu behandeln, die im Verfahren weggelassen wurden, um das Verständnis nicht durch Ausnahmebetrachtungen zu behindern. Z.B. muss sinnvoll auf das Ergebnis NLO==0 eingegangen werden.
	 * 
	 * Texte, deren Längen aus der Grafik selbst ermittelt werden, stellen ein besonderes Problem dar, denn typischerweise verändern sich diese Längen bei verschobener Platzierung. Hier muss die Software korrigierende Maßnahmen ergreifen, so dass trotzdem ein Ausgleich möglich ist. Es bietet sich z.B. ein iteratives Vorgehen an.
	 * <!-- end-model-doc -->
	 * @see #WHOLE_PATTERN
	 * @model name="wholePattern"
	 * @generated
	 * @ordered
	 */
	public static final int WHOLE_PATTERN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Adjustment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdjustmentType[] VALUES_ARRAY =
		new AdjustmentType[] {
			NONE,
			WHOLE_PATTERN,
		};

	/**
	 * A public read-only list of all the '<em><b>Adjustment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdjustmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjustmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjustmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjustmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjustmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjustmentType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case WHOLE_PATTERN_VALUE: return WHOLE_PATTERN;
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
	private AdjustmentType(int value, String name, String literal) {
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
	
} //AdjustmentType
