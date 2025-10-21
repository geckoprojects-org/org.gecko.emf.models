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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Optional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Namen des anderen Elternteil, falls nur Teilinformationen vorliegen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getVornamen <em>Vornamen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getNameOptionalType()
 * @model extendedMetaData="name='Name.OptionalType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NameOptionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird der aktuelle Familienname einer Person in unstrukturierter Form übermittelt. Wenn es sich bei dem Namen um einen Blocknamen handelt, wird der vollständige Name als Nachname der Person übermittelt, während für den Vornamen statt einer Zeichenkette das Kindelement nichtVorhanden verwendet wird, um auszudrücken, dass die Person zu Recht keinen Vornamen führt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienname Unstrukturiert</em>' containment reference.
	 * @see #setFamiliennameUnstrukturiert(AllgemeinerNameType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getNameOptionalType_FamiliennameUnstrukturiert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='familienname.unstrukturiert' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getFamiliennameUnstrukturiert();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienname Unstrukturiert</em>' containment reference.
	 * @see #getFamiliennameUnstrukturiert()
	 * @generated
	 */
	void setFamiliennameUnstrukturiert(AllgemeinerNameType value);

	/**
	 * Returns the value of the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird der Geburtsname einer Person in unstrukturierter Form übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsname Unstrukturiert</em>' containment reference.
	 * @see #setGeburtsnameUnstrukturiert(AllgemeinerNameType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getNameOptionalType_GeburtsnameUnstrukturiert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsname.unstrukturiert' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getGeburtsnameUnstrukturiert();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsname Unstrukturiert</em>' containment reference.
	 * @see #getGeburtsnameUnstrukturiert()
	 * @generated
	 */
	void setGeburtsnameUnstrukturiert(AllgemeinerNameType value);

	/**
	 * Returns the value of the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element werden die Vornamen der Person übermittelt. Alle Vornamen sind - durch Leerzeichen getrennt - im Kindelement name anzugeben; in der Reihenfolge, wie sie in einer deutschen Personenstandsurkunde eingetragen sind. Bei Ausländern ohne deutsche Personenstandsurkunde ist die Eintragung im Pass maßgebend. Das Kindelement name darf nur fehlen, wenn durch den Schalter nichtVorhanden angezeigt wird, dass ein Vorname zu Recht nicht vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vornamen</em>' containment reference.
	 * @see #setVornamen(AllgemeinerNameType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getNameOptionalType_Vornamen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vornamen' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getVornamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType#getVornamen <em>Vornamen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vornamen</em>' containment reference.
	 * @see #getVornamen()
	 * @generated
	 */
	void setVornamen(AllgemeinerNameType value);

} // NameOptionalType
