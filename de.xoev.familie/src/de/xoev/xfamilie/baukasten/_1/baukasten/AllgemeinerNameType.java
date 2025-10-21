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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeiner Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Datentyp repräsentiert die gemeinsamen Eigenschaften von Vor- und Familiennamen nach deutschem Personenstandsrecht. Der Vor- oder Familienname wird in Form einer Zeichenkette in dem Kindelement name übermittelt, in der eventuell vorhandene und als Namenszusätze bekannte Bestandteile nicht gesondert ausgezeichnet oder abgetrennt werden. Die Modellierung von AllgemeinerName als Choice-Struktur erlaubt es, die Sonderfälle eines zu Recht fehlenden Vornamens oder Familiennamens zu übermitteln. Sofern bei einem ausländischen Namen kein Vorname gemäß deutscher Systematik vorhanden ist, bzw. der Familienname eines Kindes zu übermitteln ist, welches verstorben ist, ohne einen Familiennamen erhalten zu haben, wird statt des Kindelements name das Kindelement nichtVorhanden mit dem Wert true übermittelt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden <em>Nicht Vorhanden</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAllgemeinerNameType()
 * @model extendedMetaData="name='AllgemeinerNameType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeinerNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name ist der eigentliche Familien- oder Vorname als Zeichenkette. Nachnamen, z.B. mit Adelstiteln bzw. ausländische Nachnamen werden als ein Name übermittelt und nicht in verschiedene Bestandteile aufgeteilt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAllgemeinerNameType_Name()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nicht Vorhanden</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Kindelement ist immer dann anstelle des Kindelements name zu verwenden, wenn ein Vor- oder Familienname einer Person zurecht nicht vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nicht Vorhanden</em>' attribute.
	 * @see #isSetNichtVorhanden()
	 * @see #unsetNichtVorhanden()
	 * @see #setNichtVorhanden(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAllgemeinerNameType_NichtVorhanden()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='nichtVorhanden' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNichtVorhanden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden <em>Nicht Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nicht Vorhanden</em>' attribute.
	 * @see #isSetNichtVorhanden()
	 * @see #unsetNichtVorhanden()
	 * @see #isNichtVorhanden()
	 * @generated
	 */
	void setNichtVorhanden(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden <em>Nicht Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNichtVorhanden()
	 * @see #isNichtVorhanden()
	 * @see #setNichtVorhanden(boolean)
	 * @generated
	 */
	void unsetNichtVorhanden();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden <em>Nicht Vorhanden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nicht Vorhanden</em>' attribute is set.
	 * @see #unsetNichtVorhanden()
	 * @see #isNichtVorhanden()
	 * @see #setNichtVorhanden(boolean)
	 * @generated
	 */
	boolean isSetNichtVorhanden();

} // AllgemeinerNameType
