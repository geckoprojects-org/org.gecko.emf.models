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
 * A representation of the model object '<em><b>Unterhaltszahlungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu Unterhaltszahlungen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getZeitpunktDerZahlung <em>Zeitpunkt Der Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getHoeheDerZahlung <em>Hoehe Der Zahlung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltszahlungenType()
 * @model extendedMetaData="name='UnterhaltszahlungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnterhaltszahlungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitpunkt Der Zahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Zeitpunkt der Zahlungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitpunkt Der Zahlung</em>' containment reference.
	 * @see #setZeitpunktDerZahlung(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltszahlungenType_ZeitpunktDerZahlung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zeitpunktDerZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getZeitpunktDerZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getZeitpunktDerZahlung <em>Zeitpunkt Der Zahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitpunkt Der Zahlung</em>' containment reference.
	 * @see #getZeitpunktDerZahlung()
	 * @generated
	 */
	void setZeitpunktDerZahlung(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Hoehe Der Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Höhe der Zahlungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Der Zahlung</em>' attribute.
	 * @see #setHoeheDerZahlung(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getUnterhaltszahlungenType_HoeheDerZahlung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='hoeheDerZahlung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHoeheDerZahlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType#getHoeheDerZahlung <em>Hoehe Der Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Der Zahlung</em>' attribute.
	 * @see #getHoeheDerZahlung()
	 * @generated
	 */
	void setHoeheDerZahlung(String value);

} // UnterhaltszahlungenType
