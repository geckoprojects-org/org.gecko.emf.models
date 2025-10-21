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

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bezug Uv Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten für den früheren Unterhaltsvorschussbezug.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBezugsJugendamt <em>Bezugs Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBisWann <em>Bis Wann</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBezugUvKindType()
 * @model extendedMetaData="name='BezugUv.KindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BezugUvKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezugs Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Jugendamt, bei dem Unterhaltsvorschuss bezogen wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezugs Jugendamt</em>' attribute.
	 * @see #setBezugsJugendamt(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBezugUvKindType_BezugsJugendamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='bezugsJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezugsJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBezugsJugendamt <em>Bezugs Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezugs Jugendamt</em>' attribute.
	 * @see #getBezugsJugendamt()
	 * @generated
	 */
	void setBezugsJugendamt(String value);

	/**
	 * Returns the value of the '<em><b>Bis Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, bis wann Unterhaltsvorschuss bezogen wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bis Wann</em>' containment reference.
	 * @see #setBisWann(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBezugUvKindType_BisWann()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bisWann' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getBisWann();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType#getBisWann <em>Bis Wann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bis Wann</em>' containment reference.
	 * @see #getBisWann()
	 * @generated
	 */
	void setBisWann(TeilbekanntesDatumType value);

} // BezugUvKindType
