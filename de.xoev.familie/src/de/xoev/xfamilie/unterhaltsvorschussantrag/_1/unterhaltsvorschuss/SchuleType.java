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

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Schulbesuch des Antragskindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getMonatVoraussichtlicherAbschlussSchule <em>Monat Voraussichtlicher Abschluss Schule</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getTatsacheMitNachweis <em>Tatsache Mit Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getSchulabschluss <em>Schulabschluss</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSchuleType()
 * @model extendedMetaData="name='SchuleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SchuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Monat Voraussichtlicher Abschluss Schule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Abschluss. Regel: Falls Tatsache Schule vorliegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monat Voraussichtlicher Abschluss Schule</em>' attribute.
	 * @see #setMonatVoraussichtlicherAbschlussSchule(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSchuleType_MonatVoraussichtlicherAbschlussSchule()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.JahrMonatType"
	 *        extendedMetaData="kind='element' name='monatVoraussichtlicherAbschlussSchule' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMonatVoraussichtlicherAbschlussSchule();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getMonatVoraussichtlicherAbschlussSchule <em>Monat Voraussichtlicher Abschluss Schule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monat Voraussichtlicher Abschluss Schule</em>' attribute.
	 * @see #getMonatVoraussichtlicherAbschlussSchule()
	 * @generated
	 */
	void setMonatVoraussichtlicherAbschlussSchule(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tatsache Mit Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Schule mit Möglichkeit einen Nachweis zu verschicken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tatsache Mit Nachweis</em>' containment reference.
	 * @see #setTatsacheMitNachweis(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSchuleType_TatsacheMitNachweis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tatsacheMitNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getTatsacheMitNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getTatsacheMitNachweis <em>Tatsache Mit Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tatsache Mit Nachweis</em>' containment reference.
	 * @see #getTatsacheMitNachweis()
	 * @generated
	 */
	void setTatsacheMitNachweis(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Schulabschluss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welchen Schulabschluss wird das Kind voraussichtlich erhalten?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schulabschluss</em>' attribute.
	 * @see #setSchulabschluss(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSchuleType_Schulabschluss()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='schulabschluss' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchulabschluss();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType#getSchulabschluss <em>Schulabschluss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schulabschluss</em>' attribute.
	 * @see #getSchulabschluss()
	 * @generated
	 */
	void setSchulabschluss(String value);

} // SchuleType
