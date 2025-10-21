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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Berufsausbildung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsausbildungType()
 * @model extendedMetaData="name='BerufsausbildungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BerufsausbildungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Berufsbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Berufsbildung</em>' attribute.
	 * @see #isSetBerufsbildung()
	 * @see #unsetBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsausbildungType_Berufsbildung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='berufsbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBerufsbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berufsbildung</em>' attribute.
	 * @see #isSetBerufsbildung()
	 * @see #unsetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @generated
	 */
	void setBerufsbildung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @generated
	 */
	void unsetBerufsbildung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#isBerufsbildung <em>Berufsbildung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Berufsbildung</em>' attribute is set.
	 * @see #unsetBerufsbildung()
	 * @see #isBerufsbildung()
	 * @see #setBerufsbildung(boolean)
	 * @generated
	 */
	boolean isSetBerufsbildung();

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum</em>' attribute.
	 * @see #setZeitraum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsausbildungType_Zeitraum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getZeitraum <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' attribute.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit</em>' attribute.
	 * @see #setWochenstundenJeTaetigkeit(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBerufsausbildungType_WochenstundenJeTaetigkeit()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWochenstundenJeTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit</em>' attribute.
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeit(String value);

} // BerufsausbildungType
